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
import javax.swing.JButton;

public class Ejercicio6 extends JFrame implements MouseListener,ActionListener{

	private JPanel JPanel;
	private JLabel etiNombre;
	private JButton btnEsquina,btnCentro,btnAgrandar,btnAchicar;
	
	public Ejercicio6() {
		setBackground(SystemColor.desktop);
		setTitle("VENTANA OPERACIONES");
		setForeground(new Color(147, 112, 219));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 464);
		JPanel = new JPanel();
		JPanel.setBackground(new Color(147, 112, 219));
		JPanel.setForeground(new Color(147, 112, 219));
		JPanel.setBorder(null);

		setContentPane(JPanel);
		setLocationRelativeTo(null);
		JPanel.setLayout(null);

		iniciar();
	}

	private void iniciar() {
		// TODO Auto-generated method stub
		
		etiNombre = new JLabel("Sergio");
		etiNombre.setBackground(new Color(0, 255, 64));
		etiNombre.setHorizontalAlignment(SwingConstants.CENTER);
		etiNombre.setBounds(154, 26, 98, 36);
		JPanel.add(etiNombre);
		
		btnEsquina = new JButton("Esquina");
		btnEsquina.setBounds(36, 129, 89, 23);
		btnEsquina.addMouseListener(this);
		btnEsquina.addActionListener(this);
		JPanel.add(btnEsquina);
		
		btnCentro = new JButton("Centro");
		btnCentro.setBounds(154, 97, 89, 23);
		btnCentro.addMouseListener(this);
		btnCentro.addActionListener(this);
		JPanel.add(btnCentro);
		
		btnAgrandar = new JButton("Agrandar");
		btnAgrandar.setBounds(282, 129, 89, 23);
		btnAgrandar.addMouseListener(this);
		btnAgrandar.addActionListener(this);
		JPanel.add(btnAgrandar);
		
		btnAchicar = new JButton("Achicar");
		btnAchicar.setBounds(154, 172, 89, 23);
		btnAchicar.addMouseListener(this);
		btnAchicar.addActionListener(this);
		JPanel.add(btnAchicar);
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
		if (e.getSource()==btnEsquina) {
			btnEsquina.setSize(89, 48);
		}else if (e.getSource()==btnCentro) {
			btnCentro.setSize(89, 48);
		}else if (e.getSource()==btnAgrandar) {
			btnAgrandar.setSize(89, 48);
		}else if (e.getSource()==btnAchicar) {
			btnAchicar.setSize(89, 48);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		// TODO Auto-generated method stub
		if (e.getSource()==btnEsquina) {
			btnEsquina.setSize(89, 23);
		}else if (e.getSource()==btnCentro) {
			btnCentro.setSize(89, 23);
		}else if (e.getSource()==btnAgrandar) {
			btnAgrandar.setSize(89, 23);
		}else if (e.getSource()==btnAchicar) {
			btnAchicar.setSize(89, 23);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btnEsquina) {
			etiNombre.setLocation(307, 11);
		}else if (e.getSource()==btnCentro) {
			etiNombre.setLocation(154, 245);
		}else if (e.getSource()==btnAgrandar) {
			etiNombre.setSize(160, 60);
		}else if (e.getSource()==btnAchicar) {
			etiNombre.setSize(89, 23);
		}
	}
}
