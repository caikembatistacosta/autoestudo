package autoestudo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.time.LocalDate;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTabbedPane;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;

public class Aprstc extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfEndereco;
	private JTextField tfData;
	private JTextField tfNumero;
	private Concessionaria concessionaria = new Concessionaria();

	// parâmetros
	private Telefone telefone;
	private Residencial user;
	private JTextField tfConsulta;
	private JTextField textField;
	private JTextField tfespecializado1;
	private JTextField tfespecializado2;
	private JTextField tfespecializado3;
	private JTextField tfespecializado4;
	private JTextField tfcomercial1;
	private JTextField tfcomercial2;
	private JTextField tfcomercial3;
	private JTextField tfcomercial4;
	private JTextField tfcomercial5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aprstc frame = new Aprstc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Aprstc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 571, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(31, 73, 514, 278);
		contentPane.add(tabbedPane);

		JPanel empresaTab = new JPanel();
		tabbedPane.addTab("Empresa", null, empresaTab, null);
		empresaTab.setLayout(null);

		JLabel lblNewLabel = new JLabel("Interface da Empresa");
		lblNewLabel.setBounds(190, 11, 104, 14);
		empresaTab.add(lblNewLabel);

		JLabel lblNewLabel_6 = new JLabel("Consulta:");
		lblNewLabel_6.setBounds(23, 42, 46, 14);
		empresaTab.add(lblNewLabel_6);

		tfConsulta = new JTextField();
		tfConsulta.setBounds(79, 39, 86, 20);
		empresaTab.add(tfConsulta);
		tfConsulta.setColumns(10);

		JButton btnNewButton_2 = new JButton("Consultar Numero");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// chamando o hashMap

				Telefone consultado = concessionaria.procuraTelefone(tfConsulta.getText());
				if (consultado == null) {

					JOptionPane.showMessageDialog(empresaTab, "Telefone não encontrado :( ");
				}
				else  { 
				
					JOptionPane.showMessageDialog(empresaTab, consultado.imprimir());
				}
			}
		});
		btnNewButton_2.setBounds(57, 67, 133, 23);
		empresaTab.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton(" Faturamento Total");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 double faturamento = concessionaria.explorarTelefone();
					JOptionPane.showMessageDialog(empresaTab, faturamento);

				
			
		
				}
			}
		);
		btnNewButton_4.setBounds(260, 67, 133, 23);
		empresaTab.add(btnNewButton_4);

		JPanel comercialTab = new JPanel();
		tabbedPane.addTab("Comercial", null, comercialTab, null);
		comercialTab.setLayout(null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Cadastro para uso comercial");
		lblNewLabel_1_1_1.setBounds(182, 0, 196, 14);
		comercialTab.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Nome usu\u00E1rio:");
		lblNewLabel_2_1_1.setBounds(10, 36, 71, 14);
		comercialTab.add(lblNewLabel_2_1_1);
		
		tfcomercial1 = new JTextField();
		tfcomercial1.setColumns(10);
		tfcomercial1.setBounds(83, 30, 120, 20);
		comercialTab.add(tfcomercial1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Endere\u00E7o");
		lblNewLabel_3_1_1.setBounds(10, 58, 46, 14);
		comercialTab.add(lblNewLabel_3_1_1);
		
		tfcomercial2 = new JTextField();
		tfcomercial2.setColumns(10);
		tfcomercial2.setBounds(83, 58, 120, 20);
		comercialTab.add(tfcomercial2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Data");
		lblNewLabel_4_1_1.setBounds(10, 83, 46, 14);
		comercialTab.add(lblNewLabel_4_1_1);
		
		tfcomercial3 = new JTextField();
		tfcomercial3.setColumns(10);
		tfcomercial3.setBounds(83, 89, 86, 20);
		comercialTab.add(tfcomercial3);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Numero");
		lblNewLabel_5_1_1.setBounds(279, 36, 54, 14);
		comercialTab.add(lblNewLabel_5_1_1);
		
		tfcomercial4 = new JTextField();
		tfcomercial4.setColumns(10);
		tfcomercial4.setBounds(340, 30, 106, 20);
		comercialTab.add(tfcomercial4);
		
		JButton btnNewButton_3_1 = new JButton("Cadastrar");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				Comercial user = new Comercial();
			user.setNomeUsuario(tfcomercial1.getText());
			user.setEnderecoInsta(tfcomercial2.getText());
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate today = LocalDate.parse(tfcomercial3.getText(), formatter);
			user.setDataInsta(today);
			user.setNumero(tfcomercial4.getText());
			user.setRamoAtividade(tfcomercial5.getText());
			
			concessionaria.addTelefone(user);
			
			JOptionPane.showMessageDialog(comercialTab, "comercio cadastrado!");
			}
			catch (IllegalArgumentException s) {
				JOptionPane.showMessageDialog(comercialTab, s);
			}
			catch (java.time.format.DateTimeParseException s) {
				JOptionPane.showMessageDialog(comercialTab, "Data inserida incorretamente");
			}
			}
		});
		btnNewButton_3_1.setBounds(63, 193, 89, 23);
		comercialTab.add(btnNewButton_3_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("Ramo de atividade");
		lblNewLabel_7_1.setBounds(262, 58, 126, 14);
		comercialTab.add(lblNewLabel_7_1);
		
		tfcomercial5 = new JTextField();
		tfcomercial5.setColumns(10);
		tfcomercial5.setBounds(381, 55, 86, 20);
		comercialTab.add(tfcomercial5);

		JPanel especializadoTab = new JPanel();
		tabbedPane.addTab("Especializado", null, especializadoTab, null);
		especializadoTab.setLayout(null);

		JLabel lblNewLabel_1_1 = new JLabel("Cadastro para uso Especializado");
		lblNewLabel_1_1.setBounds(182, 11, 196, 14);
		especializadoTab.add(lblNewLabel_1_1);

		JLabel lblNewLabel_2_1 = new JLabel("Nome usu\u00E1rio:");
		lblNewLabel_2_1.setBounds(10, 47, 71, 14);
		especializadoTab.add(lblNewLabel_2_1);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(83, 41, 120, 20);
		especializadoTab.add(textField);

		JLabel lblNewLabel_3_1 = new JLabel("Endere\u00E7o");
		lblNewLabel_3_1.setBounds(10, 69, 46, 14);
		especializadoTab.add(lblNewLabel_3_1);

		tfespecializado1 = new JTextField();
		tfespecializado1.setColumns(10);
		tfespecializado1.setBounds(83, 69, 120, 20);
		especializadoTab.add(tfespecializado1);

		JLabel lblNewLabel_4_1 = new JLabel("Data");
		lblNewLabel_4_1.setBounds(10, 94, 46, 14);
		especializadoTab.add(lblNewLabel_4_1);

		tfespecializado2 = new JTextField();
		tfespecializado2.setColumns(10);
		tfespecializado2.setBounds(83, 100, 86, 20);
		especializadoTab.add(tfespecializado2);

		JLabel lblNewLabel_5_1 = new JLabel("Numero");
		lblNewLabel_5_1.setBounds(279, 47, 54, 14);
		especializadoTab.add(lblNewLabel_5_1);

		tfespecializado3 = new JTextField();
		tfespecializado3.setColumns(10);
		tfespecializado3.setBounds(340, 41, 106, 20);
		especializadoTab.add(tfespecializado3);

		JButton btnNewButton_3 = new JButton("Cadastrar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Especializado empresa = new Especializado();
				

				// a seguir seta parâmetros do usuário

				empresa.setNomeUsuario(textField.getText());
				empresa.setEnderecoInsta(tfespecializado1.getText());
				// transformando String para DateTime
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				LocalDate today = LocalDate.parse(tfespecializado2.getText(), formatter);
				empresa.setDataInsta(today);
				empresa.setNumero(tfespecializado3.getText());
				int numero = Integer.parseInt(tfespecializado4.getText());
				empresa.setQtdDeOcorr(numero);

				// guardando usuario no hashmap,
				concessionaria.addTelefone(empresa);

				JOptionPane.showMessageDialog(empresaTab, "empresario cadastrado");
				}
				catch (IllegalArgumentException s) {
					JOptionPane.showMessageDialog(empresaTab, s);
				}
				catch (java.time.format.DateTimeParseException s) {
					JOptionPane.showMessageDialog(empresaTab, "Data inserida incorretamente");
				}
			
			
			}
		});
		btnNewButton_3.setBounds(63, 204, 89, 23);
		especializadoTab.add(btnNewButton_3);
		
		JLabel lblNewLabel_7 = new JLabel("Numero de Conex\u00F5es");
		lblNewLabel_7.setBounds(262, 69, 126, 14);
		especializadoTab.add(lblNewLabel_7);
		
		tfespecializado4 = new JTextField();
		tfespecializado4.setBounds(381, 66, 86, 20);
		especializadoTab.add(tfespecializado4);
		tfespecializado4.setColumns(10);

		JPanel residencialTab = new JPanel();
		tabbedPane.addTab("Residencial", null, residencialTab, null);
		residencialTab.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Cadastro para uso Dom\u00E9stico");
		lblNewLabel_1.setBounds(182, 11, 196, 14);
		residencialTab.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Nome usu\u00E1rio:");
		lblNewLabel_2.setBounds(10, 47, 71, 14);
		residencialTab.add(lblNewLabel_2);

		tfNome = new JTextField();
		tfNome.setBounds(83, 41, 120, 20);
		residencialTab.add(tfNome);
		tfNome.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Endere\u00E7o");
		lblNewLabel_3.setBounds(10, 69, 46, 14);
		residencialTab.add(lblNewLabel_3);

		tfEndereco = new JTextField();
		tfEndereco.setBounds(83, 69, 120, 20);
		residencialTab.add(tfEndereco);
		tfEndereco.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Data");
		lblNewLabel_4.setBounds(10, 94, 46, 14);
		residencialTab.add(lblNewLabel_4);

		tfData = new JTextField();
		tfData.setBounds(83, 100, 86, 20);
		residencialTab.add(tfData);
		tfData.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Numero");
		lblNewLabel_5.setBounds(289, 44, 46, 14);
		residencialTab.add(lblNewLabel_5);

		tfNumero = new JTextField();
		tfNumero.setBounds(340, 41, 106, 20);
		residencialTab.add(tfNumero);
		tfNumero.setColumns(10);

		JRadioButton rbInternet = new JRadioButton("Conex\u00E3o Internet");
		rbInternet.setBounds(340, 65, 130, 23);
		residencialTab.add(rbInternet);

		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				user = new Residencial(); // cria usuário

				// a seguir seta parâmetros do usuário

				user.setNomeUsuario(tfNome.getText());
				user.setEnderecoInsta(tfEndereco.getText());
				// transformando String para DateTime
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				LocalDate today = LocalDate.parse(tfData.getText(), formatter);
				user.setDataInsta(today);
				user.setNumero(tfNumero.getText());
				user.setConexaoInternet(rbInternet.isSelected());

				// guardando usuario no hashmap,
				concessionaria.addTelefone(user);

				JOptionPane.showMessageDialog(residencialTab, "Usuário cadastrado");
				}
				catch (IllegalArgumentException s) {
					JOptionPane.showMessageDialog(residencialTab, s);
				}
				catch (java.time.format.DateTimeParseException s) {
					JOptionPane.showMessageDialog(residencialTab, "Data inserida incorretamente");
				}
			}
		});
		btnNewButton.setBounds(63, 204, 89, 23);
		residencialTab.add(btnNewButton);
	}
}
