import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do seu filme preferido: ");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento? ");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Digite a sua avaliação para o filme: ");
        Double avaliação = leitura.nextDouble();

        System.out.println(filme + anoDeLancamento + avaliação);
        leitura.close();
    }
}
