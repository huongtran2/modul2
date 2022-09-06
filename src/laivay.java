import java.util.Scanner;

public class laivay {
    public static void main(String[] args) {
        double money =1.0 ;
        int thang = 1;
        double lai= 1.2 ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so tien ");
        money = scanner.nextDouble();
        System.out.println("nhap so lai");
        lai = scanner.nextDouble();
        System.out.println("nhap so thang");
        thang = scanner.nextInt();
        double tonglai =0;
        for (int i = 0; i <thang; i++){
            tonglai += money * (lai/100)/12;
            money += money *(lai/100)/12;
        }
        System.out.println(tonglai);

    }
}
