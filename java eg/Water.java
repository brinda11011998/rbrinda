import java.util.*;
class Water
{
       public static void main(String args[])
       {
           Scanner sc=new Scanner(System.in);
           System.out.println("enter the weight");
           int weight=sc.nextInt();
           if(weight%2==0)
               System.out.println("equal parts are "+weight/2+" "+weight/2);
        else 
               System.out.println("can't divide");
        for(int i=1;i<weight;i++) 
       {
               System.out.println(i +" "+(weight-i));
       }
       }
}