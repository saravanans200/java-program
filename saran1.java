import java.util.Scanner;
public class saran1{
public static void main(String[] args){

int n1,n2,n3;
Scanner Sc = new Scanner(System.in);
System.out.println("Enter the number");
n1=Sc.nextInt();
n2=Sc.nextInt();
n3=Sc.nextInt();
if(n1<=n2)
{
  if(n2<=n3)
    {
     System.out.println("Greater number is number 3:"+n3);
    }
   else
    {
     System.out.println("Greater number is number 2:"+n2);
    }
}
  else
    {
     System.out.println("Greater number is number 3:"+n3);
    }
}
}