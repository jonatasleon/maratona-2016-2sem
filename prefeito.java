import java.util.Arrays;
import java.util.Scanner;

public class prefeito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int casosDeTeste, i = 0, j;
        int totalMilhoes, numeroDeItens;
        
        casosDeTeste = scanner.nextInt();
        while(i < casosDeTeste) {
            totalMilhoes = scanner.nextInt();
            numeroDeItens = scanner.nextInt();
            int custo[] = new int[numeroDeItens];
            int votos[] = new int[numeroDeItens];
            j = 0;
            while(j < numeroDeItens) {
                custo[j] = scanner.nextInt();
                votos[j] = scanner.nextInt();
                j++;
            }
            
            
            
            i++;
        }
    }
}
