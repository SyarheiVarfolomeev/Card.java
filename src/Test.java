import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {

        Card mason = new DebitCard("Mason", new BigDecimal("100"));
        Card tom = new  CreditCard("Tom");

        ATM atm1 = new ATM(mason);
        atm1.addATM(BigDecimal.valueOf(10.50));
        atm1.subtractMoneyATM(BigDecimal.valueOf(52.52));
        System.out.println(atm1.exchangeATM(BigDecimal.valueOf(2.5)));
        System.out.println(mason);
        System.out.println(atm1);

        ATM atm2 = new ATM(tom);
        atm2.addATM(BigDecimal.valueOf(10.50));
        atm2.subtractMoneyATM(BigDecimal.valueOf(52.52));
        System.out.println(atm2.exchangeATM(BigDecimal.valueOf(2.5)));
        System.out.println(tom);
        System.out.println(atm2);
    }
}
