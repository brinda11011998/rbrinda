import java.util.*;
public class Pgm1{
public static void main(String args[])
{

String str1="Welcome to Java World";
String str2="WELCOME";
String str3="- Let us learn";
String con=str1.concat(str3);
String new_str = str1.substring(4, 10);
String s1lower=str2.toLowerCase();  
	char fifthLetter = str1.charAt(5);
		System.out.println("Fifth letter from String: " + str1 + " is : "+ fifthLetter);
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        int result=str1.compareTo(str2);
if (result < 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is less than " +
                "\"" + str2 + "\"");
        }
        else if (result == 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is equal to " +
                "\"" + str2 + "\"");
        }
        else  if (result > 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is greater than " +
                "\"" + str2 + "\"");
        }
        System.out.println("the concatenated string="+con);
System.out.println("the position of the first occurrence of character a="+str1.indexOf("a"));
System.out.println("the occurrences of ‘a’ character with the new e="+str1.replace('a', 'e'));
System.out.println(" string between 4th position and 10th position = " + new_str);
System.out.println(" the lowercase of the string="+s1lower);

    }
}