public class JAgeSwitch{

    public static void main(String []args){
        
        System.out.println("Insert your age");
        int Age = Integer.parseInt(System.console().readLine());
        
/*        if (Age<1){
            System.out.println("The number is negative or 0");
        }
        else if (Age<7){
            System.out.println("Preschool kid");
        }
        else if (Age<17){
            System.out.println("Scoolchild");
        }
        else if (Age<22){
            System.out.println("Student");
        }
        else if (Age<60){
            System.out.println("Work-entitled Person");
        }
        else{
            System.out.println("Senior");
}*/

    switch(Age){
    case 1:
    case 2:
    case 3:
    case 5:
    case 6:
        System.out.println("Preschool kid");
        break;

    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    case 16:
        System.out.println("Schoolchild");    
        break;
        
    case 17:
    case 18:
    case 19:
    case 20:
    case 21:
         System.out.println("Student");
         break;
    
    case 22:
    case 23:
    case 24:
    case 25:
    case 26:
    case 27:
    case 28:
    case 29:
    case 30:
    case 31:
    case 32:
    case 33:
    case 34:
    case 35:
    case 36:
    case 37:
    case 38:
    case 39:
    case 40:
    case 41:
    case 42:
    case 43:
    case 44:
    case 45:
    case 46:
    case 47:
    case 48:
    case 49:
    case 50:
    case 51:
    case 52:
    case 53:
    case 54:
    case 55:
    case 56:
    case 57:
    case 58:
    case 59:
        System.out.println("Work-entitled Person");
        break;
    default:    
        if (Age>=60){
            System.out.println("Senior");
        }
        else System.out.println("The number is negative or equals 0");
        break;

    }
    }
}
