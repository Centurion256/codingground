import java.util.Random;

public class JMinmax_2D {

     public static void main(String []args){
        final int N = 10;  
        int A[][] = new int [N][N];
        int B[] = new int [N];
        //forming
        Random gen = new Random();
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                A[i][j]=gen.nextInt(1000);
            }   
        } 
        
        //Output
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                System.out.format("%5d" , A[i][j]);
            }
                System.out.println();
        }
        
        
        //Search for max
        int max;
        for (int i = 0; i < N; i++)
        {
            max = A[i][0];
        
            for (int j = 0; j < N; j++)
            {
                if  (A[i][j] > max) max = A[i][j];
                
            //max=(A[i]>max)?A[i]:max;        
            }
            System.out.println("value of " + (i+1) + "-th column = " + max);    
            //System.out.println("");
            B[i] = max;
        }
        
        //Seach for minmax
        int minmax= B[0];
        for(int k = 0; k < N; k++)
        {
            if (B[k] < minmax) minmax = B[k];
        }
        
        //Output minmax
        System.out.println("minimal maximum value = " + minmax);
        
        //for (int i = 0; i < N; i++)
        //{ 
        //    System.out.println(A[i][j]);
        //}
        //System.out.println("max = " + max);    
        //System.out.println("");
     }
}