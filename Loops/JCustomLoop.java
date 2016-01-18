public class JCustomLoop{

     public static void main(String []args){
        int S;
        int k;
        System.out.println("Insert the value of k");
        k=Integer.parseInt(System.console().readLine());

        S=0;
        for (int i=1; i<=k; i++)
            S=S+i;
               System.out.println(S);
     }
}
