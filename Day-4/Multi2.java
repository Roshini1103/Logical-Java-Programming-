import java.util.Scanner;
class Multi2
{
 public static void main(String args[])
 {
 Scannersc=new Scanner(System.in);
 int i,j,r,c,n;
 System.out.println("Enter size of array");
 r=Sc.nextInt();
 c=Sc.nextInt();
 int a[][]=new int [r][c];
 System.out.println("Enter element toan Array");
 for(i=0;i<=r;i++)
 {
 for(j=0;j<=c;j++)
 {
 a[i][j]=Sc.nextInt();
}
}
System.out.println("The Element in Array:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
 System.out.println(" "+a[i][j]);
 }
 System.out.println();
}
}
}