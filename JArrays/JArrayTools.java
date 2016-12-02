import java.util.Random;

public class JArrayTools{
final int N = 10;  
int A[] = new int [N];    
    //public class JBubbleSort{
        public static void Forming(int []AR){ 
                //forming
            int N = AR.length;   
            Random gen = new Random();
            for (int i = 0; i < N; i++) 
            {
                AR[i]=gen.nextInt(1000);
            }
        
        }
 
    public void Output(int []OT){
    //Output
        for (int i = 0; i < N; i++)
        A[i] = OT.length;
        { 
            System.out.format("%5d " , OT[i]);
        }
        System.out.println();
    }
    public void BubbleSort(String []args){
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
    } 
    //}    
/*public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
     }
} 
*/
}
