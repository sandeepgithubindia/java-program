public class Enhenceforloop {
    public static void main(String[] args) {
        // for 1D array Enance for loop or for-each loop
        int arr[]={1,2,3,4,5};
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        // for-each loop for 2d array

        int nums[][] = {
                { 2, 3,4 }, { 4, 5,5 }, {1, 6, 7 }
        };
        for(int j[]:nums){
            for(int k:j){
                System.out.print(k+" ");
            }
            System.out.println();;

        }

    }
}
