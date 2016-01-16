public class JBirthDate{

    public static void main(String []args){
        
        System.out.println("Insert your year of birth");
        int y = Integer.parseInt(System.console().readLine());
        System.out.println("Insert your month of birth");
        int m = Integer.parseInt(System.console().readLine());
        System.out.println("Insert your day of birth");
        int d = Integer.parseInt(System.console().readLine());
        
    switch(m){
    case 1:  
        S = " january ";
        break;
        
    case 2:
        S = " february ";
        break;
        
    case 3:
        S = " march ";
        break;
        
    case 4:
        S = " april ";
        break;
        
    case 5:
        S = " may ";
        break;
        
    case 6:
        S = " june ";
        break;
        
    case 7:
        S = " july ";
        break;
        
    case 8:
        S = " august ";
        break;
        
    case 9:
        S = " september ";
        break;
        
    case 10:
        S = " october ";
        break;
        
    case 11:
        S = " november ";
        break;
        
    case 12:
        S = " december ";
        break;
    default:    
        if (m<0&&m>12){
        System.out.println("Error");}    
        break;
    }
    }
}    
