package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class FestivalView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FestivalView window = new FestivalView();
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
	public FestivalView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 837, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		
		JPanel panelPrincipal = new JPanel();
		frame.getContentPane().add(panelPrincipal);
		
		JLabel lblPrincipal = new JLabel("Panel Principal");
		panelPrincipal.add(lblPrincipal);
		
		JPanel panelSuperior = new JPanel();
		frame.getContentPane().add(panelSuperior);
		
		JLabel lblSuperior = new JLabel("Panel superior");
		panelSuperior.add(lblSuperior);
		
		JPanel panelCentral = new JPanel();
		frame.getContentPane().add(panelCentral);
		
		JLabel lblCentral = new JLabel("Panel Central");
		panelCentral.add(lblCentral);
		
		JPanel panel0 = new JPanel();
		frame.getContentPane().add(panel0);
		panel0.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel1 = new JPanel();
		panel0.add(panel1);
		
		JLabel lblPanel0 = new JLabel("Panel 0");
		panel0.add(lblPanel0);
		
		JPanel panel2 = new JPanel();
		panel0.add(panel2);
		
		JLabel lblPanel1 = new JLabel("Panel 1");
		panel0.add(lblPanel1);
		
		JPanel panel3 = new JPanel();
		panel0.add(panel3);
		
		JLabel lblPanel2 = new JLabel("Panel 2");
		panel3.add(lblPanel2);
		
		JPanel panel4 = new JPanel();
		panel0.add(panel4);
		
		JLabel lblPanel3 = new JLabel("Panel 3");
		panel4.add(lblPanel3);
		
		JPanel panelInferior = new JPanel();
		frame.getContentPane().add(panelInferior);
		
		JLabel lblPanelInferior = new JLabel("Panel Inferior");
		panelInferior.add(lblPanelInferior);
	}

}
