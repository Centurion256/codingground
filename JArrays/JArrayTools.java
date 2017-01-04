import java.util.Random;

public class JArrayTools{
final static int N = 10;  
int A[] = new int [N];    
    JArrayTools(){
        Forming();
    }
    //public class JBubbleSort{
        public void Forming(){ 
                //forming
            int N = A.length;   
            Random gen = new Random();
            for (int i = 0; i < N; i++) 
            {
                A[i]=gen.nextInt(1000);
            }
            System.out.println();
        }
 
    public void Output(){
    //Output
        for (int i = 0; i < N; i++)
        { 
            System.out.format("%5d " , A[i]);
        }
        System.out.println();
    }
    
/*    public void Swap(int a, int b){
        //Swapper.Swap(A[i],A[i + 1]);
        Swapper swap = new Swapper(a,b);
        swap.Swap();
    }
*/    
    
    public void BubbleSort(){
    //BubbleSort
        for (int k = 0; k < N-1; k++)
            for (int i = 0; i < N-k-1; i++)
            {
                if (A[i] > A[i+1])
                {
                    Swapper swap = new Swapper(A[i],A[i + 1]);
                    swap.Swap();
                    //Swap(A[i],A[i+1]);
                        A[i] = swap.a;
                        A[i + 1] = swap.b;
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


    public class Swapper{

        int a;
        int b;

            Swapper(int a1, int b1){
                a = a1;
                b = b1;
            }
    
            void Swap(){
                int temp = a;
                    a = b;
                    b = temp;
            }
    }    
}
