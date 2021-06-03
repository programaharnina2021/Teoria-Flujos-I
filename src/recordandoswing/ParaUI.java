package recordandoswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParaUI extends UI {
	private Facade facade;
	int valor=0;
	
	public ParaUI() {
		super();
		facade=new Facade();
		this.getBtnLLamar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getLblNombre().setText(facade.mayusculea(getTxtNombre().getText()));
			}
		});
		getTextField().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					valor = Integer.valueOf(getTextField().getText());
				} catch (NumberFormatException e2) {
					valor=1;
				}
				System.out.println(valor);
			}
		});
	}

}
