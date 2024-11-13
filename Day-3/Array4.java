import java.util.Scanner;
 class Array4
 {
  public static void main(String[] args)
  {
   Scanner Sc=new Scanner(System.in);
   int n,i,sum=0;
   System.out.println("Enter Array size");
   n=Sc.nextInt();
   int a[]=new int[n];
   System.out.println("Enter elements to Array:");
   for(i=0;i<n;i++)
   {
    a[i]=Sc.nextInt();
   }
   System.out.println("The element in an Array is:");
   for(i=0;i<n;i++)
   {
    System.out.println(a[i]);
   }
   for(i=0;i<n;i++)
   {
    sum=sum+a[i];
   }
    System.out.println("The sum of Array is:"+sum);
  }
}

  
