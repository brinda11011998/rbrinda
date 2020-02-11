import java.util.*;
class parent
{
void view()
{
System.out.println("this is a parent class");
}
class child extends parent
{
void view()
{
System.out.println("this is a child class");
}
}
public static void main(String args[])
{
parent ob=new parent();
ob.view();
parent ob1=new child();
ob1.view();
}
}


