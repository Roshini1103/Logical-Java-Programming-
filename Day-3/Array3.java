import java.util.Scanner;
 class Array3
 {
  public static void main(String[] args)
  {
   Scanner Sc=new Scanner(System.in);
   int n,i;
   System.out.println("Enter Array size");
   n=Sc.nextInt();
   int a[]=new int[10];
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
  }
}

  
   
