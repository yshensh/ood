package vending;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private String currentSelectedItem;
    private int currentInsertedMoney;
    private AbstractState state;
    private final NoSelectionState noSelectionState;
    private final HasSelectionState hasSelectionState;
    private final InsertedMoneyState insertedMoneyState;
    private final Map<String, Integer> itemPrice;

    public VendingMachine() {
        currentInsertedMoney = 0;
        currentSelectedItem = null;
        noSelectionState = new NoSelectionState(this);
        hasSelectionState = new HasSelectionState(this);
        insertedMoneyState = new InsertedMoneyState(this);
        state = noSelectionState;

        itemPrice = new HashMap<>();
        itemPrice.put("Coke", 199);
        itemPrice.put("Sprite", 299);
        itemPrice.put("MountainDew", 399);
    }

    public String getSelectedItem() {
        return currentSelectedItem;
    }

    public void setSelectedItem(String item) {
        this.currentSelectedItem = item;
    }

    public void insertMoney(int amount) {
        this.currentInsertedMoney += amount;
    }

    public void emptyInsertedMoney() {
        this.currentInsertedMoney = 0;
    }

    public int getInsertedMoney() {
        return currentInsertedMoney;
    }

    public int getSalePrice() {
        if (currentSelectedItem == null) {
            System.out.println("Please make a selection before asking price");
            return 0;
        } else {
            return itemPrice.get(currentSelectedItem);
        }
    }

    public void changeToNoSelectionState() {
        state = noSelectionState;
    }

    public void changeToHasSelectionState() {
        state = hasSelectionState;
    }

    public void changeToInsertedMoneyState() {
        state = insertedMoneyState;
    }

    public void selectItem(String selection) {
        state.selectItem(selection);
    }

    public void addMoney(int value) {
        state.insertMoney(value);
    }

    public void executeTransaction() {
        state.executeTransaction();
    }

    public int cancelTransaction() {
        return state.cancelTransaction();
    }

    public String printState() {
        String res = "";

        res = "Current selection is: " + currentSelectedItem + ", current inserted money: " + currentInsertedMoney
                + ", current state is : " + state;

        return res;
    }
}
