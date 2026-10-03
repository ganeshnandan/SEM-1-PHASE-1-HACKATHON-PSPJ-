import java.util.Scanner;

public class TotalWaterUsage {

    public static int calculateTotal(int morningUsage, int eveningUsage) {
        int totalUsage = morningUsage + eveningUsage;
        return totalUsage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter morning water usage (litres): ");
        int morning = sc.nextInt();

        System.out.print("Enter evening water usage (litres): ");
        int evening = sc.nextInt();

        int totalUsage = calculateTotal(morning, evening);

        System.out.println("Total Water Consumption: " + totalUsage + " litres");

        sc.close();
    }
}