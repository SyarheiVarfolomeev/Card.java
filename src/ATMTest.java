import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class ATMTest {
    Card mason = new DebitCard("Mason", new BigDecimal(100));
    Card tom = new CreditCard("Tom", new BigDecimal(50));
    ATM atm1 = new ATM(mason);
    ATM atm2 = new ATM(tom);
    BigDecimal money = BigDecimal.valueOf(20);
    BigDecimal  rate = BigDecimal.valueOf(2.5);

    @Test
    public void exchangeATM() {
        double expected = atm1.exchangeATM(rate).doubleValue();
        double actual = 250;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void addATM() {
       atm1.addATM(money);
        double expected = mason.getBalance().doubleValue();
        double actual = 120;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void subtractMoneyATM() {
        atm2.subtractMoneyATM(money);
        double expected = tom.getBalance().doubleValue();
        double actual = 30;
        Assert.assertEquals(expected, actual, 0);
    }
}