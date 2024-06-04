/* Given a binary representation in the form of a string(s) of a number n, the task is to find a binary representation of n+1. */
import java.util.*;
public class BinaryRepresentation{

    public static int binToDec(int binNum){
        int pow =0, decNum = 0;
        while (binNum >0) {
            int lastDigit = binNum %10;
            decNum =  decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        return decNum;
    }
    public static int decToBin(int decNum){
        int binNum=0; int pow = 0;
        while (decNum > 0) {
            int rem = decNum %2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            decNum = decNum/2;
        }
        return binNum;
    }

   public static String binaryNextNumber(String s) {
        // step - 1 : Convert into integer
        int num =0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            num = num*10 + (ch - '0');    
        }
        // step -2 :Binary to decimal
        int decNum = binToDec(num);
        
        // step-3 : Inc by One
        decNum++;
        // step -4 : decimal to Binary 
        int nextBinNum = decToBin(decNum);
       // step -5 : convert into a string

       return Integer.toString(nextBinNum);
    }
    public static void main(String[] args) {
        String s = "111";
        System.out.println(binaryNextNumber(s));
    }
}