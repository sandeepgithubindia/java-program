class array{

    public static void main(String[] args) {
        // if array value is defined then we cerate array 
        int arr[]={1,2,3,4,4};
        System.out.println(arr[0]);
        for(int i=0; i<=4;i++){
            System.out.print(arr[i]);
        }
        System.out.println("");
        // if array values is not defined then we cerate array
        int array[]=new int[5];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        array[4]=4;
        for(int i=0; i<=4;i++){
            System.out.print(arr[i]);
        }
        System.out.println("");
        // creating a string array
        String str[]={"Sandeep"," Kumar"," patel"};
        int len =str.length;
        for(int i=0;i<=len-1;i++){
            System.out.print(str[i]);
        }

        
    }
}