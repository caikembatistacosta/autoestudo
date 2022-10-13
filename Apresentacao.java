
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

/**
 *
 * @author marcel
 */
public class Apresentacao extends javax.swing.JFrame {
	private JComboBox <Vereador>cb0;
	private JComboBox<Vereador> cbVereadores;
	private Camara camara = new Camara();
	private ArrayList<Vereador> vereadores = new ArrayList<>();
	private Partido partido = new Partido();
	/**
c	 * Creates new form Apresentacao
	 */
	public Apresentacao() {
		initComponents();
	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

		jLabel7 = new javax.swing.JLabel();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jButton3 = new javax.swing.JButton();
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vereador v = camara.getVerMenorDesempenho();
				String str;
				if (v == null) {
					str = "Não há vereadores cadastrados";
				} else {
					str = "Menor desempenho\n\n" + v.getNome() + " do partido " + v.getPartido().getNome() + " = "
							+ v.calculaDesempenho();
				}
				JOptionPane.showMessageDialog(jTabbedPane1, str);
			}
		});
		jButton4 = new javax.swing.JButton();
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vereador v = camara.getVerMaisProjetosAprov();
				String str;
				if (v == null) {
					str = "Não há vereadores cadastrados";
				} else {
					str = "Mais projetos cadastrados\n\n" + v.getNome() + " do partido " + v.getPartido().getNome()
							+ " = " + v.calculaDesempenho();
				}
				JOptionPane.showMessageDialog(jTabbedPane1, str);
			}
		});
		jLabel9 = new javax.swing.JLabel();
		jTextField7 = new javax.swing.JTextField();
		jButton5 = new javax.swing.JButton();
		jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Partido p = camara.getPartido(Integer.parseInt(jTextField7.getText()));
					String str;
					if (p == null) {
						str = "Não há partido com este número";
					} else {
						str = "Partido " + p.getNome() + "\n\nTotal de projetos aprovados = " + p.getTotalProjAprov()
								+ "\nTotal de projetos apresentados = " + p.getTotalProjApres()
								+ "\nMédia de desempenho do partido = " + p.getMediaDesempenho();
					}
					JOptionPane.showMessageDialog(jTabbedPane1, str);
				} catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(jTabbedPane1, "Digite um n�mero de partido v�lido");
				}
			}
		});
		jSeparator1 = new javax.swing.JSeparator();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();

		jLabel7.setText("jLabel7");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Lista 3 - Exercício 5");

		jLabel1.setText("Número:");

		jLabel2.setText("Nome:");

		jButton1.setText("Cadastrar");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jButton1)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel1)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 177,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addContainerGap(153, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(28, 28, 28).addComponent(jButton1).addContainerGap(139, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Partido", jPanel1);

		jLabel3.setText("Nome: ");

		jLabel4.setText("Número do partido:");

		jButton2.setText("Cadastrar");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		
		btnNewButton_1 = new JButton("Consultar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			
			
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addComponent(jLabel3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addComponent(jLabel4)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(25)
							.addComponent(btnNewButton_1)
							.addGap(18)
							.addComponent(jButton2)))
					.addContainerGap(69, Short.MAX_VALUE))
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addGap(22)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jLabel3)
						.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel4)
						.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
					.addGap(96)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jButton2)
						.addComponent(btnNewButton_1))
					.addGap(70))
		);
		jPanel2.setLayout(jPanel2Layout);

		jTabbedPane1.addTab("Vereador", jPanel2);

		jButton3.setText("Vereador menor desempenho");

		jButton4.setText("Vereador com mais proj. aprovados");

		jLabel9.setText("Número do partido:");

		jButton5.setText("Estatísticas do partido");

		jButton6.setText("Total de projetos da Câmara");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setText("Vereadores acima da média");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});
		
		Projeto = new JPanel();
		jTabbedPane1.addTab("Projeto", null, Projeto, null);
		Projeto.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vereador:");
		lblNewLabel.setBounds(10, 11, 55, 14);
		Projeto.add(lblNewLabel);
		
		cb0 = new JComboBox();
		cb0.setBounds(10, 228, 86, 20);
		Projeto.add(cb0);
		
		JLabel lblNewLabel_1 = new JLabel("Titulo");
		lblNewLabel_1.setBounds(10, 36, 46, 14);
		Projeto.add(lblNewLabel_1);
		
		tf1 = new JTextField();
		tf1.setBounds(59, 33, 86, 20);
		Projeto.add(tf1);
		tf1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Data apresentacao");
		lblNewLabel_2.setBounds(180, 11, 97, 14);
		Projeto.add(lblNewLabel_2);
		
		tf2 = new JTextField();
		tf2.setBounds(287, 8, 86, 20);
		Projeto.add(tf2);
		tf2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Data aprovacao");
		lblNewLabel_3.setBounds(180, 36, 97, 14);
		Projeto.add(lblNewLabel_3);
		
		tf3 = new JTextField();
		tf3.setBounds(287, 33, 86, 20);
		Projeto.add(tf3);
		tf3.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String str;
				//Vereador v = partido.getVereador(projeto0.getText());
				ProjetoDeLei p = new ProjetoDeLei();
				p.setTitulo(tf1.getText());
				//transformando String para DateTime
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate today = LocalDate.parse(tf2.getText(), formatter);
				p.setDataApresentacao(today);
		// nao consigo fazer esse if funcionar
				if(tf3.getText() !=  "") {
					LocalDate tomorrow = LocalDate.parse(tf3.getText(), formatter);
					p.setDataApresentacao(tomorrow);	
				}
			  // v.addProjeto(p);
			   Vereador verr = (Vereador) cb0.getSelectedItem();
			   verr.addProjeto(p);
			   str = "Projeto cadastrado para ";
			   JOptionPane.showInputDialog(this, str);
		
			
			
		}
		});
		btnNewButton.setBounds(140, 98, 89, 23);
		Projeto.add(btnNewButton);
		
		projeto0 = new JTextField();
		projeto0.setBounds(59, 8, 86, 20);
		Projeto.add(projeto0);
		projeto0.setColumns(10);

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jSeparator1)
								.addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel9)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(jButton5).addGap(0, 41, Short.MAX_VALUE)))
						.addContainerGap())
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jButton3).addComponent(jButton4).addComponent(jButton6)
								.addComponent(jButton7))
						.addGap(0, 0, Short.MAX_VALUE)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel9)
								.addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton5))
						.addGap(13, 13, 13)
						.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jButton3)
						.addGap(18, 18, 18).addComponent(jButton4).addGap(18, 18, 18).addComponent(jButton6)
						.addGap(18, 18, 18).addComponent(jButton7).addContainerGap(45, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Consultas", jPanel3);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
					.addContainerGap(28, Short.MAX_VALUE)
					.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		getContentPane().setLayout(layout);

		pack();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		String str;
		try {
			if (camara.getPartido(Integer.parseInt(jTextField1.getText())) == null) {
				Partido partido = new Partido();
				partido.setNome(jTextField2.getText());
				partido.setNumero(Integer.parseInt(jTextField1.getText()));
				camara.addPartido(partido);
				str = "Partido cadastrado";
			} else {
				str = "Já há partido com este número. Escolha outro número";
			}
		} catch (IllegalArgumentException iae) {
			str = iae.getMessage();
		}
		JOptionPane.showMessageDialog(this, str);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		Partido p = camara.getPartido(Integer.parseInt(jTextField4.getText()));
		if (p == null) {
			jLabel8.setText("Número do partido não localizado");
		} else {
			try {
				jLabel8.setText(p.getNome());
				Vereador ver = new Vereador(jTextField3.getText(), p);
				//partido.addVereador(ver);
				cb0.addItem(ver);
				JOptionPane.showMessageDialog(this, "Vereador cadastrado");
			} catch (IllegalArgumentException iae) {
				JOptionPane.showMessageDialog(this, iae.getMessage());
			}
		}
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		int aprov = camara.getTotalProjAprov();
		int apres = camara.getTotalProjApres();
		String str = "Total de projetos aprovados = " + aprov + "\nTotal de projetos apresentados = " + apres;
		JOptionPane.showMessageDialog(this, str);
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		List<Vereador> acima = camara.getVereadoresAcimaMedia();
		String str = "Vereadores acima da média (" + camara.getDesempenhoMedio() + ")\n";
		for (Vereador v : acima) {
			str += "\n" + v.getNome() + " do partido " + v.getPartido().getNome() + " = " + v.calculaDesempenho();
		}
		JOptionPane.showMessageDialog(this, str);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Apresentacao().setVisible(true);
			}
		});
	}

	// Variables declaration
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField7;
	private JPanel Projeto;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField projeto0;
	private JButton btnNewButton_1;
}
