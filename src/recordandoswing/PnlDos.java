package recordandoswing;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PnlDos extends JPanel {
	private JTextField txtNombre;
	private JButton btnLLamar;

	/**
	 * Create the panel.
	 */
	public PnlDos() {
		setLayout(new MigLayout("", "[][][grow][]", "[][][grow]"));
		
		JLabel lblTuNombre = new JLabel("tu nombre");
		add(lblTuNombre, "cell 0 0");
		
		txtNombre = new JTextField();
		add(txtNombre, "cell 2 0,growx,aligny top");
		txtNombre.setColumns(10);
		
		btnLLamar = new JButton("Llama");
		add(btnLLamar, "cell 3 0,aligny top");

	}

	public JButton getBtnLLamar() {
		return btnLLamar;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

}
