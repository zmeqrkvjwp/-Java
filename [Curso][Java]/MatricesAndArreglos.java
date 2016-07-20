
/**
 * Write a description of class MatricesAndArreglos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MatricesAndArreglos
{
   public static void main(String[] args)
   {
       /*
       int x[][];
       x=new int[3][3];
       x[0][0]=1;
       x[0][1]=15;
       x[0][2]=3;
       System.out.println("x[0][2] ="+x[0][2]);
       */
       //
       /*
       System.out.println("Matiz:");
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               System.out.println("i: "+i+" |j: "+j+" |valor: "+x[i][j]);
           }
       }
       //
       */
      //int x[][]={{'','',''},{'','',''},{'','',''}};
      /*
      int x[][]={{1, 2, 3} ,{4, 5, 6} ,{7, 8, 9}};
      System.out.println("Matiz:");
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               System.out.println("i: "+i+" |j: "+j+" |valor: "+x[i][j]);
           }
       }
      */
     String[][] x = new String[5][5];
     for (int i = 0; i < 5; i ++)
        for (int j = 0; j < 5; j ++)
            x[i][j] = String.format("%d", i * 5 + j + 1);
     System.out.println("Matiz:");       
     for(int i=0;i<5;i++)
       {
           for(int j=0;j<5;j++)
           {
               System.out.println("i: "+i+" |j: "+j+" |valor: "+x[i][j]);
           }
       }
    }
}
