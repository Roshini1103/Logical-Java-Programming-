import java.util.Scanner;
class Linearsearch
{
public static void main(String[] args)
{
 Scanner Sc=new Scanner(System.in);
 int i,n,scr;
 System.out.println("Enter Arrary size");
 n=Sc.nextInt();
 int a[]=new int[n];
 System.out.println("Enter elements in an array");
 for(i=0;i<n;i++)
 {
  a[i]=Sc.nextInt();
 }
 System.out.println("The elements in an array is :");
 for(i=0;i<n;i++) 
 {
 System.out.println(a[i]);
 }
 System.out.println("enter the value for search:");
 scr=Sc.nextInt();
 for(i=0;i<n;i++)
 {
 if(scr==a[i])
 {
 System.out.println(scr + "is found");
 }
 }
 if(i==n)
 {
 System.out.println(scr + "is not found");
}
}
}

