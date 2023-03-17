import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise3();
    }

    /**
     * 1: Write code and fix the program below, you want to accept the questionableFunds
     * into the account!
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        int myBankBalanceEuro = 500;

        String suspiciousEmailMessage =
                """
                            Hello Sir/Madam,
                            
                            I'm a prince here in [redacted] and I need help transferring my billions into 
                            Italy, please provide your bank account details and I will pay you generously.
                            
                            Thanks
                """;

        long questionableFundsEuro = 5_000_000_000l;

        //Add the questionable funds to your bank balance and print it out!

        //We convert our Bank Balance from int to long
        long myBankBalanceEuroToLong = Integer.valueOf(myBankBalanceEuro);
        //We add the questionable Founds to our bank balance converted and print it
        System.out.println(myBankBalanceEuroToLong + questionableFundsEuro);

    }

    /**
     * 2: Given the following information, think about the MOST EFFICIENT (which uses least space)
     *    type to use to store such data. Why is this the most efficient?
     *
     *    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     *    double = 16 decimal places
     *    float = 7 decimal places
     *    int = -2,147,483,648 to 2,147,483,647
     *    short = -32,768 to 32,768
     *    byte = -127 to 127
     *
     *    2a: Someone's age -> byte because is extremely unusual live more than 127 y.o.
     *    2b: The age of a baby in months -> Again we need really short numbers.
     *    2c: Money in a hedgefund in euros -> Long we can reach billions,so we're gonna need it for largest numbers.
     *    2d: Price of a good in euros on amazon.com -> int is enaugh for this.
     *    2e: The exact weight of an apple measured by scientific equipment -> Float because we need to be really specific.
     *    2f: The number of kilometers from any 2 places in the world -> int because values for the Earth's circumference and radius,
     *                                                                        40,070 km and 6378 km respectively
     */

    /**
     * 3: Use the LOCALDATE type (LocalDate.now()) to print out the current date
     * <p>
     * Play around with local date! What can you get it to do?
     * Use at least the following methods on myDate().
     * * getDayOfMonth()
     * * getDayOfWeek()
     * * getDayOfYear()
     * * getMonth()
     * * getMonthValue()
     * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
     * create other days
     */
    public static void exercise3() {
        System.out.println("Exercise 3:");

        LocalDate now = LocalDate.now();

        System.out.println(now.getDayOfMonth());

        System.out.println(now.getDayOfWeek());

        System.out.println(now.getDayOfYear());

        System.out.println(now.getMonth());

        System.out.println(now.getMonthValue());

        System.out.println(now.isBefore(LocalDate.of(1996, Month.MAY, 4)));

        System.out.println(now.isAfter(LocalDate.of(1970, Month.AUGUST, 23)));

    }
}
