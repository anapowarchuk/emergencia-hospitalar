package controle;

import modelo.Atendimento;

import modelo.Paciente;
import visao.JanelaPrincipal;

public class App {

	public static void main(String[] args) {
		
		//Aplicação para o controle da Janela Principal

		JanelaPrincipal ja = new JanelaPrincipal();
		Paciente pa = new Paciente();
		Atendimento aten = new Atendimento();
		ja.setVisible(true);

		ControleJanelaPrincipal jpc = new ControleJanelaPrincipal(ja,pa,aten);

	}

}