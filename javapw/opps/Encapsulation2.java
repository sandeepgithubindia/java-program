class student {
    private int age;
    private String name;

    public void setAge(int a) {
        age = a;
    }

    public void setName(String n) {
        name=n;
    }

    public void show() {
        System.out.println(name + " " + age);
    }
}

public class Encapsulation2 {
    public static void main(String[] args) {
        student obj = new student();
        student obj1 = new student();
        obj.setAge(20);
        obj.setName("Sanddep");
        obj1.setAge(7);
        obj1.setName("kumar");
        obj.show();
        obj1.show();
    }
}