
/**
 * Write a description of class SwitchAndCase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SwitchAndCase
{
    public static void main(String[] args)
    {
        int x=0;
        switch(x)
        {
            case 0:
            {
                System.out.println("Esta es la opcion 0");
                break;
            }
            case 1:
            {
                System.out.println("Esta es la opcion 1");
                break;
            }
        }
        System.out.println("");
        char z='C';
        switch(z)
        {
            case 'A':
            {
                System.out.println("Esta es la opcion 0");
                break;
            }
            case 'B':
            {
                System.out.println("Esta es la opcion 1");
                break;
            }
            default:
            {
                System.out.println("Esta opción es la opción por defecto");                break;
            }
        }
    }
}
