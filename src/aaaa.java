import java.util.Scanner;

public class aaaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf(" tính số ngày trong tháng ");
        int a = scanner.nextInt();
        switch (a) {
            case 2:
                System.out.print("The month '2' has 28 or 29 days!");
            case 1,3,5,7,9,11:
                System.out.print(31);
                break;
            case 4,6,8,10,12:
                System.out.print("The month '" + a + "' has 30 days!");
                break;

        }
    }
}