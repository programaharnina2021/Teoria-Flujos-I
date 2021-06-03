package recordandoswing;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;

public class PnlUno extends JPanel {
	private JLabel lblNombre;

	/**
	 * Create the panel.
	 */
	public PnlUno() {
		setLayout(new BorderLayout(0, 0));
		
		lblNombre = new JLabel(" ");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 45));
		add(lblNombre, BorderLayout.CENTER);

	}

	public JLabel getLblNombre() {
		return lblNombre;
	}

}
