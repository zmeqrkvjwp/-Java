
/**
 * Write a description of class CiclosAndSerie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CiclosAndSerie
{
    public static void main(String[] args)
    {
        for(int i=0;i<=100;i++)
        {
            if((i%2)!=0)
            {
                System.out.println("este numero es impar: "+i);
            }
        }
        System.out.println("");
        // Serie fibonacci 0, 1, 1,2,3,5,8,11,....
        int x=1;
        int anterior=0;
        int temp;
        while(true)
        {
            System.out.println(x);
            temp=x;
            x=x+anterior;
            anterior=temp;
            if(x>9000)
            {
                break;
            }
        }
    }
}
