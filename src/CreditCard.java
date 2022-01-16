import java.math.BigDecimal;

public class CreditCard extends Card{

    public CreditCard(String name, BigDecimal balance){
        super(name, balance);
    }

    public CreditCard(String name){
        super(name);
    }

    @Override
    public void subtractMoney(BigDecimal money) {
        balance = balance.subtract(money);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
