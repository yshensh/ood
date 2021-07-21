package blackjack;

public class Dealer {
    private Game game;
    private Hand hand;
    private int bets;

    public Dealer() {
        hand = new Hand();
        bets = 10000;
    }

    public void insertCard(Card card) {
        hand.insertCard(card);
    }

    public boolean largerThan(Player p) {
        return hand.getBestValue() >= p.getBestValue();
    }

    public void updateBets(int amount) {
        bets += amount;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void dealNextCard() {
        insertCard(game.dealNextCard());
    }

    public String printDealer() {
        return "Dealer " + hand.printHand() + ", total bets: " + bets + "\n";
    }
}
