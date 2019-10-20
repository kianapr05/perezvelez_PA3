public class SavingsAccount {
    private static float annualInterestRate;
    private float savingsBalance;

    public SavingsAccount(float v){
        savingsBalance = v;
    }

    public float calculateMonthlyInterest() {
        float monthly;

        monthly = savingsBalance * ((annualInterestRate / 100) / 12);
        savingsBalance = savingsBalance + monthly;

        return savingsBalance;
    }

    public static void modifyInterestRate(float rate){
        annualInterestRate = rate;
    }

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        SavingsAccount.modifyInterestRate(4);
        System.out.println("------------------------------------");
        System.out.println("Interest rate is at " + annualInterestRate + "%.");
        System.out.println("------------------------------------");
        int a = 0;

        while (a < 12){

            System.out.printf("Balance after " + (a + 1) + " month(s) for saver1: $%.2f", saver1.calculateMonthlyInterest());
            System.out.println("");
            System.out.printf("Balance after " + (a + 1) + " month(s) for saver2: $%.2f", saver2.calculateMonthlyInterest());
            System.out.println("");
            System.out.println("");
            a += 1;
        }
        System.out.println("------------------------------------");

        SavingsAccount.modifyInterestRate(5);
        System.out.println("Interest rate is at " + annualInterestRate + "%.");
        System.out.println("------------------------------------");

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("Balance after 13 month(s) for saver1: $%.2f", saver1.calculateMonthlyInterest());
        System.out.println("");
        System.out.printf("Balance after 13 month(s) for saver2: $%.2f", saver2.calculateMonthlyInterest());
        System.out.println("");

    }
}
