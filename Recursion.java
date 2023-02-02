public class Recursion {

    public static void main(String[] args) {
        
        // Remove letters (30 pts)

        // Instructions (Important!)

        // Without using arrays or loops or regular expressions, apply recursion to remove specific letters in
        // your full name.

        // 1. If the last letter of your surname is a vowel, remove all vowels in
        // your full name.

        // 2. If the last letter of your surname is a consonant, remove all
        // consonants in your full name.

        // 3. Use only lowercase letters
        
        // 4. Each letter should be removed one by one.

        // Example:
        // Full name is "elizer ponio jr".
        // The output should be "lzr pn jr".

        // Put your complete name in the "fullName" variable.
        // Example:
        // String fullName = "elizer ponio jr";

        String fullName = "Angelica Elamparo";

        removeLetter(fullName);
        
    }
   
    static void removeLetter(String str) {
        Name (str, "");
    } 
    static String Name (String str, String previousChar) {
        if(str.length() == 0) {
            return previousChar;
        }
        char a = str.charAt(0);
        switch (a) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        System.out.println(previousChar + str.substring(1));
            return Name (str.substring(1), previousChar);
            default:
            return a + Name (str.substring(1), previousChar + a);
        }
    }
}