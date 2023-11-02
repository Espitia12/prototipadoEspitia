import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ejercicio4 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtNombre;
	JButton btnAceptar;
	JButton btnaActivar;
	JButton btnDesactivar;
	private JTextField txtCiudad;
	JLabel txtFrase;
	
	public ejercicio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(74, 23, 262, 44);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(63, 213, 101, 23);
		btnAceptar.addActionListener(this);
		contentPane.add(btnAceptar);
		
		btnaActivar = new JButton("Activar");
		btnaActivar.setBounds(301, 213, 110, 23);
		btnaActivar.addActionListener(this);
		contentPane.add(btnaActivar);
		
		txtCiudad = new JTextField();
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(74, 92, 262, 44);
		contentPane.add(txtCiudad);
		
	    txtFrase = new JLabel("");
		txtFrase.setBounds(87, 159, 249, 28);
		contentPane.add(txtFrase);
		
	    btnDesactivar = new JButton("Desactivar");
		btnDesactivar.setBounds(190, 213, 101, 23);
		btnDesactivar.addActionListener(this);
		contentPane.add(btnDesactivar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== btnAceptar) {
			txtFrase.setText("Usted se llama "+ txtNombre.getText()+" y vive en "+ txtCiudad.getText() );
			
		}else if (e.getSource()== btnDesactivar) {
			txtNombre.setEnabled(false);
			txtCiudad.setEnabled(false);
			
			
		}else if (e.getSource()== btnaActivar) {
			txtNombre.setEnabled(true);
			txtCiudad.setEnabled(true);
		}
		
	}
}
