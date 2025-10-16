import java.util.Scanner;

public class ch6
{
    Scanner in = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        System.out.println(ppap("I have a string, I have a string2"));
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
}
