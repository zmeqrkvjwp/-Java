
/**
 * Write a description of class InstrucciónWhile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstrucciónWhile
{
   public static void main (String[] args)
   {
       int x=0;
       while (x<=10)
       {
           System.out.println("El valor de x es: "+x);
           x=x+2;
           if(x>8)
           {
           x=11;
           }
       }
   }
}
