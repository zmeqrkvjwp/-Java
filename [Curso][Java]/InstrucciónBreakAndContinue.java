
/**
 * Write a description of class InstrucciónBreakAndContinue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstrucciónBreakAndContinue
{
    public static void main(String[] args)
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("Aun estas en el ciclo");
            if(i==4)
            {
            break;
            }
            System.out.println("El valor de i es: "+i);
        }
        System.out.println("Has dejado el el ciclo for");
        System.out.println("");
        for(int i=0;i<=10;i++)
        {
            System.out.println("Aun estas en el ciclo");
            if(i==4)
            {
            continue;
            }
            System.out.println("El valor de i es: "+i);
        }
        System.out.println("Has dejado el el ciclo for");
    }
}
