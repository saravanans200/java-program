import java.util.Scanner;
class saran10
{
 public static void main(String args[])
 {
  String num,reverse="";
  Scanner in = new Scanner(System.in);
  System.out.println("Enter the num");
  num = in.nextLine();
  int length = num.length();
  for(int i= length-1;i>=0;i--)
    reverse = reverse + num.charAt(i);
   if (num.equals(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered number isn't a palindrome.");   
 }
}