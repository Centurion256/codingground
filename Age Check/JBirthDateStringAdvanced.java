public class JBirthDateStringAdvanced{

    public static void main(String []args){
        
        String Sy = "";
        String Sm = "";
        String Sd = "";
        String result = "";
        System.out.println("Insert your year of birth");
        int y = Integer.parseInt(System.console().readLine());
        System.out.println("Insert your month of birth");
        int m = Integer.parseInt(System.console().readLine());
        System.out.println("Insert your day of birth");
        int d = Integer.parseInt(System.console().readLine());
        
    switch(m){
    case 1:  
        Sm = " january ";
        break;
        
    case 2:
        Sm = " february ";
        break;
        
    case 3:
        Sm = " march ";
        break;
        
    case 4:
        Sm = " april ";
        break;
        
    case 5:
        Sm = " may ";
        break;
        
    case 6:
        Sm = " june ";
        break;
        
    case 7:
        Sm = " july ";
        break;
        
    case 8:
        Sm = " august ";
        break;
        
    case 9:
        Sm = " september ";
        break;
        
    case 10:
        Sm = " october ";
        break;
        
    case 11:
        Sm = " november ";
        break;
        
    case 12:
        Sm = " december ";
        break;
    default:    
        if (m<0||m>12){
        System.out.println("Error");}    
        break;
    }
    Integer.toString(d);
    Integer.toString(y);
    Sd=(d+ Sd);
    Sy=(y+ Sy);
    result=(Sd+Sm+Sy);
System.out.println(result);
    }
}    