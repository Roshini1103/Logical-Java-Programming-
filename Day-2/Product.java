import java.util.Scanner;
class Product
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int pno;
String pname;
float pcost,pqty;
float bill;
System.out.println("Enter Product number:");
pno=sc.nextInt();
System.out.println("Enter Product name:");
pname=sc.next();
System.out.println("Enter Product cost:");
pcost=sc.nextFloat();
System.out.println("Enter Product Quantitty:");
pqty=sc.nextFloat();
bill=pcost*pqty;
System.out.println("The Product Number:"+pno);
System.out.println("The Product Name:"+pname);
System.out.println("The Product Cost:"+pcost);
System.out.println("The Product Quantity:"+pqty);
System.out.println("The Total Bill:"+bill);
}
}



