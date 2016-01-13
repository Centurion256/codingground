public class JCondition{
    
     public static void main(String []args){
         
         int a;
         int b;
         
         System.out.println("Insert the 1st number");
         a=Integer.parseInt(System.console().readLine());
         System.out.println("Insert the 2nd number");
         b=Integer.parseInt(System.console().readLine());
         
         if (a>b) System.out.println(a);
         else
            if (a<b) System.out.println(b);
         else System.out.println("Numbers are same");    
     }
}
