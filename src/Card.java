import java.math.BigDecimal;
import java.util.Objects;

public abstract class Card {

    private String name;
    protected BigDecimal balance;

    public Card(String name) {
        this.name = name;
    }

    public Card(String name, BigDecimal  balance) {
        this.name = name;
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public BigDecimal  getBalance() {
        return balance;
    }

    public void add(BigDecimal  money){
        balance = balance.add(money);
    }

    public abstract void subtractMoney(BigDecimal  money) throws InsufficientFundsException;

    public BigDecimal  exchange(BigDecimal  rate){
        return balance.multiply(rate);
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(name, card.name) && Objects.equals(balance, card.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, balance);
    }
}
