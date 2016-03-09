import java.io.FileNotFoundException;
import java.io.IOException;


public class StringProblem {

    public static void main(String args[]) throws FileNotFoundException, IOException {

          String str = "Thes code for the sring problem";
                 
          System.out.println("Method 1: " + replaceString1(str));
          System.out.println("Method 2: " + replaceString2(str));

    }

    public static String replaceString1(String str) {
        
        char[] strChars = str.toCharArray();

        for (int i = strChars.length - 1; i >= 0; i--) {
        if (strChars[i] == 's') 
           str = str.replace("s","");
        }
        return str;
    }
    
    public static String replaceString2(String str) {
        
        char[] strChars = str.toCharArray();

        for (int i = 0; i <= strChars.length-1; i++) {
           if (strChars[i] == 's') 
            strChars[i] = ' ';
         }
           
       String output = new String(strChars);
       return output;
    }

   }
