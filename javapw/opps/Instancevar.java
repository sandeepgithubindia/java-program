/**
 * test
 */
class Instancevar {
    int a = 4; //Instance Variable
    String name="Rohit";

    public static void main(String[] args) {
        int a=7;        //Local Variable
        String name="Mohit";
        Instancevar obj =new Instancevar();
        obj.name="Vishal";
        obj.a = 5;

        Instancevar obj1=new Instancevar();
        System.out.println(obj.name);
        System.out.println(name);
        System.out.println(a);
        System.out.println(obj.a);
        System.out.println(obj1.a);
        System.out.println(obj1.name);
        
    }

    
}