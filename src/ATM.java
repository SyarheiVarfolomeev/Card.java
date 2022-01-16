import java.math.BigDecimal;
import java.util.Objects;
import Exception.InsufficientFundsException;
import Exception.InvalidDataException;

public class ATM {
    private Card card;

    public ATM(Card card) {
        validateInputDate(card);
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

    public BigDecimal  exchangeATM(BigDecimal  rate) {
        return card.exchange(rate);
    }

    private void validateInputDate(Card card) {
        if (card == null) {
            throw new InvalidDataException("Card is null");
        }
    }

    @Override
    public String toString() {
        return "ATM{" +
                "card=" + card +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ATM atm = (ATM) o;
        return Objects.equals(card, atm.card);
    }

    @Override
    public int hashCode() {
        return Objects.hash(card);
    }
}
