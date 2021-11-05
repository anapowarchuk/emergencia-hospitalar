package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Atendimento;
import modelo.FilaAtendimento;
import modelo.ListaAtendimentosEncerrados;
import modelo.ListaPacientes;
import modelo.Paciente;
import visao.JanelaCadastrarPaciente;
import visao.JanelaIniciarAtendimento;
import visao.Pai;

public class ControleIniciarAtendimento implements ActionListener {

	private JanelaIniciarAtendimento j;
	private Atendimento aten;
	private Paciente p1;
	private int senhaAt = 0;

	public ControleIniciarAtendimento(JanelaIniciarAtendimento j, Atendimento aten, Paciente p1) {
		super();
		this.j = j;
		this.aten = aten;
		this.p1 = p1;
		this.j.getButtonLimpar().addActionListener(this);
		this.j.getButtonPesquisar().addActionListener(this);
		this.j.getButtonIniciarAtendimento().addActionListener(this);
		this.j.getButtonVoltar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		//Evento de a��o para voltar para a janela principal
		if (e.getActionCommand().equals("voltar")) {
			this.j.setVisible(false);
			dispose();
		}

		//Evento de a��o para limpar os campos da tela
		if (e.getActionCommand().equals("Limpar")) {
			this.j.limparAtendimento();
		}

		//Evento de a��o para verificar se o paciente est� cadastrado
		if (e.getActionCommand().equals("Pesquisar")) {
			try {
				String cpf = this.j.getFieldCPF().getText().substring(0, 3);
				cpf = cpf.concat(this.j.getFieldCPF().getText().substring(4, 7));
				cpf = cpf.concat(this.j.getFieldCPF().getText().substring(8, 11));
				cpf = cpf.concat(this.j.getFieldCPF().getText().substring(12));

				if (this.j.getFieldCPF().getText().equals("   .   .   -  ")) {
					JOptionPane.showMessageDialog(j, "O CPF precisa ter 11 d�gitos!");
				} else {
					p1 = Pai.listaP.buscarCpf(cpf);

					//Altera os campos para o dado do paciente 
					this.j.getFieldNome().setText(p1.getNome());
					this.j.getFieldDataNasc().setText(p1.getDataNasc());
					this.j.getFieldCPF2().setText(cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "."
							+ cpf.substring(6, 9) + "-" + cpf.substring(9));

					senhaAt++; //Gera uma senha (iniciando no 1)
					this.j.getFieldSenha().setText(Integer.toString(senhaAt));
					this.aten.setSenha(senhaAt);

				}

			} catch (NullPointerException e1) {
				JOptionPane.showMessageDialog(j,
						"Paciente n�o encontrado nos registros, � necess�rio realizar o cadastro primeiro!");
			}
		}

		//Evento de a��o para iniciar atendimento
		if (e.getActionCommand().equalsIgnoreCase("Iniciar Atendimento")) {
			try {
				//Teste para ver se o campo da hora est� preenchido
				if (this.j.getFieldHoras().getText().equals("")) {
					JOptionPane.showMessageDialog(j, "O campo hora deve ser informado!");
				} else {
					if (this.j.getFieldMinutos().getText().equals("")) {
						JOptionPane.showMessageDialog(j, "O campo minutos deve ser informado!");
					} else {

						int hora = Integer.parseInt(this.j.getFieldHoras().getText());
						int min = Integer.parseInt(this.j.getFieldMinutos().getText());
						if (hora < 0 || hora > 23) {
							JOptionPane.showMessageDialog(j, "Hora inv�lida!");
						} else if (min < 0 || min > 59) {
							JOptionPane.showMessageDialog(j, "Minuto inv�lido!");
						} else {
							
							//Criando o objeto atendimento
							Atendimento a1 = new Atendimento(Integer.parseInt(this.j.getFieldSenha().getText()), p1,
									hora, min);

							//Adiciona o objeto na fila de atendimentos
							Pai.atendimentos.adicionar(a1);
							JOptionPane.showMessageDialog(j, "Atendimento iniciado com sucesso!");
							this.j.limparAtendimento();

						}
					}
				}
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(j, "S� � poss�vel a inser��o de n�meros nos campos de hora e minutos");
			}
		}

	}

	//M�todo que libera a mem�ria que janela est� usando, quando a janela � fechada n�o continua executando o programa
	private void dispose() {
		// TODO Auto-generated method stub

	}

}