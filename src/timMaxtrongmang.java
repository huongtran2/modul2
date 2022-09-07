import java.util.Scanner;

public class timMaxtrongmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,-3,2,3,4,5,6};
        int Max = arr[0];
        for (int i=0; i<arr.length; i++){
            if (Max < arr[i]) {
                Max = arr[i];
            }
        }System.out.println(Max);
    }
}
