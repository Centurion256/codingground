public class JPreWhile{

     public static void main(String []args){
        int S;
        int k;
        int i;
        System.out.println("Insert the value of k");
        k=Integer.parseInt(System.console().readLine());

        S=0;
        i=2;
        while (i<=k)
        {
            S=S+i;
            i+=2;
        }    
            System.out.println(S);
     }
}
