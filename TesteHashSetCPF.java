import java.util.HashSet;
import java.util.Scanner;
public class TesteHashSetCPF {
    public static void main(String[] args) {
        HashSet<String> cpf = new HashSet<String>();
        String registro;
        Scanner s = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o "+i+"º CPF:");
            registro = s.nextLine();
            cpf.add(registro);
        }
        
        System.out.println("CPF's:");
        for (String pessoa : cpf) {
            System.out.println(pessoa);
        }
        
    }
}
