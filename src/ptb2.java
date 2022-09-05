import java.util.Scanner;

import static java.lang.Math.sqrt;

public class ptb2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf(" tính số ngày trong tháng ");
        int a = scanner.nextInt();
        if (a%2==0 && a!=2){
                System.out.println(30);
        } else if (a==2) {
            System.out.println("28 hoặc 29");
        } else if (a%2 !=0) {
            System.out.println(31);

        }

    }
    }
