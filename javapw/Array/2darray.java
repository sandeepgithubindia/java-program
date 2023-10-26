class array2{
    public static void main(String[] args) {
        // int arr[][]=new int[3][2];
        // insert value in Array 2 types

        // arr[0][0] = 2;
        // arr[0][1] = 3;
        // arr[1][0] = 4;
        // arr[1][1] = 5;
        // arr[2][0] = 6;
        // arr[2][1] = 7;

        int arr[][] = {
                { 2, 3 }, { 4, 5 }, { 6, 7 }
            };

        
        for(int i=0;i<=2;i++){
            for(int j=0;j<=1;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println(" ");

        }
    }
}
