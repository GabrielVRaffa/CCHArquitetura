public class ConstrutorDeSanduiche {
    private Sanduiche sanduiche;

    public ConstrutorDeSanduiche() {
        this.sanduiche = new Sanduiche();
    }

    public ConstrutorDeSanduiche definirPao(String pao) {
        sanduiche.definirPao(pao);
        return this;
    }

    public ConstrutorDeSanduiche definirRecheio(String recheio) {
        sanduiche.definirRecheio(recheio);
        return this;
    }

    public ConstrutorDeSanduiche adicionarMolho(String molho) {
        sanduiche.adicionarMolho(molho);
        return this;
    }

    public ConstrutorDeSanduiche adicionarAdicional(String adicional) {
        sanduiche.adicionarAdicional(adicional);
        return this;
    }

    public Sanduiche construir() {
        return sanduiche;
    }
}