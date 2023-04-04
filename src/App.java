import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Boa dia João, quantos kg de peixe você trouxe hoje? ");
        double pesoPeixe = teclado.nextDouble();

        double excedente = pesoPeixe - 50;
        double multa = excedente * 4;

        if (excedente > 0) {
            System.out.printf("João, você excedeu: %.1f kg hoje, e pagou uma multa de R$%.2f", excedente, multa);
        } else {
            System.out.println("João, hoje você não excedeu o limite de peixes do estado, portanto, não pagará nenhuma multa.");
        }

        teclado.close();
    }
}
