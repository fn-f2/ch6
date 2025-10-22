import java.util.Scanner;

public class ch6
{
    Scanner in = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        System.out.println(ppap("I have a string, I have a string2"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama."));
        System.out.println(isPalindrome("racecar       ~`!@#$%^&*()-_=+[{]}|;:',<.>/?"));
        System.out.println(convertToBinary(50));
    }
    
    public static String ppap(String str)
    {
        String a = "";
        String b = "";
        
        int commaIndex = str.indexOf(",");
        
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ',')
            {
                a = str.substring(9, i);
                b = str.substring(i+11, i+12).toUpperCase() + str.substring(i+12);
                break;
            }
        }
        return("Uh! " + b + " " + a);
    }
    
    public static boolean isPalindrome(String str)
    {
        String nonLetters = ",.:;()[]{}!@#$%^&* +=><|~`'?_-/";
        String formattedStr = "";
        
        System.out.println(str);
        
        for (int i = 0; i < str.length(); i++) //iterate through string
        {
            boolean addChar = true;
            
            for (int i2 = 0; i2 < nonLetters.length(); i2++) // check if string index i contains non letter
            {
                if (str.charAt(i) == nonLetters.charAt(i2)) addChar = false;
            }
            
            if (addChar) formattedStr += str.charAt(i); // only add chars that are letters
        }
        
        formattedStr = formattedStr.toLowerCase(); // make lowercase
        
        for (int i = 0; i < formattedStr.length(); i++)
        {
            if (formattedStr.charAt(i) != formattedStr.charAt(formattedStr.length()-1-i)) return false;
        }
        
        return true; 
    }
    
    public static String convertToBinary(int num)
    {
        String ans = "";
        String ansFlipped = "";
        int result = num;
       
        while (result != 0)
        {
            ans += String.valueOf(result%2);
            result /= 2;
        }
        
        // flip ans
        for (int i = 0; i < ans.length(); i++)
        {
            ansFlipped += ans.charAt(ans.length()-i-1);
        }
        
        return ansFlipped;
    }
    
    public static String pigLatin(String msg)
    {
        String[] words = String.split(msg);
        for (String s : words)
        {
        
        }
        
        return "";
    }
}
