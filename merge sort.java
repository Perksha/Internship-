import java.util.Scanner;
class HelloWorld {
    public static void mergesort(int[] arr,int i,int j){
        if(i==j) return;
        int mid=(i+j)/2;
        mergesort(arr,i,mid);
        mergesort(arr,mid+1,j);
        merge(arr,i,mid,j);
        
    }
    public static void merge(int arr[],int i,int mid,int j){
        int p1=i,p2=mid+1,e1=mid,e2=j;
        int y=i;
        int[] b=new int[arr.length]; 
        while(p1<=e1&&p2<=e2){
            if(arr[p1]<arr[p2]){
                b[y]=arr[p1];
                y++;
                p1++;
            }else{
                b[y]=arr[p2];
                p2++;
                y++;
            }
        }
        while(p1<=e1){
            b[y]=arr[p1];
            y++;
            p1++;
        }
        while(p2<=e2){
            b[y]=arr[p2];
            y++;
            p2++;
        }
        for(int r=i;r<=j;r++){
            arr[r]=b[r];
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Sorted array");
        mergesort(arr,0,n-1);
        for(int j=0;j<n;j++){
          System.out.print(arr[j]+" ");
        }
    }
}

