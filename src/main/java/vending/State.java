package vending;

public interface State {
    void selectItem(String selection);

    void insertMoney(int value);

    void executeTransaction();

    int cancelTransaction();

    String toString();
}
