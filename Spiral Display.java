public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int r1=0;
        int r2=r-1;
        int c1=0;
        int c2=c-1;
        while(r1<=r2&&c1<=c2){
            for(int i=r1;i<=r2;i++){
                System.out.println(arr[i][c1]);
            }
            c1++;
            
            for(int i=c1;i<=c2;i++){
                System.out.println(arr[r2][i]);
            }
            r2--;
            if(c1<=c2){
            for(int i=r2;i>=r1;i--){
                System.out.println(arr[i][c2]);
            }
            c2--;
            }
            if(r1<=r2){
            for(int i=c2;i>=c1;i--){
                System.out.println(arr[r1][i]);
            }
            r1++;
            }
            
        }
        
        
        
    }
}
