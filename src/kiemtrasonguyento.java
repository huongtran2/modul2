import java.util.Scanner;

public class kiemtrasonguyento {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        int a = b.nextInt();
        int kt = 1;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                kt = 0;
                break;
            }
        }
        if (kt == 1) {
            System.out.println(a + " la so nguyen to");
        } else {
            System.out.println(a + " khong la so nguyen to");
        }
    }
}