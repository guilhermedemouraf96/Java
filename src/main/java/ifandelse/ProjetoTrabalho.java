package ifandelse;

public class ProjetoTrabalho {

	public static void main(String[] args) {

		int idade = 60;
		int idadePermitida = 16;
		int idadeMax = 60;

		if (idade >= idadePermitida && idade <= idadeMax) {

			System.out.println("Pode Trabalhar normalmente");

		} else {

			System.out.println("Não pode trabalhar");
		}

	}

}
