class HelloWorld {
    public static void main(String[] args) {
        int arr[]={3,9,1,7,5,77,5};
        int max=Integer.MIN_VALUE;
        // findining maximum value
        for(int k=0;k<arr.length;k++){
            if(arr[k]>max){
                max=arr[k];
            }
        }
        int count[]=new int[max+1];
        // counting the occurence of values
        for(int i=0;i<arr.length;i++){
            int idx=arr[i];
            count[idx]++;
        }//updating the array
        int i=0;
        for(int j=0;j<count.length;j++){
            while(count[j]>0){
                arr[i]=j;
                i++;
                count[j]--;
            }
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
