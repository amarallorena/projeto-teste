package primeiro_projeto;
import java.util.Scanner;

public class Ativ_02 {

	public static void main(String[] args) {

		//Variáveis
		Double horatrab, valorhora, salbruto, salliquido, inss;

		//Instanciar classe Scanner
		Scanner ler = new Scanner (System.in);

		//Entrada de dados
		System.out.println ("Informe quantas horas você trabalha por dia");
		horatrab= ler.nextDouble();

		System.out.println ("Informe quanto você ganha por hora" );
		valorhora = ler.nextDouble ();

		//Processamento;
		salbruto = horatrab * valorhora; 
		inss = salbruto * 0.12;
		salliquido = salbruto - inss;

		//Saída

		System.out.println("O valor do salário bruto é: " + salbruto);
		System.out.println("O valor do sálario líquido é: " + salliquido);

	}

}
