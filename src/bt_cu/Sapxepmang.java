package bt_cu;

public class Sapxepmang {
    public static void main(String[] args) {
        int[]arr= {1,3,2,6,4,8,5};
        for (int i = 0; i< arr.length; i++){
            for (int j = i+1; j< arr.length; j++){
                if(arr[i]> arr[j]){
                    int tmp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= tmp;
                }
            }System.out.print(arr[i] +" , ");
        }

    }

}
