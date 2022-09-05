import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Modul2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so b: ");
        int b = scanner.nextInt();
        System.out.print("nhap so c: ");
        int c = scanner.nextInt();
        System.out.print("nhap so a: ");
        int a = scanner.nextInt();
//        int b=7;
//        int c=1;
//        int a = 5;
//        int (a*x*x) +(b*x) +c =0;
        double S = (b*b) -(20*c);
     if (S<0){
       System.out.println("vô nghiệm");
   } else if (S==0) {
       System.out.println("x1 = x2 = " + -b/(2*a));
   }else{
       System.out.println("x1 = " + (-b+sqrt(S))/10 + "  , x2 = "+ (-b - sqrt(S))/10);

        }
    }
}
