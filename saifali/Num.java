import java.util.*;
public class Num
{
 public static void main(String[]args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the First number");
  int a=sc.nextInt();
    System.out.println("Enter the Second  number");

  int b=sc.nextInt();
  if(a==b)
  {System.out.println("Equal");}
  else if(a>b)
  {System.out.println(a + "  " + "a is greater");}
  else
  {System.out.println(a+ "  "+ "a is lesser");}
 }
}