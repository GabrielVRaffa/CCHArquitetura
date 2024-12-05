import java.util.ArrayList;
import java.util.List;

public class Sanduiche {
    private String pao;
    private String recheio;
    private List<String> molhos;
    private List<String> adicionais;

    public Sanduiche() {
        this.molhos = new ArrayList<>();
        this.adicionais = new ArrayList<>();
    }

    public void definirPao(String pao) {
        this.pao = pao;
    }

    public void definirRecheio(String recheio) {
        this.recheio = recheio;
    }

    public void adicionarMolho(String molho) {
        this.molhos.add(molho);
    }

    public void adicionarAdicional(String adicional) {
        this.adicionais.add(adicional);
    }

    @Override
    public String toString() {
        return "Pão: " + pao + ", Recheio: " + recheio +
                ", Molhos: " + String.join(", ", molhos) +
                ", Adicionais: " + String.join(", ", adicionais);
    }
}