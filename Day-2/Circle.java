import java.util.Scanner;
class Circle 
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int r;
float pi=3.14f;
float area;
System.out.println("Enter the radius of circle");
r=Sc.nextInt();
area=pi*r*r;
System.out.println("Area of circle is:"+area);
}
}