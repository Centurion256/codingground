public class JAge{

static int JAge; 

     public static void main(String []args){
         
        System.out.println("Insert your age");
        JAge=Integer.parseInt(System.console().readLine());
       
if (JAge<1)
{
  System.out.println("The number is negative or 0"); 
}
else
    if (JAge<7)
{
  System.out.println("Preschool kid");  
}
else 
    if (JAge<17)
{
  System.out.println("Scoolchild");
}
else
    if (JAge<22)
{
  System.out.println("Student");
}
else
    if (JAge<60)
{
  System.out.println("Work-entitled Person");
}
else
    if (JAge>59)
{
  System.out.println("Senior");
}
     }
}
