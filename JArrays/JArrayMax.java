import java.util.Random;

public class JArrayMax{

     public static void main(String []args){
        final int N = 20;  
        int A[] = new int [N];
        //forming
        Random gen = new Random();
        for (int i = 0; i < N; i++) 
        {
            A[i]=gen.nextInt(1000);
        }    
         
        //Search for max
        int max = A[0];
        for (int i = 0; i < N; i++)
        {
        //if  (A[i] > max)
        //    {
        //        max = A[i];
        //    }
        
            max=(A[i]>max)?A[i]:max;        
        }
        
        //Output
        for (int i = 0; i < N; i++)
        { 
            System.out.println(A[i]);
        }
        System.out.println("max = " + max);    
        //System.out.println("");
     }
}