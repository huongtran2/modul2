public class gopmang {
    public static void main(String[] args) {
        int[]arr ={1,2,3,4};
        int[]arr1 ={5,6,7,8,5,7,8,9};
        int[]arr2=new int[arr.length +arr1.length];
        for (int i=0;i<arr.length;i++){
            if(i<arr.length){
                arr2[i]=arr[i];
            }
        }for (int j=0;j<arr1.length;j++){
            arr2[j+arr.length]=arr1[j];

        }for (int i=0;i<arr2.length;i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
