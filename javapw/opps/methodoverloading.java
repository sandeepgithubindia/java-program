class overloading{
    public int add(int n1,int n2){
        int result=n1+n2;
        return result;

    }
    public int add(int n1,int n2,int n3){
        int result=n1+n2+n3;
        return result;
        
    }
    public double add(double n1,double n2){
        double result = n1+n2;
        return result;
        
    }
    public static void main(String[] args) {
        overloading obj=new overloading();
        int result=obj.add(3,4);
        int res1=obj.add(3,4,5);
        double res2=obj.add(8.9,9.8);
        System.out.println(result);
        System.out.println(res1);
        System.out.println(res2);
    }
}