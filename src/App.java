public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem Vindo ao Screen Master");
        System.out.println("Filme: Bastardos Inglórios");
        
        int anoDeLancamento = 2009;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.8;

        // média da nota
        double media = (10.0 + 8.0 + 9.2)/3;
        System.out.println(media);
        String sipnose;
        sipnose = """
                Bastador Inglórios
                Durante a Segunda Guerra Mundial, na França, judeus americanos espalham o terror entre o terceiro Reich. Ao mesmo tempo, Shosanna, uma judia que fugiu dos nazistas, planeja vingança quando um evento em seu cinema reunirá os líderes do partido.
                """ + anoDeLancamento;
        System.out.println(sipnose);

        int classificacao = (int) (media/2);
        System.out.println(classificacao);
    }
}
