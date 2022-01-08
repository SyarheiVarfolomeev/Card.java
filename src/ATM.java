import java.math.BigDecimal;

public class ATM {
    private Card card;


    public ATM(Card card) {
        this.card = card;

    }

    public void addATM(BigDecimal money){
        card.add(money);
    }

    public void subtractMoneyATM(BigDecimal money) {
        try {
            card.subtractMoney(money);
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }
    }

}
