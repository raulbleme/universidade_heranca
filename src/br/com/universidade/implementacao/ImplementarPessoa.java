package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Endereco;
import br.com.universidade.modelo.Professor;
import br.com.universidade.tela.Magica;

public class ImplementarPessoa {

	public static void main(String[] args) {

		//O usu�rio vai escolher entre preencher um professor ou um aluno.
		//Voce deve permitir que ele preencha todos os atributos por meio do contrutor cheio e exibir os dados preenchidos.
		char tipoPessoa;
		tipoPessoa = JOptionPane.showInputDialog("Para cadastrar um professor, digite 'P'." + "\n" + 
				"Para cadastrar um aluno, digite 'A'." ).toUpperCase().charAt(0);
		if (tipoPessoa == 'P') {
			Professor prof = new Professor(
					Magica.t("Nome do Professor:"), 
					Magica.t("E-mail:"), 
					Magica.t("Telefone:"), 
					new Endereco(
							Magica.t("Logradouro:"),
							Magica.t("Bairro:"),
							Magica.t("Cidade:"),
							Magica.t("CEP:"),
							Magica.t("N�mero:"),
							Magica.t("UF:"),
							Magica.t("Complemento:")
							), 
					Magica.t("CPF:"), 
					Magica.t("Data de Contrata��o:"),
					Magica.f("Valor/hora:")
					);
			System.out.println(prof.getAll());
		}
		else if (tipoPessoa == 'A') {
			Aluno aluno = new Aluno(
					Magica.i("RM:"), 
					Magica.t("Nome do Aluno:"),
					Magica.t("E-mail:"), 
					Magica.t("Telefone:"), 
					Magica.t("Data de Matr�cula:"),
					new Endereco(
							Magica.t("Logradouro:"),
							Magica.t("Bairro:"),
							Magica.t("Cidade:"),
							Magica.t("CEP:"),
							Magica.t("N�mero:"),
							Magica.t("UF:"),
							Magica.t("Complemento:")
							)
					);
			System.out.println(aluno.getAll());
		}
		else {
			JOptionPane.showMessageDialog(null, "Op��o Inv�lida!");
		}
		
	}

}
