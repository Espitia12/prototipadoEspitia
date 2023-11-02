
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class Ejercicio11 extends JFrame implements MouseListener,ActionListener{

	private JPanel JPanel;
	private JLabel etiCero,etiUno,etiDos,etiTres,etiCuatro,etiCinco,etiSeis,etiSiete,etiOcho,etiNueve,textNumero;
	private JButton btnBorrar;

	public Ejercicio11() {
		setBackground(SystemColor.desktop);
		setTitle("VENTANA OPERACIONES");
		setForeground(new Color(147, 112, 219));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 464);
		JPanel = new JPanel();
		JPanel.setBackground(Color.WHITE);
		JPanel.setForeground(Color.WHITE);
		JPanel.setBorder(null);

		setContentPane(JPanel);
		setLocationRelativeTo(null);
		JPanel.setLayout(null);
		
		iniciar();
		
	}

	private void iniciar() {
		// TODO Auto-generated method stub

		etiCero = new JLabel("0");
		etiCero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		etiCero.setHorizontalAlignment(SwingConstants.CENTER);
		etiCero.setBounds(28, 39, 76, 30);
		etiCero.addMouseListener(this);
		JPanel.add(etiCero);
		
		etiUno = new JLabel("1");
		etiUno.setHorizontalAlignment(SwingConstants.CENTER);
		etiUno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		etiUno.setBounds(114, 39, 76, 30);
		etiUno.addMouseListener(this);
		JPanel.add(etiUno);
		
		etiDos = new JLabel("2");
		etiDos.setHorizontalAlignment(SwingConstants.CENTER);
		etiDos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		etiDos.setBounds(200, 39, 76, 30);
		etiDos.addMouseListener(this);
		JPanel.add(etiDos);
		
		etiTres = new JLabel("3");
		etiTres.setHorizontalAlignment(SwingConstants.CENTER);
		etiTres.setFont(new Font("Tahoma", Font.PLAIN, 14));
		etiTres.setBounds(286, 39, 76, 30);
		etiTres.addMouseListener(this);
		JPanel.add(etiTres);
		
		etiCuatro = new JLabel("4");
		etiCuatro.setHorizontalAlignment(SwingConstants.CENTER);
		etiCuatro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		etiCuatro.setBounds(28, 98, 76, 30);
		etiCuatro.addMouseListener(this);
		JPanel.add(etiCuatro);
		
		etiCinco = new JLabel("5");
		etiCinco.setHorizontalAlignment(SwingConstants.CENTER);
		etiCinco.setFont(new Font("Tahoma", Font.PLAIN, 14));
		etiCinco.setBounds(114, 98, 76, 30);
		etiCinco.addMouseListener(this);
		JPanel.add(etiCinco);
		
		etiSeis = new JLabel("6");
		etiSeis.setHorizontalAlignment(SwingConstants.CENTER);
		etiSeis.setFont(new Font("Tahoma", Font.PLAIN, 14));
		etiSeis.setBounds(200, 98, 76, 30);
		etiSeis.addMouseListener(this);
		JPanel.add(etiSeis);
		
		etiSiete = new JLabel("7");
		etiSiete.setHorizontalAlignment(SwingConstants.CENTER);
		etiSiete.setFont(new Font("Tahoma", Font.PLAIN, 14));
		etiSiete.setBounds(286, 98, 76, 30);
		etiSiete.addMouseListener(this);
		JPanel.add(etiSiete);
		
		etiOcho = new JLabel("8");
		etiOcho.setHorizontalAlignment(SwingConstants.CENTER);
		etiOcho.setFont(new Font("Tahoma", Font.PLAIN, 14));
		etiOcho.setBounds(114, 159, 76, 30);
		etiOcho.addMouseListener(this);
		JPanel.add(etiOcho);
		
		etiNueve = new JLabel("9");
		etiNueve.setHorizontalAlignment(SwingConstants.CENTER);
		etiNueve.setFont(new Font("Tahoma", Font.PLAIN, 14));
		etiNueve.setBounds(200, 159, 76, 30);
		etiNueve.addMouseListener(this);
		JPanel.add(etiNueve);
		
		textNumero = new JLabel("");
		textNumero.setBounds(28, 254, 377, 67);
		JPanel.add(textNumero);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBackground(Color.GRAY);
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBorrar.setBounds(136, 363, 165, 36);
		btnBorrar.addActionListener(this);
		JPanel.add(btnBorrar);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
        
		if (e.getSource()==etiCero) {
			textNumero.setText(textNumero.getText()+etiCero.getText());
		}else if (e.getSource()==etiUno) {
			textNumero.setText(textNumero.getText()+etiUno.getText());
		}else if (e.getSource()==etiDos) {
			textNumero.setText(textNumero.getText()+etiDos.getText());
		}else if (e.getSource()==etiTres) {
			textNumero.setText(textNumero.getText()+etiTres.getText());
		}else if (e.getSource()==etiCuatro) {
			textNumero.setText(textNumero.getText()+etiCuatro.getText());
		}else if (e.getSource()==etiCinco) {
			textNumero.setText(textNumero.getText()+etiCinco.getText());
		}else if (e.getSource()==etiSeis) {
			textNumero.setText(textNumero.getText()+etiSeis.getText());
		}else if (e.getSource()==etiSiete) {
			textNumero.setText(textNumero.getText()+etiSiete.getText());
		}else if (e.getSource()==etiOcho) {
			textNumero.setText(textNumero.getText()+etiOcho.getText());
		}else if (e.getSource()==etiNueve) {
			textNumero.setText(textNumero.getText()+etiNueve.getText());
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btnBorrar) {
			textNumero.setText("");
		}
	}

}
