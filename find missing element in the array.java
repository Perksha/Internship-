import java.util.*;
class HelloWorld {
    public static int find(int[] arr){
        int n=arr.length;
        int bin=n*(n+1)/2;
        int sum=0;
        for(int v:arr){
            sum+=v;
        }
        return bin-sum;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array element:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(find(arr));
        
    }
}
