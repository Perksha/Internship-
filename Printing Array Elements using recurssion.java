class HelloWorld {
    public static void fun(int[] arr,int idx,int n){
        if(idx==n){
            return;
        }
        System.out.println(arr[idx]);
        fun(arr,idx+1,n);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        fun(arr,0,arr.length);
    }
}
