import java.util.Random;

  public class JBubbleSort{
  /*  public static void Forming(int []AR){ 
            //forming
        int N = AR.length;   
        Random gen = new Random();
        for (int i = 0; i < N; i++) 
        {
            AR[i]=gen.nextInt(1000);
        }
    
    }
*/
     public static void main(String []args){
        //final int N = 10;  
        //int A[] = new int [N];
         
        //JArrayTools.Forming(A);
        JArrayTools obj1 = new JArrayTools();
        JArrayTools obj2 = new JArrayTools();
        //obj.Forming(A);
        obj1.Output(); //???
        obj2.Output(); //???
        obj1.BubbleSort(); //???
        obj2.BubbleSort(); //???
        obj1.Output(); //???
        obj2.Output(); //???
             /*  
      //forming
        Random gen = new Random();
        for (int i = 0; i < N; i++) 
        {
            A[i]=gen.nextInt(1000);
        }
        
        //Output
        for (int i = 0; i < N; i++)
        { 
            System.out.format("%5d " , A[i]);
        }
        System.out.println();
        //BubbleSort
        for (int k = 0; k < N-1; k++)
            for (int i = 0; i < N-k-1; i++)
            {
                if (A[i] > A[i+1])
                {
                    int temp = A[i];
                    A[i] = A[i+1];
                    A[i+1] = temp;
                }
            }
        //Output
        for (int i = 0; i < N; i++)
        { 
            System.out.format("%5d " , A[i]);
        }
        System.out.println();
          */
     }
}     
