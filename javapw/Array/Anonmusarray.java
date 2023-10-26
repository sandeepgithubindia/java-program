class sumarray{
    public int add(int nums[]){
        int sum=0;
        for(int i:nums){
            sum=sum+i;
        
        }
        return sum;
    }
    
}
public class Anonmusarray {
    public static void main(String[] args) {
        // normal array use

        int nums[]={5,3,4,7};
        sumarray obj=new sumarray();
        int result=obj.add(nums);
        System.out.println(result);

        // Using Anonmusarry
        sumarray obj1=new sumarray();
        int res=obj1.add(new int[]{5,3,4,7});
        System.out.println(res);
    }

    
} 
