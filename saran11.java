import java.util.Scanner;
class saran10
{
 public static void main(String args[])
 {
  String num,originalnum,rem,result=0;
  Scanner in = new Scanner(System.in);
  System.out.println("Enter the num");
  num = in.nextLine();
  originalnum = num;
  for (;originalnum != 0; originalnum /= 10, ++n);

        originalnum = num;

        for (;originalnum != 0; originalnum /= 10)
        {
            remainder = originalnum % 10;
            result += Math.pow(remainder, n);
        }

        if(result == num)
            System.out.println(num + " is an Armstrong num.");
        else
            System.out.println(num + " is not an Armstrong num.");
 }
}