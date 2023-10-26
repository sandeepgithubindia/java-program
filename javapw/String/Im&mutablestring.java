class str{
    public static void main(String[] args) {
        // Immutable string operation
        String brand1="Pwskills";
        System.out.println(brand1);
        brand1.concat("Honad");
        System.out.println(brand1);


        // Mutable String

        StringBuilder brand2 =new StringBuilder("Hellow World");
        System.out.println(brand2);
        brand2.append("World");
        System.out.println(brand2);
        
    }
}