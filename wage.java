
import java.util.Scanner;



public class wage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String[] entrada = s.nextLine().split(" ");
        double hbv, hev, qh, dpb, dpe, ct;
        
        hbv = Double.parseDouble(entrada[0]);
        hev = Double.parseDouble(entrada[1]);
        qh = Double.parseDouble(entrada[2]);
        dpb = Double.parseDouble(entrada[3]);
        dpe = Double.parseDouble(entrada[4]);
        ct = Double.parseDouble(entrada[5]);
        
        double br = 0, es = 0;
        int i = 0;
        while(i < 3){
            br += hbv * qh * (1 - (dpb / 100));
            es += hev * qh * (1 - (dpe / 100));
            
            br *= 1.01;
            es *= 1.01;
            i++;
        }
        
        es *= ct;
        String res = "%.2fBR %.2fES";
        System.out.println(String.format(res, br, es));
    }
}
