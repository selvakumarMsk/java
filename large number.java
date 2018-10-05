import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
      int x, y, z;
      x = 40;
      y = 7;
      z = 98;
     
      if (x > y && x > z)
         System.out.println(x);
      else if (y > x && y > z)
         System.out.println(y);
      else if (z > x && z > y)
         System.out.println(z);
      else  
         System.out.println("The numbers are not distinct.");
   }
}