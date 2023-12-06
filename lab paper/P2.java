public class P2 {
    public static void main(String[] args) {
        int arr[] = {100,90,3,4,90,5,6,4,89};
        int min, max;
        if(arr[0]<arr[1]){
            min = arr[0];
            max = arr[1];
        }
        else{
            max = arr[0];
            min = arr[1];
        }

        for(int i = 2; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max =  arr[i];
            }
          
        }

        System.out.println("min "+min);
        System.out.println("max "+max);
 
    }
}
