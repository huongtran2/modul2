import java.util.Scanner;

public class namnhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("nhập năm");
        year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year%400==0) {
            System.out.println("là năm nhuận");
        } else {
            System.out.println("không là năm nhuận");
        }
    }
}