package controle;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.NoLista;
import modelo.Paciente;
import visao.JanelaCadastrarPaciente;
import visao.Pai;

public class ControleCadastroPaciente implements ActionListener {

	private JanelaCadastrarPaciente j;
	private Paciente p;

	public ControleCadastroPaciente(JanelaCadastrarPaciente j, Paciente p) {
		super();
		this.j = j;
		this.p = p;
		this.j.getButtonLimpar().addActionListener(this);
		this.j.getButtonCadastrar().addActionListener(this);
		this.j.getButtonVoltar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// Evento de ação que volta para a janela principal
		if (e.getActionCommand().equals("voltar")) {
			this.j.setVisible(false);
			dispose();
		}

		// Evento de ação que limpa a janela cadastro
		if (e.getActionCommand().equals("Limpar")) {
			this.j.limparCadastro();
		}

		// Evento de ação que cadastra o paciente
		if (e.getActionCommand().equals("Cadastrar")) {
			String cpf = this.j.getFieldCPF().getText().substring(0, 3);
			cpf = cpf.concat(this.j.getFieldCPF().getText().substring(4, 7));
			cpf = cpf.concat(this.j.getFieldCPF().getText().substring(8, 11));
			cpf = cpf.concat(this.j.getFieldCPF().getText().substring(12));

			String DataNaAux = this.j.getFieldDataNasc().getText().substring(0, 2);
			DataNaAux = DataNaAux.concat(this.j.getFieldDataNasc().getText().substring(3, 5));
			DataNaAux = DataNaAux.concat(this.j.getFieldDataNasc().getText().substring(6));

			if (Pai.listaP.buscarCpf(cpf) == null) {
				try {
					String nomeAux = this.j.getFieldNome().getText();

					// Teste se um dos campos foi deixado em branco
					if ((this.j.getFieldNome().getText().equals(""))
							|| (this.j.getFieldCPF().getText().equals("   .   .   -  "))
							|| (this.j.getFieldDataNasc().getText().equals("  /  /    "))) {
						// Informa a necessidade de todos os campos serem preenchidos
						JOptionPane.showMessageDialog(j, "Todos os campos são de preenchimento obrigatório!");
					} else {
						String invalidos = "0123456789";

						for (int i = 0; i < nomeAux.length(); i++) {
							for (int j = 0; j < invalidos.length(); j++) {
								if (nomeAux.charAt(i) == invalidos.charAt(j)) {
									break;
								}
							}
						}
					}

					// Teste para verificação se os dados estão corretos
					if ((cpf.length() != 11) || (DataNaAux.length() != 8)) {
						// Informa a necessidade dos dados serem preenchidos corretamente
						JOptionPane.showMessageDialog(j,
								"Verifique os dados informados! \nNome não pode conter números. \nCPF precisa conter 11 dígitos. ");
					}

					else {
						// Criando o objeto paciente
						Paciente pac = new Paciente(nomeAux, cpf, DataNaAux);
						// Adicionando o objeto na lista de pacientes
						Pai.listaP.adicionar(pac);
						JOptionPane.showMessageDialog(j, "Paciente cadastrado com sucesso!");
						this.j.limparCadastro();
					}
				} catch (NumberFormatException e2) {
					// Tratamento de exceção para garantir que apenas números sejam informados nos
					// campos de cpf e ano
					JOptionPane.showMessageDialog(j, "Verifique o formato dos dados inseridos!");
				}
			} else {
				JOptionPane.showMessageDialog(j, "Já existe um cadastro com o CPF informado!");
			}
		}
	}

	// Método que libera a memória que janela está usando, quando a janela é fechada
	// não continua executando o programa
	private void dispose() {
		// TODO Auto-generated method stub

	}
}