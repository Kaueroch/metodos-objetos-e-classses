package escola;

public class aluno {
	String aln, sala;
	int idade;

	public String exibir() {
		String info;
		info = "Nome: " + aln;
		info = "Sala: " + sala;
		info = "Idade  " + idade;
		return "Informações dos alunos[" + info;
	}

	void VerificaIdade(int idade) {
		if (idade <= 15) {
			System.out.println("Fundamental");
		}
		if (idade >= 16) {
			System.out.println("Ensino medio");
		}
	}
}
