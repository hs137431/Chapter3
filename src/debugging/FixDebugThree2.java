package debugging;
// This application displays some math facts
public class FixDebugThree2
{
   public static void main(String args[])
   {
      double a = 2, b = 5, c = 10;
      add(a, b);
      add(b, c);
      subtract(c, a);            
   }
   public static void add(double a, double  b)
   {
      System.out.println("The sum of " + a +
         " and " + b + " is " + (a + b));
   }
   public static void subtract(double a, double b)
   {
      System.out.println("The difference between " +
        a + " and " + b + " is " +  (a - b));
   }
}
