import java.util.Scanner;

public class MoneyLending {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter money your send: ");
        double money=scanner.nextDouble();
        System.out.println("interest rate(%):");
        double rate=scanner.nextDouble();
        System.out.println("Enter month you send:");
        int month=scanner.nextInt();
        double profitAmount=money*(rate/12)*month;
        System.out.println(profitAmount);
    }
}
