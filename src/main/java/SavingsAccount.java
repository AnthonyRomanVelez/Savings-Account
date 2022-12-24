
public class SavingsAccount {
    static private double annualInterestRate;
    private double savingsBalance;
    
    public SavingsAccount(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }
    public double getSavingsAccount(){
        return savingsBalance;
    }
    
    public void calculateMonthlyInterest(){
        double monthlyInterest;
        monthlyInterest = savingsBalance * annualInterestRate / 12;
        savingsBalance+=monthlyInterest;
    }
    public static void modifyInterestRate(double newAnnualInterestRate){
        annualInterestRate = newAnnualInterestRate;
    }
    public static void main(String[] args){
        SavingsAccount saver1;
        SavingsAccount saver2;
        saver1 = new SavingsAccount(2000.0);
        saver2 = new SavingsAccount(3000.0);
        
        SavingsAccount.modifyInterestRate(0.04);
        
        System.out.println("Balance for saver1: with 4% ");
        for(int i=0; i<12;i++){
        saver1.calculateMonthlyInterest();
        System.out.println("Month " + (i+1)+" : $ "+ String.format("%.2f",saver1.getSavingsAccount()));
        }
        System.out.println("\nBalance for saver2: with 4%");
        for(int i=0; i<12;i++){
        saver2.calculateMonthlyInterest();
        System.out.println("Month " + (i+1)+" : $ "+ String.format("%.2f",saver2.getSavingsAccount()));
        }
        SavingsAccount.modifyInterestRate(0.05);
        
        System.out.println("\nBalance for saver1: with 5% ");
        for(int i=0; i<12;i++){
        saver1.calculateMonthlyInterest();
        System.out.println("Month " + (i+1)+" : $ "+ String.format("%.2f",saver1.getSavingsAccount()));
        }
        System.out.println("\nBalance for saver2: with 5%");
        for(int i=0; i<12;i++){
        saver2.calculateMonthlyInterest();
        System.out.println("Month " + (i+1)+" : $ "+ String.format("%.2f",saver2.getSavingsAccount()));
        }
    }
}
