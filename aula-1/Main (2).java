import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double PrecoAbacaxi = 7.30;
	double PrecoMaca = 2.00;
	double PrecoPera = 3.00;
    
    System.out.println("insira a quantidade de abacaxis:");
    int qtdAbacaxi = scanner.nextInt();
    System.out.println("insira a quantidade de maçãs:");
    int qtdMaca = scanner.nextInt();
    System.out.println("insira a quantidade de pêras:");
    int qtdPera = scanner.nextInt();
    
    double total = qtdAbacaxi*PrecoAbacaxi+qtdMaca*PrecoMaca+qtdPera+PrecoPera;
    
	System.out.println("O valor total é:" + total);
	}
}