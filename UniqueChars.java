/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        String newstr = "";
        int count = 0;
        while (str.length() > count) {
            if ((int)str.charAt(count) == 32) {
                newstr = newstr + str.charAt(count);
            }
            if ( newstr.indexOf(str.charAt(count)) < 0) {
                newstr = newstr + str.charAt(count);
            }
            count++;
        }
        System.out.println(newstr);
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        // Replace the following statement with your code
        return null;
    }
}
