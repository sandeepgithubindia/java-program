class student{
    private int age;
    private String name;

    public void setdata()
    {
        age=18;
        name="Rahul";
    }
    public void show(){
        System.out.println(name+" "+age);
    }
}

public class Encapuslation {
    public static void main(String[] args){
        student obj= new student();
        obj.setdata();
        obj.show();
    }

    
}
