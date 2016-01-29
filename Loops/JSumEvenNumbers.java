public class JSumEvenNumbers{

     public static void main(String []args){
        int k;
        int i;
        int S;
        System.out.println("Insert the value of k");
        k=Integer.parseInt(System.console().readLine());
        S=0;

        for (i=0; i<=k; i+=2)
            S=S+i;
            System.out.println(S);
     }
}
