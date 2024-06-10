public class STR_RemoveChar {

    // For each letter of String1 we are running a loop which is taking O(m) time.
    // so for n letters ----- Time Complexity => O(n*m), Where n = length of String1, & m = length of String2
    // Space Com. => O(n) For StringBuilder
    
    public static String removeChars(String string1, String string2){
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < string1.length(); i++) {
            char ch =string1.charAt(i);
            int bool =0;    // to track letter which is present in str2
            for (int j = 0; j < string2.length(); j++) {
                if (string2.charAt(j) == ch) {
                    bool = 1;   // char found, so we'll not append this char into sb
                    break;
                }
            }
            if (bool ==0) { // didn't find common char
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "computer";
        String str2 = "cat";
        System.out.println(removeChars(str1, str2));
    }
}