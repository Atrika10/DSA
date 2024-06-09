import java.util.*;

public class STR_StringCompression {

    public static String strCompress(String s){
        StringBuilder sb = new StringBuilder();
        char ch = s.charAt(0);
        int count =0;
        
        for (int i = 1; i < s.length(); i++) {
            if(ch == s.charAt(i)){
                count++;
            }else{
                //append prev ch & count
                sb.append(ch);
                if(count >0){
                    sb.append(count+1);
                }
                // update ch & count
                ch = s.charAt(i);
                count =0;
            }
        }
        // append the last char 
        sb.append(ch);
        if(count >0){
            sb.append(count+1);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aaabbcccdddeaaaaayyyynjnjn";
        System.out.println(strCompress(str));
    }
}
