/*
Splitting the word into group of size K and filling the gaps - if found - with the filling char
For example 
word = "abcdefghijk"  ,  k =  3  and filling char = 'x' 
Result = {"abc","def","ghi" , "jkx"}
*/

/*
Algorithm:

*/
class Solution {
    public String[] divideString(String s, int k, char fill) {
        String[] result = new String[(int)Math.ceil(1.0*s.length()/k)];
        int counter = 0 ;
        for(int i = 0 ; i<s.length(); i+=k)
        {
            if(i+k<s.length())
                result[counter]= s.substring(i,i+k);
            else
                result[counter] = s.substring(i,s.length());
                counter++;
        }
        int remaining = k-result[counter-1].length();
        for(int i = 0 ; i<remaining ; i++)
            result[counter-1]+=fill;
        return result;
        
    }
}
