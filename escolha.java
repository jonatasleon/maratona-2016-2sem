import java.util.Scanner;

public class escolha {
    public static void main(String[] args) {
        int n = 0;
        int res;
        
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            n = scanner.nextInt();
            if(n == -1)
                break;
            
            res = 31 % n;
            System.out.println(res);
        }        
    }
}
