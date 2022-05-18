package GUI;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JFrame;

public class FrmRegistroCliente extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmRegistroCliente frame = new FrmRegistroCliente();
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
	public FrmRegistroCliente() {
		setIconifiable(true);
		setClosable(true);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setTitle("Registro de Clientes");
		setBounds(100, 100, 450, 300);

	}

}
