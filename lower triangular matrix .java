import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int rac=s.nextInt();
        int[][] arr=new int[rac][rac];
        for(int i=0;i<rac;i++){
            for(int j=0;j<rac;j++){
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println("ORIGINAL MATRIX");
        for(int i=0;i<rac;i++){
            for(int j=0;j<rac;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("LOWER TRIANGULAR MATRIX");
          for(int i=0;i<rac;i++){
            for(int j=0;j<rac;j++){
                if(j<=i){
                    System.out.print(arr[i][j]+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
