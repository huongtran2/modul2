import java.util.Arrays;

public class daonguocmang {
    public static void main(String[] args) {
     int[]arr = new int[]{1,3,5,7};
     int i;
     int j;
     for (  i=0,j=arr.length-1;i<j;i++,j--){
       int arr1=arr[i];
       arr[i]=arr[j];
       arr[j]=arr1;
     }
     for (i=0;i< arr.length;i++){
         System.out.println(Arrays.toString(arr));
     }
    }
}
