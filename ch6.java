import java.util.Scanner;

public class ch6
{
    Scanner in = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        System.out.println(ppap("I have a string, I have a string2"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama."));
        System.out.println(isPalindrome("racecar       ~`!@#$%^&*()-_=+[{]}|;:',<.>/?"));
        System.out.println(isPalindrome("big dtinky idoit"));
        System.out.println("50 in binary is " + convertToBinary(50));
        System.out.println(pigLatin("hi my name is carter hooray"));
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
        
        System.out.print(str + " ");
        
        for (int i = 0; i < str.length(); i++) //iterate through string
        {   
            if (!nonLetters.contains(str.substring(i, i+1))) formattedStr += str.charAt(i); // only add chars that are letters
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
       
        while (num != 0)
        {
            ans += String.valueOf(num%2);
            num /= 2;
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
        String space = " ";
        String[] words = msg.split(space);
        String ans = "";
        
        for (String s : words)
        {
            
            if (s.length() > 2)
            {
                ans += s.substring(1, s.length()) + s.substring(0, 1) + "ay ";
            } else ans += s + " ";
        }
        
        return ans;
    }
}
