public class STR_findIndex {

    // Time Complexity of this code O(n*m)
    // For Outer loop, O(n-m+1)
    // For Inner loop, O(m), the inner loop runs m times for each of the n - m + 1 iterations of the outer loop.
    // Total TC ((n-m+1)m)  => O(n*m)
    
    public static int strStr(String haystack, String needle) {
        int idx = -1;
        int j = 0; // pointer for 2nd str

        // corner case
        if (haystack.length() < needle.length() || needle.length() == 0) {
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {    // haystack.length() - needle.length() => ensuring we don't go out of bound
            j = 0;

            while (j < needle.length() && haystack.charAt(i+j) == needle.charAt(j)) {       // init j is zero , after that j will be increased & string1's index position will be managed
                j++;
            }

            if(j == needle.length()){
                return i;   // found first occurences
            }

        }

        return idx;
    }

    public static void main(String[] args) {
        String haystack = "mississippi", needle = "issip";
        String s1 = "a", s2 = "a";
        System.out.println(strStr(s1, s2));
    }
}
