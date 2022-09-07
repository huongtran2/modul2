public class xoapttrongmang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr1 = new int[arr.length - 1];
        for (int i = 0; i < arr1.length; i++) {
            if (i < 3) {
                arr1[i] = arr[i];
            } else if (i >= 3) {
                arr1[i] = arr[i + 1];
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
