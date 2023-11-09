import java.util.HashSet;
import java.util.Set;

public class ConjuntoDePalavras {
    private Set<String> conjuntoPalavras = new HashSet<>();

    public ConjuntoDePalavras(String palavrasSeparadasPorVirgula) {
        String[] palavras = palavrasSeparadasPorVirgula.split(",");
        for (String palavra : palavras) {
            conjuntoPalavras.add(palavra.trim()); 
        }
    }

    public boolean contemTodas(String palavras) {
        String[] palavrasParaVerificar = palavras.split(",");
        for (String palavra : palavrasParaVerificar) {
            if (!conjuntoPalavras.contains(palavra.trim())) {
                return false;
            }
        }
        return true;
    }
}
