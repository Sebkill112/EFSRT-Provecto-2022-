package GUI;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JFrame;

public class FrmCrudCliente extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCrudCliente frame = new FrmCrudCliente();
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
	public FrmCrudCliente() {
		setIconifiable(true);
		setClosable(true);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setTitle("CRUD de Cliente");
		setBounds(100, 100, 450, 300);

	}

}
