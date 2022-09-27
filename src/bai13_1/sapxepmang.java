package bai13_1;

import java.util.Scanner;

public class sapxepmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử mảng :");
        int sopt = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[sopt];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập số phần tử tại vị trí i");
            int so = scanner.nextInt();
            arr[i] = so;

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.println(arr[i]);
        }

        int vtri = binarySearch(arr, 0, sopt-1, 5);
        System.out.println("kq = " + vtri);
    }

    public static int binarySearch(int[] arr, int left, int right, int value) {
        if(left > right) return -1;
        int middle = (left + right) / 2;

        if (arr[middle] == value) {
            return middle;
        }
        if (value > arr[middle]) {
            left = middle + 1;
            return binarySearch(arr,left, right,value);
        }
        if (value < arr[middle]) {
            right = middle - 1;
        }
        return binarySearch(arr,left,right,value);

    }


}
