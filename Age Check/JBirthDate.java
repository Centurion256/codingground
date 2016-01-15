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
        System.out.println(d , "/january/" , y);
        break;
        
    case 2:
        System.out.println(d , "february" , y);
        break;
        
    case 3:
        System.out.println(d , "/march/" , y);
        break;
        
    case 4:
        System.out.println(d , "/april/" , y);
        break;
        
    case 5:
        System.out.println(d , "/may/" , y);
        break;
        
    case 6:
        System.out.println(d , "/june/" , y);
        break;
        
    case 7:
        System.out.println(d , "/july/" , y);
        break;
        
    case 8:
        System.out.println(d , "/august/" , y);
        break;
        
    case 9:
        System.out.println(d , "/september/" , y);
        break;
        
    case 10:
        System.out.println(d , "/october/" , y);
        break;
        
    case 11:
        System.out.println(d , "/november/" , y);
        break;
        
    case 12:
        System.out.println(d , "/december/" , y);
        break;
    default:    
        if (m<0&&m>12){
        System.out.println("Error");}    
        break;
    }
    }
}    