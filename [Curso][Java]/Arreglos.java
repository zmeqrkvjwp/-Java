
/**
 * Write a description of class Arreglos here.
 * 
 * @author (your name) 
 * @version 01:02 a.m. 20/07/2016
 */
public class Arreglos
{
    public static void main(String[] args)
    {
        int x[] = {10,5,7}; 
        /*
        x=new int[10];
        x[0]=10;
        x[1]=5;
        x[2]=7;
        */
       System.out.println("Length: "+x.length); 
       for(int i=0;i<x.length;i++)
        {
            System.out.println("El valor en la posicion: "+i+" es igual a: "+x[i]);;
        }
    }
}
