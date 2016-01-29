public class JEvenNumbers{

     public static void main(String []args){
        int k;
        int i;
        System.out.println("Insert the value of k");
        k=Integer.parseInt(System.console().readLine());

        for (i=0; i<=k; i+=2)

            System.out.println(i);
     }
}
