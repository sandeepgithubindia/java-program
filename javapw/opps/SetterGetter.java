import java.lang.*;

class student {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println(name + " " + age);
    }
}

public class SetterGetter {
    public static void main(String[] args) {
        student obj = new student();
        student obj1 = new student();
        obj.setAge(20);
        obj.setName("Sanddep");
        obj1.setAge(7);
        obj1.setName("kumar");
        int stud1Age = obj.getAge();
        System.out.println(stud1Age);
    }
}