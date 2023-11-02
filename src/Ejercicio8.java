import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class Ejercicio8 extends JFrame implements ActionListener{

	private JPanel JPanel;
	private JTextField etiTexto; 
	private JButton btnAzul,btnRojo,btnVerde,btnFondoAzul,btnFondoRojo,btnFondoVerde,btnTransparente,btnOpaca;

	public Ejercicio8() {
		setBackground(SystemColor.desktop);
		setTitle("VENTANA OPERACIONES");
		setForeground(new Color(147, 112, 219));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 464);
		JPanel = new JPanel();
		JPanel.setBackground(Color.DARK_GRAY);
		JPanel.setForeground(new Color(147, 112, 219));
		JPanel.setBorder(null);

		setContentPane(JPanel);
		setLocationRelativeTo(null);
		JPanel.setLayout(null);

		iniciar();
	}

	private void iniciar() {
		// TODO Auto-generated method stub
		
		etiTexto = new JTextField("Espitia");
		etiTexto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiTexto.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto.setBounds(141, 30, 121, 49);
		JPanel.add(etiTexto);
		
		btnAzul = new JButton("Azul");
		btnAzul.setBounds(41, 116, 89, 23);
		btnAzul.addActionListener(this);
		JPanel.add(btnAzul);
		
		btnRojo = new JButton("rojo");
		btnRojo.setBounds(156, 116, 89, 23);
		btnRojo.addActionListener(this);
		JPanel.add(btnRojo);
		
		btnVerde = new JButton("verde");
		btnVerde.setBounds(269, 116, 102, 23);
		btnVerde.addActionListener(this);
		JPanel.add(btnVerde);
		
		btnFondoAzul = new JButton("fondo azul");
		btnFondoAzul.setBounds(41, 163, 89, 23);
		btnFondoAzul.addActionListener(this);
		JPanel.add(btnFondoAzul);
		
		btnFondoRojo = new JButton("fondo rojo");
		btnFondoRojo.setBounds(156, 163, 89, 23);
		btnFondoRojo.addActionListener(this);
		JPanel.add(btnFondoRojo);
		
		btnFondoVerde = new JButton("fondo verde");
		btnFondoVerde.setBounds(269, 163, 102, 23);
		btnFondoVerde.addActionListener(this);
		JPanel.add(btnFondoVerde);
		
		btnTransparente = new JButton("Transparente");
		btnTransparente.setBounds(75, 214, 97, 23);
		btnTransparente.addActionListener(this);
		JPanel.add(btnTransparente);
		
		btnOpaca = new JButton("Opaca");
		btnOpaca.setBounds(217, 214, 89, 23);
		btnOpaca.addActionListener(this);
		JPanel.add(btnOpaca);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btnAzul) {
			etiTexto.setForeground(Color.blue);
		}else if (e.getSource()==btnRojo) {
			etiTexto.setForeground(Color.red);
		}else if (e.getSource()==btnVerde) {
			etiTexto.setForeground(Color.green);
		}
		
		if (e.getSource()==btnFondoAzul) {
			etiTexto.setBackground(Color.blue);
		}else if (e.getSource()==btnFondoRojo) {
			etiTexto.setBackground(Color.RED);
		}else if (e.getSource()==btnFondoVerde) {
			etiTexto.setBackground(Color.green);
		}
		
		if (e.getSource()==btnTransparente) {
			etiTexto.setOpaque(false);
		}else if (e.getSource()==btnOpaca) {
			etiTexto.setOpaque(true);
		}
	}
}
