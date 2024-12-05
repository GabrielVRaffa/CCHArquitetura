public class Main {
    public static void main(String[] args) {
        Sanduiche sanduichePersonalizado = new ConstrutorDeSanduiche()
                .definirPao("Branco")
                .definirRecheio("Peru")
                .adicionarMolho("Mostarda")
                .adicionarAdicional("Alface")
                .construir();
        System.out.println("Sanduíche Personalizado: " + sanduichePersonalizado);

        Sanduiche sanduicheClub = DiretorDeSanduiche.fazerSanduicheClub();
        System.out.println("Sanduíche Club: " + sanduicheClub);
    }
}