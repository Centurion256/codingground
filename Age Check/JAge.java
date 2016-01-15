public class JAge{

    public static void main(String []args){
        
        System.out.println("Insert your age");
        int Age = Integer.parseInt(System.console().readLine());
        
        if (Age<1){
            System.out.println("The number is negative or 0");
        }
        else if (Age<7){
            System.out.println("Preschool kid");
        }
        else if (Age<17){
            System.out.println("Schoolchild");
        }
        else if (Age<22){
            System.out.println("Student");
        }
        else if (Age<60){
            System.out.println("Work-entitled Person");
        }
        else{
            System.out.println("Senior");
        }
    }
}

