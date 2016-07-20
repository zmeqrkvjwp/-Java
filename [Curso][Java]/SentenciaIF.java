
/**
 * Write a description of class SentenciaIF here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 *  >, >=, <, <=, ==, ||, &&, !
 */
public class SentenciaIF
{
   public static void main (String[] args)
   {   
       int var  =   5;
       int var2 =   10;
       if(var==5)
       {
           System.out.println("Tu operacion es verdadera");
       }
       else
       {
           System.out.println("Tu operacion es falsa");
       }
       
       if ((var==6) &&  (var2>5))
       {
           System.out.println("Tu operacion es verdadera"); 
       }
       else
       {
           System.out.println("Tu operacion es falsa"); 
       }
       
       if ((var==6) ||  (var2>5))
       {
           System.out.println("Tu operacion es verdadera"); 
       }
       else
       {
           System.out.println("Tu operacion es falsa"); 
       }
   }
}
