import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.JEditorPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MetaBasal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel caloriaTag;
	private JTextField alturaField;
	private JTextField pesoField;
	private JTextField edadField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetaBasal frame = new MetaBasal();
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
	public MetaBasal() {/*
		double peso= 0;
		double altura=0;
		double edad=0;
		double imc=0;
		double metabolismo=0;
		double agua=0;
		boolean sexo =false;*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 339, 635);
		caloriaTag = new JPanel();
		caloriaTag.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(caloriaTag);
		caloriaTag.setLayout(null);
		
		alturaField = new JTextField();
		alturaField.setBounds(245, 57, 34, 20);
		alturaField.setColumns(10);
		caloriaTag.add(alturaField);
		
		JLabel Pesotag = new JLabel("Peso(Kg)");
		Pesotag.setBounds(10, 55, 88, 20);
		Pesotag.setFont(new Font("Tahoma", Font.PLAIN, 18));
		caloriaTag.add(Pesotag);
		
		JLabel Alturatag = new JLabel("Altura(Cm)");
		Alturatag.setBounds(138, 54, 105, 22);
		Alturatag.setFont(new Font("Tahoma", Font.PLAIN, 18));
		caloriaTag.add(Alturatag);
		
		JLabel edadTag = new JLabel("Edad");
		edadTag.setBounds(10, 122, 88, 17);
		edadTag.setFont(new Font("Tahoma", Font.PLAIN, 18));
		caloriaTag.add(edadTag);
		
		pesoField = new JTextField();
		pesoField.setBounds(94, 56, 34, 20);
		pesoField.setColumns(10);
		caloriaTag.add(pesoField);
		
		edadField = new JTextField();
		edadField.setBounds(94, 123, 34, 20);
		edadField.setColumns(10);
		caloriaTag.add(edadField);
		
		
		
		JLabel lblNewLabel = new JLabel("Calculadora metabolica");
		lblNewLabel.setBounds(10, 11, 325, 33);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 27));
		caloriaTag.add(lblNewLabel);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(138, 122, 48, 20);
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		caloriaTag.add(lblSexo);
		
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton botonM = new JRadioButton("M");
		botonM.setBounds(208, 122, 48, 20);
		botonM.setFont(new Font("Dialog", Font.BOLD, 18));
		caloriaTag.add(botonM);
		
		JRadioButton botonF = new JRadioButton("F");
		botonF.setBounds(269, 123, 48, 20);
		botonF.setFont(new Font("Dialog", Font.BOLD, 18));
		caloriaTag.add(botonF);
		group.add(botonM);
		group.add(botonF);
		
		JLabel metabolismoTag = new JLabel("Metabolismo Basal");
		metabolismoTag.setBounds(10, 286, 156, 54);
		metabolismoTag.setFont(new Font("Dialog", Font.BOLD, 16));
		caloriaTag.add(metabolismoTag);
		
		JLabel aguaTag = new JLabel("Ingesta de agua");
		aguaTag.setBounds(10, 337, 156, 54);
		aguaTag.setFont(new Font("Dialog", Font.BOLD, 16));
		caloriaTag.add(aguaTag);
		
		JLabel imcTag = new JLabel(" I.M.C");
		imcTag.setBounds(10, 383, 158, 54);
		imcTag.setFont(new Font("Dialog", Font.BOLD, 16));
		caloriaTag.add(imcTag);
		
		JPanel panel = new JPanel();
		panel.setBounds(180, 301, 76, 33);
		panel.setBackground(new Color(255, 255, 255));
		caloriaTag.add(panel);
		panel.setLayout(null);
		
		JLabel metabolismoResult = new JLabel("0");
		metabolismoResult.setHorizontalAlignment(SwingConstants.RIGHT);
		metabolismoResult.setBounds(0, 0, 76, 33);
		metabolismoResult.setFont(new Font("Dialog", Font.BOLD, 18));
		panel.add(metabolismoResult);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(180, 345, 76, 33);
		panel_1.setBackground(Color.WHITE);
		caloriaTag.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel aguaResult = new JLabel("0");
		aguaResult.setBounds(0, 5, 76, 24);
		aguaResult.setHorizontalAlignment(SwingConstants.RIGHT);
		aguaResult.setFont(new Font("Dialog", Font.BOLD, 18));
		panel_1.add(aguaResult);
		
		JPanel panelimc = new JPanel();
		panelimc.setBounds(180, 391, 76, 33);
		panelimc.setBackground(Color.WHITE);
		caloriaTag.add(panelimc);
		panelimc.setLayout(null);
		
		JLabel imcResult = new JLabel("0");
		imcResult.setBounds(0, 5, 76, 24);
		imcResult.setHorizontalAlignment(SwingConstants.RIGHT);
		imcResult.setFont(new Font("Dialog", Font.BOLD, 18));
		panelimc.add(imcResult);
		
		JLabel lblNewLabel_3 = new JLabel("Calorías");
		lblNewLabel_3.setBounds(269, 318, 57, 16);
		caloriaTag.add(lblNewLabel_3);
		
		JLabel mltag = new JLabel("Litros");
		mltag.setBounds(269, 358, 57, 16);
		caloriaTag.add(mltag);
		
		JButton calcularBoton = new JButton("Calcular");
		calcularBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double peso=Double.parseDouble(pesoField.getText());
				double edad=Double.parseDouble(edadField.getText());
				double altura=Double.parseDouble(alturaField.getText());
				double imc = Math.round((10000*(peso/(Math.pow(altura,2))))*100d)/100d;
				double agua= (double) (Math.round(((peso/452)*14)*1000d)/1000d);
				aguaResult.setText(String.format("% .2f", agua));
				imcResult.setText(String.format("% .2f", imc));
				boolean sexoM=botonM.isSelected();
				boolean sexoF=botonF.isSelected();
				if(sexoM==true) {
				metabolismoResult.setText(String.format("% .2f",((10*peso)+(6.25*altura)-(5*edad)+5)));
				}
				else if(sexoF==true) {
				metabolismoResult.setText(String.format("% .2f",(((10*peso)+(6.25*altura)-(5*edad)-161))));
				}
				else {
					metabolismoResult.setText("selecciona sexo");
				}
			}
		});
		calcularBoton.setBounds(97, 176, 144, 54);
		calcularBoton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		caloriaTag.add(calcularBoton);
	}
}
