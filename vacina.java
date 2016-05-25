import java.util.Scanner;
public class vacina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        
        String dengue, xico, zica;
        int subQntd;
        
        dengue = scan.next();
        xico = scan.next();
        zica = scan.next();
        subQntd = Integer.parseInt(scan.next());
        
        int cont = 0, i = 0;
        
        while(i + subQntd <= dengue.length()){
            String subStr = dengue.substring(i, i + subQntd);
            if(xico.contains(subStr) && zica.contains(subStr)){
                cont++;
            }
            i++;
        }        
        System.out.println(cont);        
    }
}