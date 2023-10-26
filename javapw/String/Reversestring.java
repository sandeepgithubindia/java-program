public class Reversestring {
    public static void main(String[] args) {
        // String str1="pw skill";
        // String str2="";
        // String str3="";
        // String sarr[] = str1.split(" ");

        // for(int i=sarr.length-1;i>=0;i--){
        //     str3=str3+sarr[i]+" ";
        // }
        // for(int i=str1.length()-1;i>=0;i--){
        //     str2=str2+str1.charAt(i);
        
        // }

        String str1="pw skill";
        String str2="";
        String sarr[]=str1.split(" ");
        for(String elem:sarr){
            for(int i=elem.length()-1;i>=0;i--){
                str2=str2+elem.charAt(i);
            }
            str2=str2+" ";
        }


        System.out.println("Before Reversing: "+str1);
        System.out.println("After Revesing: "+str2);
        // System.out.println(str3);

    }
    
}
