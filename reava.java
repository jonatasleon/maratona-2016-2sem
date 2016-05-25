import java.util.Arrays;
import java.util.Scanner;

public class reava {
    public static void main(String[] args) {
        Scanner scanFloat = new Scanner(System.in);
        
        int n = Integer.parseInt(scanFloat.next());
        int i = 0;
        
        while(i < n) {
            int j = 0;
            float[] atividades = new float[12];
            while(j < 12){
                atividades[j] = Float.parseFloat(scanFloat.next());
                j++;
            }
            
            Arrays.sort(atividades);
            
            float media = 0;
            j = atividades.length;
            while(j > (atividades.length - 9)) {                
                media += atividades[j-1];                
                j--;                
            }            
            media = media / 9;
            
            float atividadeNotaFinal = (2 * media) / 10;
            if(atividadeNotaFinal + 4 < 5.75) {
                System.out.println("REPROVADO");
            }else{
                System.out.println(String.format("%.1f", ((5.75 - atividadeNotaFinal) * 10)/4));
            }            
            i++;
        }
        
    }
}
