public class EnLoop{
    public static void main(String[] args){
        int[] arr ={2,5,61,9,7,4,15,85,55,6};
        int sum=0;
        for(int each : arr){
            sum+=each;
        }
        System.out.println("sum of array:  "+sum);
    }
}