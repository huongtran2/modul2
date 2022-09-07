public class themptvaomang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = new int[arr.length + 1];
        for (int i = 0; i < arr1.length; i++) {
            if (i < 2) {
                arr1[i] = arr[i];
            } else if (i == 2) {
                arr1[i] = 6;
            } else {
                arr1[i] = arr[i - 1];
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

    }
}
