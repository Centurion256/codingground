public class Volume{

     public static void main(String []args){
        double a;
        double b;
        double h;
        double V;
        
        System.out.println("Wwedyt Dowzshynu");
        a=Double.parseInt(System.console().readLine());
        System.out.println("Wwedyt Shyrynu");
        b=Double.parseInt(System.console().readLine());
        System.out.println("Wwedyt Wusoty");
        h=Double.parseInt(System.console().readLine());
        
        V=a*b*h;
        System.out.println("Ploshtsha ye " + V);
        
     }
}
