import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        Card mason = new DebitCard("Mason", new BigDecimal("100"));

        ATM atm1 = new ATM(mason);
        atm1.addATM(BigDecimal.valueOf(10.50));
        System.out.println(mason);

    }
}
