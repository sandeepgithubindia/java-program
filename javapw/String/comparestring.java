public class comparestring {
    public static void main(String[] args) {
        
        String s1="pwskills";
        String s2="pwskills";
        String s3=new String("pwskills");
        String s4=new String("pwskills");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s4==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));


    }
}
