import java.util.Scanner;

public class StrRevision {

    // Palindrome
    public static boolean palindrome(String str){
        int i=0; int j = str.length()-1;
        while (i<j) {
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }else{
                i++; j--; 
            }
        }
        return true;
    }

    // Shortest Path => Init position (0,0)
    public static float shortestPath(String str){
        int x2=0, y2 =0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'E'){
                x2++;
            }else if(ch == 'W'){
                x2--;
            }else if(ch == 'N'){
                y2++;
            }else{
                y2--;
            }
        }
      
        return   (float)Math.sqrt(x2*x2 + y2*y2);
    }

    // Convert First Letter to uppercase
    public static String convertToUppercase(String s){
        StringBuilder sb = new StringBuilder("");
        // Append first char into sb 
        sb.append(Character.toUpperCase(s.charAt(0)));

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && i < s.length()-1 ) {
                // append empty char
                sb.append(s.charAt(i));

                i++;    // append next char
                sb.append(Character.toUpperCase(s.charAt(i)));
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    // For a given Set of String print the largest String
    // Time Complexity of this function is => O(x*n), x = largest length of String, n = number of string 
    
    public static String largestStr(String str[]){
        String lsStr = str[0];      // assuming the first elems in largestString
        for (int i = 1; i < str.length; i++) {

            if(lsStr.compareToIgnoreCase(str[i]) < 0){    // found another largest string
                lsStr = str[i];                 // update String
            }
        }
        return lsStr;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a string :");
        // String s = sc.nextLine();
        // System.out.println(palindrome(s));

        // String s = "WNEENESENNN";
        // System.out.println(s.substring(0, 5));

        String s = "convert first letter to uppercase";
        System.out.println(convertToUppercase(s));

        String str[] = {"apple", "mango", "banana"};
        System.out.println(largestStr(str));
    }
}
