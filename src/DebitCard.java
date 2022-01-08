import java.math.BigDecimal;

public class DebitCard extends Card{
    public DebitCard(String name, BigDecimal balance){
        super(name, balance);
    }

    public DebitCard(String name){
        super(name);
    }

    @Override
    public void subtractMoney(BigDecimal  money) throws InsufficientFundsException {
        if (balance.compareTo(money) >= 0) {
            balance = balance.subtract(money);
        } else {

            throw new InsufficientFundsException("Недостаточно средств");

        }
    }



}
