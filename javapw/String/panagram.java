public class panagram {
    public static void main(String[] args) {
        String str = "THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
        str = str.replace(" ", "");
        char[] ch = str.toCharArray();
        int[] ar = new int[26];

        for (char c : ch) {
            if (c >= 'A' && c <= 'Z') {
                ar[c - 'A']++;
            
            }
        }
    }
}