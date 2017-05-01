public class Bruteforce{
    


     public static void main(String []args){
        String keyword = "rtun";
        String selection = "qwertyuiopasdfghjklzxcvbnm";
        String[] con = new String[selection.length() + 1];
        boolean RoW = false;
        //char x;
        //char y;
        //char z;
        //char n;
        //System.out.println("Hello World");
        
        for (int i = 1; i < selection.length() + 1; i++) {
            con[i] = selection.substring(i - 1, i);
        }
        con[0] = "";
        String guess = "";
        /*while (RoW = false)
        {
            for (int i = 1; i < selection.length() + 1; i++) {
                con[i] = selection.substring(i - 1, i);
            }
            con[0] = "";
            String guess = "";
 
            
        }
        */
        for (int i = 0; i < selection.length() + 1; i++) {
            for (int j = 0; j < selection.length() + 1; j++) {
                for (int k = 0; k < selection.length() + 1; k++) {
                    for (int l = 0; l < selection.length() + 1; l++) {
                        for (int m = 0; m < selection.length() + 1; m++) {
                            guess = con[i] + "" + con[j] + "" + con[k] + "" + con[l] + "" + con[m];
                            if (guess.equals(keyword)) {
                                RoW = true;
                                //System.out.println("Fo"+ con[i]+ con[j]+ con[k]+ con[l]+ con[m]+ "e");
                                break;
                            }
                        }
                    }
                }
            }    
        }
        if (RoW){
            System.out.println("Fo"+keyword + "e");
        }    
    }
}    
