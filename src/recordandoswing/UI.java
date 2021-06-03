package recordandoswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UI extends JFrame {

	private JPanel contentPane;
	private PnlDos falda;
	private PnlUno centro;
	private JTextField textField;

	

	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		centro = new PnlUno();
		contentPane.add(centro, BorderLayout.CENTER);
		
		textField = new JTextField();
		
		centro.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		falda = new PnlDos();
		
		contentPane.add(falda, BorderLayout.SOUTH);
		
	}

	public JButton getBtnLLamar() {
		return falda.getBtnLLamar();
	}

	public JTextField getTxtNombre() {
		return falda.getTxtNombre();
	}

	public JLabel getLblNombre() {
		return centro.getLblNombre();
	}

	public JTextField getTextField() {
		return textField;
	}
	
}
