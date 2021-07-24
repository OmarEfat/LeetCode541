// Leet Code problem #541
// Reverse the first K letters for every 2K letters in a String starting from the first letter
// Solved and explained by OMAR TAHA

public class Leet541 {
    //This problem is asking you to reverse the first K letters for every 2K letters starting from the first letter
    //For example, if K is equal to 2 then we will reverse every 2 letters of every 4 letters in the words
    //If the String = "abcdefgh" and K= 2, then it will return bacdfegh
    //It reversed the first 2 letters of every 4 letters in this word

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefgh",2));

    }
    public static String reverseStr(String s, int k) {
        //Convert the characters of the String into chars by .toCharArray() function
        char[] letters = s.toCharArray();

        //A counter that will increase everytime  by 2*k
            for(int i = 0; i<letters.length;i+=2*k)
            {
                //The first letter that will be reversed is at index i
                //The last letters is that letter that lies K steps from the starting letter
                //For example, in the String "abcdefg" and K=2
                // the starting letter in the first 4 letters is 'a' at index [0]
                // and the last or the second one is 'b' at index[1] which is at [0+2-1]
                // We will take the minimum between i+k-1 and letters.length-1 so that it not goes outside the word boundries
                // and cause ArrayIndexOutBounds run-time error
                int start= i, end= Math.min(i+k-1, letters.length-1);
                // Keep reversing between the starting and ending letters
                reverse(letters,start,end);
            }
            return String.valueOf(letters);
    }

    public static void reverse(char[] chars, int start, int end) {
        // Reversing function is working with 2 pointers one from the start and the other from the end
        // Keep reversing from every start and the end
        // Make the start pointer go forward
        //Make the end pointer go backward
        //Until the start becomes larger than the end in that case this means that all are reversed
        while (start < end) {
            //Char ch is a temp for storing starting letter
            char ch = chars[start];
            // Replace the starting with the end
            chars[start] = chars[end];
            chars[end] = ch;
            // Increase the start by 1
            // Decrease the  end by 1
            start++; end--;
        }
    }
}
