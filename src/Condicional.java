public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2009;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.8;
        String tipoDePlano = "plus";
        
        if (anoDeLancamento >= 2024) {
            System.out.println("Lançamento que os clientes estão curtindo");
        } else {
            System.out.println("Filme retrô que vale a pena assitir!");
        }
        
        if (incluidoNoPlano == true || tipoDePlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Este filme não está incluído no seu plano, pague a locação");
        }
    }
}
