import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Ejercicio10 extends JFrame  implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel JPanel;
	private JTextField txtPalabra1;
	private JTextField txtPalabra2;
	private JButton btnConcatena;
	private JLabel etiTexto;

	public Ejercicio10() {
		setBackground(SystemColor.desktop);
		setTitle("VENTANA OPERACIONES");
		setForeground(new Color(147, 112, 219));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 464);
		JPanel = new JPanel();
		JPanel.setBackground(Color.LIGHT_GRAY);
		JPanel.setForeground(Color.BLACK);
		JPanel.setBorder(null);

		setContentPane(JPanel);
		setLocationRelativeTo(null);
		JPanel.setLayout(null);
		
		iniciar();
	}

	private void iniciar() {
		// TODO Auto-generated method stub

		txtPalabra1 = new JTextField();
		txtPalabra1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPalabra1.setBounds(35, 41, 128, 44);
		JPanel.add(txtPalabra1);
		txtPalabra1.setColumns(10);
		
		txtPalabra2 = new JTextField();
		txtPalabra2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPalabra2.setColumns(10);
		txtPalabra2.setBounds(233, 41, 128, 44);
		JPanel.add(txtPalabra2);
		
		etiTexto = new JLabel("");
		etiTexto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiTexto.setBounds(120, 152, 180, 49);
		JPanel.add(etiTexto);
		
		btnConcatena = new JButton("Concatena");
		btnConcatena.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConcatena.setBounds(130, 227, 147, 44);
		btnConcatena.addActionListener(this);
		JPanel.add(btnConcatena);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btnConcatena) {
			etiTexto.setText(txtPalabra1.getText()+txtPalabra2.getText());
		}
	}
}
