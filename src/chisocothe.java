import java.util.Scanner;

public class chisocothe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Nhập số cân:");
        weight = scanner.nextDouble();
        System.out.print("Nhập chiều cao");
        height = scanner.nextDouble();
        bmi = weight / (2 * height);
//        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18) {
            System.out.printf("gầy");
        } else if (bmi < 25.0) {
            System.out.printf("bt");
        } else if (bmi < 30.0) {
            System.out.printf("béo");
        } else {
            System.out.printf("rất béo");
        }
    }
}


