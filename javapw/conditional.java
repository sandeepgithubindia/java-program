public class conditional {
    public static void main(String[] args) {
        // int age=18;
        // if(age>=18){
        //     System.out.println("Leagle adult");
        // }
        // else{
        //     System.out.println("you are kid");
        // }
        int age=38;
        if (age>=18 && age < 60)
        {
            System.out.println("you are adult");
        }else if(age>=60){
            System.out.println("you are old man now");
        }else{
            System.out.println("you are child");
        }
    }
}
