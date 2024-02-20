package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Login {

	private JFrame frame;
	private JTextField txtUsuarioAqui;
	private JPasswordField userPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 996, 624);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JLabel lblTitulo = new JLabel("Festival de Musica");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblTitulo, BorderLayout.NORTH);

		JPanel panelCentral = new JPanel();
		frame.getContentPane().add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new GridLayout(0, 2, 0, 10));

		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblUsuario);

		txtUsuarioAqui = new JTextField();
		txtUsuarioAqui.setToolTipText("Usuario aqui:");
		panelCentral.add(txtUsuarioAqui);
		txtUsuarioAqui.setColumns(10);

		JLabel lblPass = new JLabel("Introduzca password:");
		lblPass.setHorizontalAlignment(SwingConstants.CENTER);
		panelCentral.add(lblPass);

		userPass = new JPasswordField();
		userPass.setToolTipText("Password aqui");
		panelCentral.add(userPass);

		JComboBox comboBox = new JComboBox();
		frame.getContentPane().add(comboBox, BorderLayout.EAST);

		JButton bntLogin = new JButton("Login");
		frame.getContentPane().add(bntLogin, BorderLayout.SOUTH);
	}

}
