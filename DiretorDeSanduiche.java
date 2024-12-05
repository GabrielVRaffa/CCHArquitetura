public class DiretorDeSanduiche {
    public static Sanduiche fazerSanduicheClub() {
        return new ConstrutorDeSanduiche()
                .definirPao("Integral")
                .definirRecheio("Frango")
                .adicionarMolho("Maionese")
                .adicionarAdicional("Bacon")
                .adicionarAdicional("Queijo")
                .construir();
    }
}