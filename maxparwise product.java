import java.util.Scanner;
import java.util.Arrays;
class HelloWorld {
    public static int Maxparwise(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
         int m1=arr[n-1];
         int m2=arr[n-2];
         int pro=m1*m2;
         return pro;
            }
        

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(Maxparwise(arr));
    }
}
