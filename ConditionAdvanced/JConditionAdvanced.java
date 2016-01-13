public class JConditionAdvanced{

     public static void main(String []args){
         
        int a;
        int b;
        int c;
        
        System.out.println("Insert value of the 1st number");
        a=Integer.parseInt(System.console().readLine());
        System.out.println("Insert value of the 2nd number");
        b=Integer.parseInt(System.console().readLine());
        System.out.println("Insert value of the 3rd number");
        c=Integer.parseInt(System.console().readLine());
        
           if (a>b)
          {if (a>c) System.out.println(a);
          else System.out.println(c);}
        else
          if (b>c) 
            {System.out.println(b);}
            else System.out.println(c);}
}