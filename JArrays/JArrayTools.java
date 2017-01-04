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
    
    public void Swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    
    public void BubbleSort(){
    //BubbleSort
        for (int k = 0; k < N-1; k++)
            for (int i = 0; i < N-k-1; i++)
            {
                if (A[i] > A[i+1])
                {
                    Swap(A[i],A[i+1]);
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

