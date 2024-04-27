import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

public class ControlEscolar1 extends JFrame implements MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControlEscolar1 frame = new ControlEscolar1();
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
	public ControlEscolar1() 
	{
		//this.entry(this);
		this.login(this);
		//this.eliminarAlumno(this);
		//this.inicio(this);
		//addKeyListener(this);
	}
	
	public void entry(JFrame frame)
	{
		this.setTitle("School Smart Zone");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 192));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("School Smart Zone");
		lblNewLabel.setBounds(0, 0, 974, 45);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 37));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sistema de Control escolar");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(400, 91, 200, 14);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 64, 128));
		panel_1.setBounds(100, 180, 770, 400);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Ingresa tu rol");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(340, 30, 120, 25);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(120, 110, 200, 200);
		panel_1.add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(454, 110, 200, 200);
		panel_1.add(panel_2_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Alumno");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1.setBounds(159, 321, 120, 25);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Docente");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_1.setBounds(496, 321, 120, 25);
		panel_1.add(lblNewLabel_2_1_1);
	}
	
	public void login(JFrame frame)
	{
		this.setTitle("School Smart Zone - Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.addMouseListener(this);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Bienvenido");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(440, 150, 120, 14);
		contentPane.add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 64, 128));
		panel.setBounds(230, 190, 550, 300);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(70, 70, 400, 40);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Acceder");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				frame.remove(panel);
				
				inicio(frame);
				
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		btnNewButton.setBounds(210, 230, 140, 40);
		panel.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(70, 147, 400, 40);
		panel.add(passwordField);
		
		JLabel lblNewLabel_5 = new JLabel("email o nombre de usuario");
		lblNewLabel_5.setBounds(70, 55, 150, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Contraseña");
		lblNewLabel_5_1.setBounds(70, 135, 150, 14);
		panel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_4 = new JLabel("Olvidé mi contraseña");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(440, 501, 140, 14);
		contentPane.add(lblNewLabel_4);
	
	}
	
	public void inicio(JFrame frame)
	{
		this.setTitle("School Smart Zone - inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 64, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 960, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JLabel lblNewLabel_7 = new JLabel("Grupos");
		lblNewLabel_7.setBounds(200, 20, 50, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6 = new JLabel("Materias");
		lblNewLabel_6.setBounds(330, 20, 70, 15);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("Calificaciones");
		lblNewLabel_8.setBounds(450, 20, 90, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Horarios");
		lblNewLabel_9.setBounds(600, 20, 60, 14);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Usuarios");
		lblNewLabel_10.setBounds(730, 20, 70, 14);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_12 = new JLabel("Cerrar sesión");
		lblNewLabel_12.setBounds(850, 20, 70, 14);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("School Smart Zone");
		lblNewLabel_13.setBounds(25, 11, 100, 14);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_13_1 = new JLabel("Control escolar");
		lblNewLabel_13_1.setBounds(35, 36, 80, 14);
		panel.add(lblNewLabel_13_1);
		
		JLabel lblNewLabel_11 = new JLabel("Inicio");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_11.setBounds(450, 108, 100, 25);
		contentPane.add(lblNewLabel_11);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 255));
		panel_1.setBounds(78, 165, 830, 430);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 5, 0, 0));
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(0, 0, 128));
		panel_1.add(panel_12);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(255, 0, 255));
		panel_1.add(panel_11);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(192, 192, 192));
		panel_1.add(panel_10);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(128, 0, 128));
		panel_1.add(panel_9);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(64, 0, 0));
		panel_1.add(panel_8);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(0, 128, 0));
		panel_1.add(panel_7);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(128, 64, 64));
		panel_1.add(panel_6);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 255, 255));
		panel_1.add(panel_5);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 128, 128));
		panel_1.add(panel_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 64, 0));
		panel_1.add(panel_3);

		
		JMenuBar barra = new JMenuBar(); //se puede colocar mas menús, constructor vacío
		JMenu menuFile = new JMenu("Alumnos");
		JMenu menuFile1 = new JMenu("Docentes");
		JMenu menuFile2 = new JMenu("Más");
		
		JMenuItem download = new JMenuItem("Descargar información");
		download.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				descargarAlumno(frame);
				frame.repaint();
				frame.revalidate();	
			}
			
		});
		JMenuItem consultar = new JMenuItem("Consultar");
		consultar.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				consultarAlumno(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		JMenuItem crear = new JMenuItem("Añadir");
		crear.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				crearAlumno(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		JMenuItem edit = new JMenuItem("Editar");
		edit.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				editarAlumno(frame);
				frame.repaint();
				frame.revalidate();
			}
		});
		JMenuItem delete = new JMenuItem("Eliminar");
		delete.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				eliminarAlumno(frame);
				frame.repaint();
				frame.revalidate();
			}
		});
		
		
		menuFile.add(download);
		menuFile.add(consultar);
		menuFile.add(crear);
		menuFile.add(edit);
		menuFile.add(delete);
		
		JMenuItem download1 = new JMenuItem("Descargar información");
		download1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				descargarDocente(frame);
				frame.repaint();
				frame.revalidate();		
			}
			
		});
		JMenuItem consultar1 = new JMenuItem("Consultar");
		consultar1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				consultarDocente(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		JMenuItem crear1 = new JMenuItem("Añadir");
		crear1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				crearDocente(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		JMenuItem edit1 = new JMenuItem("Editar");
		edit1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				editarDocente(frame);
				frame.repaint();
				frame.revalidate();	
			}
			
		});
		JMenuItem delete1 = new JMenuItem("Eliminar");
		delete1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				eliminarDocente(frame);
				frame.repaint();
				frame.revalidate();	
			}
			
		});
		
		menuFile1.add(download1);
		menuFile1.add(consultar1);
		menuFile1.add(crear1);
		menuFile1.add(edit1);
		menuFile1.add(delete1);
		
		JMenuItem exit = new JMenuItem("Información");
		JMenuItem help = new JMenuItem("Ayuda");
		
		menuFile2.add(exit);
		menuFile2.add(help);
		
		barra.add(menuFile);
		barra.add(menuFile1);
		barra.add(menuFile2);
		
		this.setJMenuBar(barra);
	}
	
	public void descargarAlumno(JFrame frame)
	{
		this.setTitle("School Smart Zone - inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 64, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_16 = new JLabel("Descargar información del alumno");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_16.setBounds(341, 32, 300, 25);
		contentPane.add(lblNewLabel_16);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(65, 97, 850, 500);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 128));
		panel_1.setBounds(635, 45, 170, 220);
		panel.add(panel_1);
		
		JLabel lblNewLabel_17 = new JLabel("Nombre completo:");
		lblNewLabel_17.setBounds(46, 58, 100, 14);
		panel.add(lblNewLabel_17);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent e) //validar q solo ingrese numeros
			{
				char character = e.getKeyChar();
				if(!Character.isDigit(character))
				{
					e.consume();
				}
			}
		});
		textField_9.setBounds(204, 55, 370, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_17_1 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_17_1.setBounds(46, 96, 100, 14);
		panel.add(lblNewLabel_17_1);
		
		JLabel lblNewLabel_17_2 = new JLabel("CURP:");
		lblNewLabel_17_2.setBounds(46, 133, 100, 14);
		panel.add(lblNewLabel_17_2);
		
		JLabel lblNewLabel_17_3 = new JLabel("Dirección:");
		lblNewLabel_17_3.setBounds(46, 168, 100, 14);
		panel.add(lblNewLabel_17_3);
		
		JLabel lblNewLabel_17_4 = new JLabel("Número de teléfono:");
		lblNewLabel_17_4.setBounds(46, 206, 100, 14);
		panel.add(lblNewLabel_17_4);
		
		JLabel lblNewLabel_17_5 = new JLabel("Correo electrónico:");
		lblNewLabel_17_5.setBounds(46, 243, 100, 14);
		panel.add(lblNewLabel_17_5);
		
		JLabel lblNewLabel_17_6 = new JLabel("Carrera:");
		lblNewLabel_17_6.setBounds(46, 282, 100, 14);
		panel.add(lblNewLabel_17_6);
		
		JLabel lblNewLabel_17_7 = new JLabel("Semestre:");
		lblNewLabel_17_7.setBounds(46, 322, 100, 14);
		panel.add(lblNewLabel_17_7);
		
		JLabel lblNewLabel_17_8 = new JLabel("Información de contacto");
		lblNewLabel_17_8.setBounds(46, 370, 100, 14);
		panel.add(lblNewLabel_17_8);
		
		JLabel lblNewLabel_17_9 = new JLabel("Nombre del tutor:");
		lblNewLabel_17_9.setBounds(46, 410, 100, 14);
		panel.add(lblNewLabel_17_9);
		
		JLabel lblNewLabel_17_10 = new JLabel("Teléfono:");
		lblNewLabel_17_10.setBounds(367, 410, 100, 14);
		panel.add(lblNewLabel_17_10);
		
		JButton btnNewButton_6 = new JButton("Descargar información");
		btnNewButton_6.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(null, "Descarga exitosa");	
			}
		});
		btnNewButton_6.setBounds(635, 466, 200, 23);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_5_1 = new JButton("Volver");
		btnNewButton_5_1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				inicio(frame);
				frame.repaint();
				frame.revalidate();
				
			}	
		});
		btnNewButton_5_1.setBounds(500, 465, 100, 23);
		panel.add(btnNewButton_5_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(20, 359, 800, 85);
		panel.add(panel_2);	
	}
	
	public void descargarDocente(JFrame frame)
	{
		this.setTitle("School Smart Zone - inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 64, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_16 = new JLabel("Descargar información del docente");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_16.setBounds(341, 32, 300, 25);
		contentPane.add(lblNewLabel_16);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(65, 97, 850, 500);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 128));
		panel_1.setBounds(635, 45, 170, 220);
		panel.add(panel_1);
		
		JLabel lblNewLabel_17 = new JLabel("Nombre completo:");
		lblNewLabel_17.setBounds(46, 58, 100, 14);
		panel.add(lblNewLabel_17);
		
		textField_9 = new JTextField();
		textField_9.setBounds(204, 55, 370, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_17_1 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_17_1.setBounds(46, 96, 100, 14);
		panel.add(lblNewLabel_17_1);
		
		JLabel lblNewLabel_17_2 = new JLabel("CURP:");
		lblNewLabel_17_2.setBounds(46, 133, 100, 14);
		panel.add(lblNewLabel_17_2);
		
		JLabel lblNewLabel_17_3 = new JLabel("Dirección:");
		lblNewLabel_17_3.setBounds(46, 168, 100, 14);
		panel.add(lblNewLabel_17_3);
		
		JLabel lblNewLabel_17_4 = new JLabel("Número de teléfono:");
		lblNewLabel_17_4.setBounds(46, 206, 100, 14);
		panel.add(lblNewLabel_17_4);
		
		JLabel lblNewLabel_17_5 = new JLabel("Correo electrónico:");
		lblNewLabel_17_5.setBounds(46, 243, 100, 14);
		panel.add(lblNewLabel_17_5);
		
		JLabel lblNewLabel_17_6 = new JLabel("Ocupación:");
		lblNewLabel_17_6.setBounds(46, 282, 100, 14);
		panel.add(lblNewLabel_17_6);
		
		JLabel lblNewLabel_17_7 = new JLabel("Materias impartidas:");
		lblNewLabel_17_7.setBounds(46, 322, 100, 14);
		panel.add(lblNewLabel_17_7);
		
		JLabel lblNewLabel_17_8 = new JLabel("Información académica");
		lblNewLabel_17_8.setBounds(46, 370, 100, 14);
		panel.add(lblNewLabel_17_8);
		
		JLabel lblNewLabel_17_9 = new JLabel("Estudios:");
		lblNewLabel_17_9.setBounds(46, 410, 100, 14);
		panel.add(lblNewLabel_17_9);
		
		JLabel lblNewLabel_17_10 = new JLabel("Carrera cursada:");
		lblNewLabel_17_10.setBounds(367, 410, 100, 14);
		panel.add(lblNewLabel_17_10);
		
		JButton btnNewButton_6 = new JButton("Descargar información");
		btnNewButton_6.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(null, "Descarga exitosa");
				
			}
		});
		btnNewButton_6.setBounds(635, 466, 200, 23);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_5_1 = new JButton("Volver");
		btnNewButton_5_1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				inicio(frame);
				frame.repaint();
				frame.revalidate();
				
			}	
		});
		btnNewButton_5_1.setBounds(500, 465, 100, 23);
		panel.add(btnNewButton_5_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(20, 359, 800, 85);
		panel.add(panel_2);	
	}
	
	public void crearAlumno(JFrame frame)
	{
		this.setTitle("School Smart Zone");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_18 = new JLabel("Control escolar");
		lblNewLabel_18.setBounds(40, 30, 100, 14);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_18_1 = new JLabel("Añadir a un nuevo alumno");
		lblNewLabel_18_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_18_1.setBounds(460, 25, 300, 25);
		contentPane.add(lblNewLabel_18_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 0));
		panel.setBounds(57, 90, 870, 530);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_19 = new JLabel("Para añadir a un nuevo estudiante, rellene los siguientes datos con la información que corresponde:");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_19.setBounds(35, 30, 700, 20);
		panel.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Nombre completo:           (Apellido paterno, apellido materno y nombre(s))");
		lblNewLabel_20.setBounds(35, 75, 400, 14);
		panel.add(lblNewLabel_20);
		
		textField_10 = new JTextField();
		textField_10.setBounds(35, 93, 550, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_20_1 = new JLabel("Fecha de nacimiento:\r\n");
		lblNewLabel_20_1.setBounds(35, 124, 400, 14);
		panel.add(lblNewLabel_20_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(35, 140, 550, 20);
		panel.add(textField_11);
		
		JLabel lblNewLabel_20_1_1 = new JLabel("CURP:");
		lblNewLabel_20_1_1.setBounds(35, 173, 400, 14);
		panel.add(lblNewLabel_20_1_1);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(35, 189, 550, 20);
		panel.add(textField_12);
		
		JLabel lblNewLabel_20_1_1_1 = new JLabel("Correo electrónico:");
		lblNewLabel_20_1_1_1.setBounds(35, 220, 400, 14);
		panel.add(lblNewLabel_20_1_1_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(35, 235, 550, 20);
		panel.add(textField_13);
		
		JLabel lblNewLabel_20_1_1_1_1 = new JLabel("Número de teléfono (personal):");
		lblNewLabel_20_1_1_1_1.setBounds(35, 266, 400, 14);
		panel.add(lblNewLabel_20_1_1_1_1);
		
		textField_14 = new JTextField();
		textField_14.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent e) //validar q solo ingrese numeros
			{
				char character = e.getKeyChar();
				if(!Character.isDigit(character))
				{
					e.consume();
				}
			}
		});
		textField_14.setColumns(10);
		textField_14.setBounds(35, 283, 550, 20);
		panel.add(textField_14);
		
		JLabel lblNewLabel_20_1_1_1_1_1 = new JLabel("Nacionalidad");
		lblNewLabel_20_1_1_1_1_1.setBounds(35, 314, 100, 14);
		panel.add(lblNewLabel_20_1_1_1_1_1);
		
		String nacionalidad[] = {"Mexicano", "Estadounidense", "Coreano", "Japonés", "Chino", "Español"};
		JComboBox nacionalidadBox = new JComboBox(nacionalidad);
		nacionalidadBox.setBounds(36, 330, 100, 20);
		nacionalidadBox.setFont(new Font("Consolas", Font.BOLD, 12));
		panel.add(nacionalidadBox);	
		
		JLabel lblNewLabel_20_1_1_1_1_1_1 = new JLabel("Tipo de sangre");
		lblNewLabel_20_1_1_1_1_1_1.setBounds(185, 314, 100, 14);
		panel.add(lblNewLabel_20_1_1_1_1_1_1);
		
		String sangre[] = {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};
		JComboBox sangreBox = new JComboBox(sangre);
		sangreBox.setBounds(180, 330, 100, 20);
		sangreBox.setFont(new Font("Consolas", Font.BOLD, 12));
		panel.add(sangreBox);	
		
		JLabel lblNewLabel_20_1_1_1_1_1_1_1 = new JLabel("Estado civil");
		lblNewLabel_20_1_1_1_1_1_1_1.setBounds(335, 314, 100, 14);
		panel.add(lblNewLabel_20_1_1_1_1_1_1_1);
		
		String civil[] = {"Soltero", "Casado", "Divorciado", "Viudo"};
		JComboBox civilBox = new JComboBox(civil);
		civilBox.setBounds(330, 330, 100, 20);
		civilBox.setFont(new Font("Consolas", Font.BOLD, 12));
		panel.add(civilBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(630, 75, 200, 250);
		panel.add(panel_1);
		
		JLabel lblNewLabel_21 = new JLabel("Inserta tu foto");
		panel_1.add(lblNewLabel_21);
		
		JLabel lblNewLabel_20_1_1_1_1_1_1_1_1 = new JLabel("Género");
		lblNewLabel_20_1_1_1_1_1_1_1_1.setBounds(480, 314, 100, 14);
		panel.add(lblNewLabel_20_1_1_1_1_1_1_1_1);
		
		String genero[] = {"Femenino", "Masculino", "Prefiero no responder"};
		JComboBox generoBox = new JComboBox(genero);
		generoBox.setBounds(475, 330, 100, 20);
		generoBox.setFont(new Font("Consolas", Font.BOLD, 12));
		panel.add(generoBox);
		
		JLabel lblNewLabel_20_1_1_1_1_1_2 = new JLabel("Idiomas:");
		lblNewLabel_20_1_1_1_1_1_2.setBounds(35, 370, 100, 14);
		panel.add(lblNewLabel_20_1_1_1_1_1_2);
		
		JCheckBox itemBox1 = new JCheckBox("Inglés");
		itemBox1.setBounds(36, 385, 80, 30);
		itemBox1.setOpaque(false); 
		panel.add(itemBox1);
		
		JCheckBox itemBox2 = new JCheckBox("Francés");
		itemBox2.setBounds(120, 385, 80, 30);
		itemBox2.setOpaque(false); 
		panel.add(itemBox2);
		
		JCheckBox itemBox3 = new JCheckBox("Portugués");
		itemBox3.setBounds(220, 385, 120, 30);
		itemBox3.setOpaque(false); 
		panel.add(itemBox3);
		
		JLabel lblNewLabel_20_1_1_1_1_1_2_1 = new JLabel("Alergias o padecimientos de salud:");
		lblNewLabel_20_1_1_1_1_1_2_1.setBounds(35, 426, 300, 14);
		panel.add(lblNewLabel_20_1_1_1_1_1_2_1);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(35, 443, 550, 20);
		panel.add(textField_15);
		
		JButton btnNewButton_7 = new JButton("Siguiente");
		btnNewButton_7.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				crearAlumno2(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		btnNewButton_7.setBounds(756, 496, 89, 23);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_7_1 = new JButton("Volver");
		btnNewButton_7_1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				inicio(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		btnNewButton_7_1.setBounds(646, 496, 89, 23);
		panel.add(btnNewButton_7_1);
	}

	public void crearAlumno2(JFrame frame)
	{
		this.setTitle("School Smart Zone");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_18 = new JLabel("Control escolar");
		lblNewLabel_18.setBounds(40, 30, 100, 14);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_18_1 = new JLabel("Añadir a un nuevo alumno");
		lblNewLabel_18_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_18_1.setBounds(460, 25, 300, 25);
		contentPane.add(lblNewLabel_18_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 0));
		panel.setBounds(57, 90, 870, 530);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_19 = new JLabel("Para añadir a un nuevo estudiante, rellene los siguientes datos con la información que corresponde:");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_19.setBounds(35, 30, 700, 20);
		panel.add(lblNewLabel_19);
		
		JLabel lblNewLabel_22 = new JLabel("Información del tutor:");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_22.setBounds(35, 71, 200, 14);
		panel.add(lblNewLabel_22);
		
		JLabel lblNewLabel_22_1 = new JLabel("Nombre completo:");
		lblNewLabel_22_1.setBounds(35, 100, 200, 14);
		panel.add(lblNewLabel_22_1);
		
		JLabel lblNewLabel_22_2 = new JLabel("Número de teléfono:");
		lblNewLabel_22_2.setBounds(35, 135, 200, 14);
		panel.add(lblNewLabel_22_2);
		
		JLabel lblNewLabel_22_3 = new JLabel("Dirección:");
		lblNewLabel_22_3.setBounds(35, 170, 200, 14);
		panel.add(lblNewLabel_22_3);
		
		JLabel lblNewLabel_22_4 = new JLabel("Relación:");
		lblNewLabel_22_4.setBounds(35, 210, 200, 14);
		panel.add(lblNewLabel_22_4);
		
		JRadioButton mom = new JRadioButton("Madre");
		mom.setBounds(160, 210, 180, 30);
		mom.setFont(new Font("Consolas", Font.BOLD, 12));
		mom.setOpaque(false); 
		panel.add(mom);
		
		JRadioButton dad = new JRadioButton("Padre");
		dad.setBounds(260, 210, 180, 30);
		dad.setFont(new Font("Consolas", Font.BOLD, 12));
		dad.setOpaque(false); 
		panel.add(dad);
		
		JRadioButton otro = new JRadioButton("Otro");
		otro.setBounds(360, 210, 180, 30);
		otro.setFont(new Font("Consolas", Font.BOLD, 12));
		otro.setOpaque(false); 
		panel.add(otro);
		
		ButtonGroup terms = new ButtonGroup();
		terms.add(mom);
		terms.add(dad);
		terms.add(otro);
		
		textField_16 = new JTextField();
		textField_16.setBounds(160, 96, 300, 20);
		panel.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(160, 132, 300, 20);
		panel.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(160, 167, 300, 20);
		panel.add(textField_18);
		
		JLabel lblNewLabel_22_4_1 = new JLabel("Características:");
		lblNewLabel_22_4_1.setBounds(35, 259, 200, 14);
		panel.add(lblNewLabel_22_4_1);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(35, 280, 300, 20);
		panel.add(textField_19);
		
		JButton btnNewButton_8 = new JButton("Finalizar");
		btnNewButton_8.setBounds(748, 496, 89, 23);
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_8_1 = new JButton("Volver");
		btnNewButton_8_1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				crearAlumno(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		btnNewButton_8_1.setBounds(629, 496, 89, 23);
		panel.add(btnNewButton_8_1);
	}
	
	public void crearDocente(JFrame frame)
	{
		this.setTitle("School Smart Zone");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
contentPane.setLayout(null);
		
		JLabel lblNewLabel_18 = new JLabel("Control escolar");
		lblNewLabel_18.setBounds(40, 30, 100, 14);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_18_1 = new JLabel("Añadir a un nuevo docente");
		lblNewLabel_18_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_18_1.setBounds(460, 25, 300, 25);
		contentPane.add(lblNewLabel_18_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 0));
		panel.setBounds(57, 90, 870, 530);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_19 = new JLabel("Para añadir a un nuevo docente, rellene los siguientes datos con la información que corresponde:");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_19.setBounds(35, 30, 700, 20);
		panel.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Nombre completo:           (Apellido paterno, apellido materno y nombre(s))");
		lblNewLabel_20.setBounds(35, 75, 400, 14);
		panel.add(lblNewLabel_20);
		
		textField_10 = new JTextField();
		textField_10.setBounds(35, 93, 550, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_20_1 = new JLabel("Fecha de nacimiento:\r\n");
		lblNewLabel_20_1.setBounds(35, 124, 400, 14);
		panel.add(lblNewLabel_20_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(35, 140, 550, 20);
		panel.add(textField_11);
		
		JLabel lblNewLabel_20_1_1 = new JLabel("CURP:");
		lblNewLabel_20_1_1.setBounds(35, 173, 400, 14);
		panel.add(lblNewLabel_20_1_1);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(35, 189, 550, 20);
		panel.add(textField_12);
		
		JLabel lblNewLabel_20_1_1_1 = new JLabel("Correo electrónico:");
		lblNewLabel_20_1_1_1.setBounds(35, 220, 400, 14);
		panel.add(lblNewLabel_20_1_1_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(35, 235, 550, 20);
		panel.add(textField_13);
		
		JLabel lblNewLabel_20_1_1_1_1 = new JLabel("Número de teléfono (personal):");
		lblNewLabel_20_1_1_1_1.setBounds(35, 266, 400, 14);
		panel.add(lblNewLabel_20_1_1_1_1);
		
		textField_14 = new JTextField();
		textField_14.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent e) //validar q solo ingrese numeros
			{
				char character = e.getKeyChar();
				if(!Character.isDigit(character))
				{
					e.consume();
				}
			}
		});
		textField_14.setColumns(10);
		textField_14.setBounds(35, 283, 550, 20);
		panel.add(textField_14);
		
		JLabel lblNewLabel_20_1_1_1_1_1 = new JLabel("Nacionalidad");
		lblNewLabel_20_1_1_1_1_1.setBounds(35, 314, 100, 14);
		panel.add(lblNewLabel_20_1_1_1_1_1);
		
		String nacionalidad[] = {"Mexicano", "Estadounidense", "Coreano", "Japonés", "Chino", "Español"};
		JComboBox nacionalidadBox = new JComboBox(nacionalidad);
		nacionalidadBox.setBounds(36, 330, 100, 20);
		nacionalidadBox.setFont(new Font("Consolas", Font.BOLD, 12));
		panel.add(nacionalidadBox);	
		
		JLabel lblNewLabel_20_1_1_1_1_1_1 = new JLabel("Tipo de sangre");
		lblNewLabel_20_1_1_1_1_1_1.setBounds(185, 314, 100, 14);
		panel.add(lblNewLabel_20_1_1_1_1_1_1);
		
		String sangre[] = {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};
		JComboBox sangreBox = new JComboBox(sangre);
		sangreBox.setBounds(180, 330, 100, 20);
		sangreBox.setFont(new Font("Consolas", Font.BOLD, 12));
		panel.add(sangreBox);	
		
		JLabel lblNewLabel_20_1_1_1_1_1_1_1 = new JLabel("Estado civil");
		lblNewLabel_20_1_1_1_1_1_1_1.setBounds(335, 314, 100, 14);
		panel.add(lblNewLabel_20_1_1_1_1_1_1_1);
		
		String civil[] = {"Soltero", "Casado", "Divorciado", "Viudo"};
		JComboBox civilBox = new JComboBox(civil);
		civilBox.setBounds(330, 330, 100, 20);
		civilBox.setFont(new Font("Consolas", Font.BOLD, 12));
		panel.add(civilBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(630, 75, 200, 250);
		panel.add(panel_1);
		
		JLabel lblNewLabel_21 = new JLabel("Inserta tu foto");
		panel_1.add(lblNewLabel_21);
		
		JLabel lblNewLabel_20_1_1_1_1_1_1_1_1 = new JLabel("Género");
		lblNewLabel_20_1_1_1_1_1_1_1_1.setBounds(480, 314, 100, 14);
		panel.add(lblNewLabel_20_1_1_1_1_1_1_1_1);
		
		String genero[] = {"Femenino", "Masculino", "Prefiero no responder"};
		JComboBox generoBox = new JComboBox(genero);
		generoBox.setBounds(475, 330, 100, 20);
		generoBox.setFont(new Font("Consolas", Font.BOLD, 12));
		panel.add(generoBox);
		
		JLabel lblNewLabel_20_1_1_1_1_1_2 = new JLabel("Idiomas:");
		lblNewLabel_20_1_1_1_1_1_2.setBounds(35, 370, 100, 14);
		panel.add(lblNewLabel_20_1_1_1_1_1_2);
		
		JCheckBox itemBox1 = new JCheckBox("Inglés");
		itemBox1.setBounds(36, 385, 80, 30);
		itemBox1.setOpaque(false); 
		panel.add(itemBox1);
		
		JCheckBox itemBox2 = new JCheckBox("Francés");
		itemBox2.setBounds(120, 385, 80, 30);
		itemBox2.setOpaque(false); 
		panel.add(itemBox2);
		
		JCheckBox itemBox3 = new JCheckBox("Portugués");
		itemBox3.setBounds(220, 385, 120, 30);
		itemBox3.setOpaque(false); 
		panel.add(itemBox3);
		
		JLabel lblNewLabel_20_1_1_1_1_1_2_1 = new JLabel("Comentarios adicionales:");
		lblNewLabel_20_1_1_1_1_1_2_1.setBounds(35, 426, 300, 14);
		panel.add(lblNewLabel_20_1_1_1_1_1_2_1);
		
		JTextArea bioText = new JTextArea();
		bioText.setBounds(36, 445, 550, 40);
		bioText.setFont(new Font("Consolas", Font.BOLD, 16));
		panel.add(bioText);
		
		JButton btnNewButton_7 = new JButton("Finalizar");
		btnNewButton_7.setBounds(756, 496, 89, 23);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_7_1 = new JButton("Volver");
		btnNewButton_7_1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				inicio(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		btnNewButton_7_1.setBounds(646, 496, 89, 23);
		panel.add(btnNewButton_7_1);
	}
	
	
	public void consultarAlumno(JFrame frame)
	{
		this.setTitle("School Smart Zone");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("General");
		btnNewButton_1.setBounds(20, 140, 150, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Información familiar");
		btnNewButton_2.setBounds(20, 280, 150, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Información académica");
		btnNewButton_3.setBounds(20, 420, 150, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Otros...");
		btnNewButton_4.setBounds(20, 560, 150, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_14 = new JLabel("Control escolar");
		lblNewLabel_14.setBounds(50, 34, 80, 14);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_14_1 = new JLabel("Consulta de alumno");
		lblNewLabel_14_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14_1.setBounds(450, 34, 200, 14);
		contentPane.add(lblNewLabel_14_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 255));
		panel.setBounds(220, 100, 720, 500);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_15 = new JLabel("Información general del alumno");
		lblNewLabel_15.setBounds(37, 38, 160, 14);
		panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_15_1 = new JLabel("Apellido paterno:");
		lblNewLabel_15_1.setBounds(290, 85, 160, 14);
		panel.add(lblNewLabel_15_1);
		
		JLabel lblNewLabel_15_1_1 = new JLabel("Apellido materno:");
		lblNewLabel_15_1_1.setBounds(290, 135, 160, 14);
		panel.add(lblNewLabel_15_1_1);
		
		JLabel lblNewLabel_15_1_2 = new JLabel("Nombre(s):");
		lblNewLabel_15_1_2.setBounds(290, 180, 160, 14);
		panel.add(lblNewLabel_15_1_2);
		
		JLabel lblNewLabel_15_1_3 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_15_1_3.setBounds(50, 310, 160, 14);
		panel.add(lblNewLabel_15_1_3);
		
		JLabel lblNewLabel_15_1_3_1 = new JLabel("Género:");
		lblNewLabel_15_1_3_1.setBounds(50, 350, 160, 14);
		panel.add(lblNewLabel_15_1_3_1);
		
		JLabel lblNewLabel_15_1_3_2 = new JLabel("Dirección de residencia:");
		lblNewLabel_15_1_3_2.setBounds(290, 225, 160, 14);
		panel.add(lblNewLabel_15_1_3_2);
		
		JLabel lblNewLabel_15_1_3_3 = new JLabel("Número de teléfono:");
		lblNewLabel_15_1_3_3.setBounds(290, 270, 160, 14);
		panel.add(lblNewLabel_15_1_3_3);
		
		JLabel lblNewLabel_15_1_3_4 = new JLabel("Correo electrónico:");
		lblNewLabel_15_1_3_4.setBounds(290, 315, 160, 14);
		panel.add(lblNewLabel_15_1_3_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(60, 80, 170, 200);
		panel.add(panel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(435, 80, 230, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(435, 130, 230, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(435, 175, 230, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(435, 220, 230, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(435, 265, 230, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(435, 310, 230, 20);
		panel.add(textField_6);
		
		String colonias[] = {"Centro", "Camino Real", "Pedregal", "Conchalito", "La ocho"};
		JComboBox locations = new JComboBox(colonias);
		locations.setBounds(130, 350, 100, 20);
		locations.setFont(new Font("Consolas", Font.BOLD, 12));
		panel.add(locations);	
		
		JButton btnNewButton_5 = new JButton("Descargar información");
		btnNewButton_5.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(null, "Descarga exitosa");
				
			}
		});
		btnNewButton_5.setBounds(37, 447, 180, 23);
		panel.add(btnNewButton_5);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(164, 307, 100, 20);
		panel.add(textField_7);
		
		JButton btnNewButton_5_1 = new JButton("Volver");
		btnNewButton_5_1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				inicio(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		btnNewButton_5_1.setBounds(238, 447, 100, 23);
		panel.add(btnNewButton_5_1);
		
		JLabel lblNewLabel_15_1_3_4_1 = new JLabel("Status:");
		lblNewLabel_15_1_3_4_1.setBounds(290, 360, 160, 14);
		panel.add(lblNewLabel_15_1_3_4_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(435, 355, 230, 20);
		panel.add(textField_8);
		
		JLabel lblNewLabel_15_1_3_4_1_1 = new JLabel("Estado civil:");
		lblNewLabel_15_1_3_4_1_1.setBounds(290, 398, 160, 14);
		panel.add(lblNewLabel_15_1_3_4_1_1);
		
		String opciones[] = {"Soltero", "Casado", "Divorciado"};
		JComboBox estadoCivil = new JComboBox(opciones);
		estadoCivil.setFont(new Font("Consolas", Font.BOLD, 12));
		estadoCivil.setBounds(435, 394, 100, 20);
		panel.add(estadoCivil);
		
	}

	public void consultarDocente(JFrame frame)
	{
		this.setTitle("School Smart Zone");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("General");
		btnNewButton_1.setBounds(20, 140, 150, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Formación académica");
		btnNewButton_3.setBounds(20, 420, 150, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Otros...");
		btnNewButton_4.setBounds(20, 560, 150, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_14 = new JLabel("Control escolar");
		lblNewLabel_14.setBounds(50, 34, 80, 14);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_14_1 = new JLabel("Consulta de docente");
		lblNewLabel_14_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14_1.setBounds(450, 34, 200, 14);
		contentPane.add(lblNewLabel_14_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 255));
		panel.setBounds(220, 100, 720, 500);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_15 = new JLabel("Información general del docente");
		lblNewLabel_15.setBounds(37, 38, 160, 14);
		panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_15_1 = new JLabel("Apellido paterno:");
		lblNewLabel_15_1.setBounds(290, 85, 160, 14);
		panel.add(lblNewLabel_15_1);
		
		JLabel lblNewLabel_15_1_1 = new JLabel("Apellido materno:");
		lblNewLabel_15_1_1.setBounds(290, 135, 160, 14);
		panel.add(lblNewLabel_15_1_1);
		
		JLabel lblNewLabel_15_1_2 = new JLabel("Nombre(s):");
		lblNewLabel_15_1_2.setBounds(290, 180, 160, 14);
		panel.add(lblNewLabel_15_1_2);
		
		JLabel lblNewLabel_15_1_3 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_15_1_3.setBounds(50, 310, 160, 14);
		panel.add(lblNewLabel_15_1_3);
		
		JLabel lblNewLabel_15_1_3_1 = new JLabel("Género:");
		lblNewLabel_15_1_3_1.setBounds(50, 350, 160, 14);
		panel.add(lblNewLabel_15_1_3_1);
		
		JLabel lblNewLabel_15_1_3_2 = new JLabel("Dirección de residencia:");
		lblNewLabel_15_1_3_2.setBounds(290, 225, 160, 14);
		panel.add(lblNewLabel_15_1_3_2);
		
		JLabel lblNewLabel_15_1_3_3 = new JLabel("Número de teléfono:");
		lblNewLabel_15_1_3_3.setBounds(290, 270, 160, 14);
		panel.add(lblNewLabel_15_1_3_3);
		
		JLabel lblNewLabel_15_1_3_4 = new JLabel("Correo electrónico:");
		lblNewLabel_15_1_3_4.setBounds(290, 315, 160, 14);
		panel.add(lblNewLabel_15_1_3_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(60, 80, 170, 200);
		panel.add(panel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(435, 80, 230, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(435, 130, 230, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(435, 175, 230, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(435, 220, 230, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(435, 265, 230, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(435, 310, 230, 20);
		panel.add(textField_6);
		
		String colonias[] = {"Hombre", "Mujer", "No específicado"};
		JComboBox locations = new JComboBox(colonias);
		locations.setBounds(130, 350, 100, 20);
		locations.setFont(new Font("Consolas", Font.BOLD, 12));
		panel.add(locations);	
		
		JButton btnNewButton_5 = new JButton("Descargar información");
		btnNewButton_5.setBounds(37, 447, 180, 23);
		panel.add(btnNewButton_5);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(164, 307, 100, 20);
		panel.add(textField_7);
		
		JButton btnNewButton_5_1 = new JButton("Volver");
		btnNewButton_5_1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				inicio(frame);
				frame.repaint();
				frame.revalidate();	
			}		
		});
		btnNewButton_5_1.setBounds(238, 447, 100, 23);
		panel.add(btnNewButton_5_1);
		
		JLabel lblNewLabel_15_1_3_4_1_1 = new JLabel("Estado civil:");
		lblNewLabel_15_1_3_4_1_1.setBounds(290, 360, 160, 14);
		panel.add(lblNewLabel_15_1_3_4_1_1);
		
		String opciones[] = {"Soltero", "Casado", "Divorciado"};
		JComboBox estadoCivil = new JComboBox(opciones);
		estadoCivil.setFont(new Font("Consolas", Font.BOLD, 12));
		estadoCivil.setBounds(435, 355, 100, 20);
		panel.add(estadoCivil);
	}

	public void editarAlumno(JFrame frame)
	{
		this.setTitle("School Smart Zone - Editar alumno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_23 = new JLabel("Control escolar");
		lblNewLabel_23.setBounds(22, 11, 46, 14);
		contentPane.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("Editar información del alumno");
		lblNewLabel_24.setBounds(499, 23, 46, 14);
		contentPane.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("Algunos de los datos guardados no pueden cambiarse desde aquí, para poder hacerlo acuda de manera presencial a la escuela.");
		lblNewLabel_25.setBounds(45, 74, 700, 14);
		contentPane.add(lblNewLabel_25);
		
		JPanel panel = new JPanel();
		panel.setBounds(30, 104, 910, 40);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_26 = new JLabel("Nombre alumno");
		panel.add(lblNewLabel_26, BorderLayout.CENTER);
		
		JLabel lblNewLabel_27 = new JLabel("Identidad de género");
		lblNewLabel_27.setBounds(100, 162, 150, 14);
		contentPane.add(lblNewLabel_27);
		
		String genero[] = {"Hombre", "Mujer", "No binarie", "No deseo contestar"};
		JComboBox locations = new JComboBox(genero);
		locations.setBounds(380, 160, 250, 20);
		locations.setFont(new Font("Consolas", Font.BOLD, 12));
		contentPane.add(locations);	
		
		JLabel lblNewLabel_27_1 = new JLabel("Orientación sexual");
		lblNewLabel_27_1.setBounds(100, 217, 150, 14);
		contentPane.add(lblNewLabel_27_1);
		
		String orientacion[] = {"Heterosexual", "Homosexual", "Bisexual", "Pansexual", "Asexual"};
		JComboBox orientacionBox = new JComboBox(orientacion);
		orientacionBox.setBounds(380, 215, 250, 20);
		orientacionBox.setFont(new Font("Consolas", Font.BOLD, 12));
		contentPane.add(orientacionBox);	
		
		JLabel lblNewLabel_27_1_1 = new JLabel("Domicilio:");
		lblNewLabel_27_1_1.setBounds(100, 273, 150, 14);
		contentPane.add(lblNewLabel_27_1_1);
		
		textField_20 = new JTextField();
		textField_20.setBounds(380, 270, 250, 20);
		contentPane.add(textField_20);
		textField_20.setColumns(10);
		
		JLabel lblNewLabel_27_1_1_1 = new JLabel("Teléfono celular");
		lblNewLabel_27_1_1_1.setBounds(100, 324, 150, 14);
		contentPane.add(lblNewLabel_27_1_1_1);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(380, 321, 250, 20);
		contentPane.add(textField_21);
		
		JLabel lblNewLabel_27_1_1_1_1 = new JLabel("Estado civil");
		lblNewLabel_27_1_1_1_1.setBounds(100, 379, 100, 14);
		contentPane.add(lblNewLabel_27_1_1_1_1);
		
		String opciones[] = {"Soltero", "Casado", "Divorciado"};
		JComboBox estadoCivil = new JComboBox(opciones);
		estadoCivil.setFont(new Font("Consolas", Font.BOLD, 12));
		estadoCivil.setBounds(380, 375, 250, 20);
		contentPane.add(estadoCivil);
		
		JLabel lblNewLabel_27_1_1_1_1_1 = new JLabel("Información adicional");
		lblNewLabel_27_1_1_1_1_1.setBounds(100, 434, 150, 14);
		contentPane.add(lblNewLabel_27_1_1_1_1_1);
		
		JLabel lblNewLabel_28 = new JLabel("Contacto en caso de emergencia");
		lblNewLabel_28.setBounds(100, 459, 200, 14);
		contentPane.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("Nombre completo de la persona responsable:");
		lblNewLabel_29.setBounds(130, 499, 300, 14);
		contentPane.add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("Relación");
		lblNewLabel_30.setBounds(130, 547, 100, 14);
		contentPane.add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel("Dirección");
		lblNewLabel_31.setBounds(130, 592, 100, 14);
		contentPane.add(lblNewLabel_31);
		
		JLabel lblNewLabel_32 = new JLabel("Número de teléfono");
		lblNewLabel_32.setBounds(130, 636, 150, 14);
		contentPane.add(lblNewLabel_32);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(400, 496, 250, 20);
		contentPane.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(400, 590, 250, 20);
		contentPane.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(400, 633, 250, 20);
		contentPane.add(textField_24);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(720, 197, 200, 250);
		contentPane.add(panel_1);
		
		JButton btnNewButton_9 = new JButton("Guardar cambios");
		btnNewButton_9.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "Cambios guardados con éxito");
			}
		});
		btnNewButton_9.setBounds(735, 474, 170, 23);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_9_1 = new JButton("Volver");
		btnNewButton_9_1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				frame.getContentPane().removeAll();
				inicio(frame);
				frame.repaint();
				frame.revalidate();	
			}
		});
		btnNewButton_9_1.setBounds(770, 508, 100, 23);
		contentPane.add(btnNewButton_9_1);
	}
	
	public void editarDocente(JFrame frame)
	{
		this.setTitle("School Smart Zone - Editar docente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
contentPane.setLayout(null);
		
		JLabel lblNewLabel_23 = new JLabel("Control escolar");
		lblNewLabel_23.setBounds(22, 11, 46, 14);
		contentPane.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("Editar información del docente");
		lblNewLabel_24.setBounds(499, 23, 46, 14);
		contentPane.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("Algunos de los datos guardados no pueden cambiarse desde aquí, para poder hacerlo acuda de manera presencial a la escuela.");
		lblNewLabel_25.setBounds(45, 74, 700, 14);
		contentPane.add(lblNewLabel_25);
		
		JPanel panel = new JPanel();
		panel.setBounds(30, 104, 910, 40);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_26 = new JLabel("Nombre docente");
		panel.add(lblNewLabel_26, BorderLayout.CENTER);
		
		JLabel lblNewLabel_27 = new JLabel("Identidad de género");
		lblNewLabel_27.setBounds(100, 162, 150, 14);
		contentPane.add(lblNewLabel_27);
		
		String genero[] = {"Hombre", "Mujer", "No binarie", "No deseo contestar"};
		JComboBox locations = new JComboBox(genero);
		locations.setBounds(380, 160, 250, 20);
		locations.setFont(new Font("Consolas", Font.BOLD, 12));
		contentPane.add(locations);	
		
		JLabel lblNewLabel_27_1_1 = new JLabel("Domicilio:");
		lblNewLabel_27_1_1.setBounds(100, 217, 150, 14);
		contentPane.add(lblNewLabel_27_1_1);
		
		textField_20 = new JTextField();
		textField_20.setBounds(380, 215, 250, 20);
		contentPane.add(textField_20);
		textField_20.setColumns(10);
		
		JLabel lblNewLabel_27_1_1_1 = new JLabel("Teléfono celular");
		lblNewLabel_27_1_1_1.setBounds(100, 275, 150, 14);
		contentPane.add(lblNewLabel_27_1_1_1);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(380, 270, 250, 20);
		contentPane.add(textField_21);
		
		JLabel lblNewLabel_27_1_1_1_1 = new JLabel("Estado civil");
		lblNewLabel_27_1_1_1_1.setBounds(100, 379, 100, 14);
		contentPane.add(lblNewLabel_27_1_1_1_1);
		
		String opciones[] = {"Soltero", "Casado", "Divorciado"};
		JComboBox estadoCivil = new JComboBox(opciones);
		estadoCivil.setFont(new Font("Consolas", Font.BOLD, 12));
		estadoCivil.setBounds(380, 375, 250, 20);
		contentPane.add(estadoCivil);
		
		JLabel lblNewLabel_27_1_1_1_1_1 = new JLabel("Información adicional");
		lblNewLabel_27_1_1_1_1_1.setBounds(100, 434, 150, 14);
		contentPane.add(lblNewLabel_27_1_1_1_1_1);
		
		JLabel lblNewLabel_29 = new JLabel("Materias que enseña");
		lblNewLabel_29.setBounds(130, 470, 300, 14);
		contentPane.add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("Nivel educativo");
		lblNewLabel_30.setBounds(130, 515, 100, 14);
		contentPane.add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel("Notas o comentarios");
		lblNewLabel_31.setBounds(130, 592, 100, 14);
		contentPane.add(lblNewLabel_31);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(400, 465, 250, 20);
		contentPane.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(400, 510, 250, 20);
		contentPane.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(400, 590, 250, 20);
		contentPane.add(textField_24);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(720, 197, 200, 250);
		contentPane.add(panel_1);
		
		JButton btnNewButton_9 = new JButton("Guardar cambios");
		btnNewButton_9.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "Cambios guardados con éxito");
			}
		});
		btnNewButton_9.setBounds(735, 474, 170, 23);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_9_1 = new JButton("Volver");
		btnNewButton_9_1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				frame.getContentPane().removeAll();
				inicio(frame);
				frame.repaint();
				frame.revalidate();	
			}
		});
		btnNewButton_9_1.setBounds(770, 508, 100, 23);
		contentPane.add(btnNewButton_9_1);
		
		JLabel lblNewLabel_27_1_1_1_2 = new JLabel("Correo electrónico");
		lblNewLabel_27_1_1_1_2.setBounds(100, 325, 150, 14);
		contentPane.add(lblNewLabel_27_1_1_1_2);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(380, 322, 250, 20);
		contentPane.add(textField_25);
		
		JLabel lblNewLabel_30_1 = new JLabel("Estado laboral");
		lblNewLabel_30_1.setBounds(130, 554, 100, 14);
		contentPane.add(lblNewLabel_30_1);
		
		String estado[] = {"Activo", "En licencia", "Jubilado"};
		JComboBox estadoBox = new JComboBox(estado);
		estadoBox.setBounds(400, 550, 250, 20);
		estadoBox.setFont(new Font("Consolas", Font.BOLD, 12));
		contentPane.add(estadoBox);	
	}
	
	public void eliminarDocente(JFrame frame)
	{
		this.setTitle("School Smart Zone - Editar docente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_33 = new JLabel("Control escolar");
		lblNewLabel_33.setBounds(26, 28, 100, 14);
		contentPane.add(lblNewLabel_33);
		
		JLabel lblNewLabel_34 = new JLabel("Eliminar docente");
		lblNewLabel_34.setBounds(515, 28, 46, 14);
		contentPane.add(lblNewLabel_34);
		
		JPanel panel = new JPanel();
		panel.setBounds(50, 90, 880, 40);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_36 = new JLabel("Esta acción es permanente y el docente será eliminado de la base de datos.");
		panel.add(lblNewLabel_36, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(180, 189, 600, 30);
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_37 = new JLabel("Confirmación la información");
		panel_1.add(lblNewLabel_37, BorderLayout.CENTER);
		JLabel lblNewLabel_38 = new JLabel("Nombre completo:");
		lblNewLabel_38.setBounds(300, 250, 100, 14);
		contentPane.add(lblNewLabel_38);
		
		JLabel lblNewLabel_38_1 = new JLabel("ID:");
		lblNewLabel_38_1.setBounds(310, 294, 100, 14);
		contentPane.add(lblNewLabel_38_1);
		
		textField_26 = new JTextField();
		textField_26.setBounds(441, 247, 250, 20);
		contentPane.add(textField_26);
		textField_26.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(441, 291, 250, 20);
		contentPane.add(textField_27);
		
		JButton btnNewButton_10 = new JButton("Volver");
		btnNewButton_10.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				frame.getContentPane().removeAll();
				inicio(frame);
				frame.repaint();
				frame.revalidate();	
			}
		});
		btnNewButton_10.setBounds(372, 357, 89, 23);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_10_1 = new JButton("Elminar");
		btnNewButton_10_1.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showConfirmDialog(null, "¿Está seguro de querer realizar esta acción?");
			}
		});
		btnNewButton_10_1.setBounds(540, 357, 89, 23);
		contentPane.add(btnNewButton_10_1);
	}
	
	public void eliminarAlumno(JFrame frame)
	{
		this.setTitle("School Smart Zone - Eliminar alumno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 20, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
contentPane.setLayout(null);
		
		JLabel lblNewLabel_33 = new JLabel("Control escolar");
		lblNewLabel_33.setBounds(26, 28, 100, 14);
		contentPane.add(lblNewLabel_33);
		
		JLabel lblNewLabel_34 = new JLabel("Eliminar alumno");
		lblNewLabel_34.setBounds(515, 28, 46, 14);
		contentPane.add(lblNewLabel_34);
		
		JPanel panel = new JPanel();
		panel.setBounds(50, 90, 880, 40);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_36 = new JLabel("Esta acción es permanente y el alumno será eliminado de la base de datos.");
		panel.add(lblNewLabel_36, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(180, 189, 600, 30);
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_37 = new JLabel("Confirmación la información");
		panel_1.add(lblNewLabel_37, BorderLayout.CENTER);
		
		JLabel lblNewLabel_38 = new JLabel("Nombre completo:");
		lblNewLabel_38.setBounds(300, 250, 100, 14);
		contentPane.add(lblNewLabel_38);
		
		JLabel lblNewLabel_38_1 = new JLabel("ID:");
		lblNewLabel_38_1.setBounds(310, 294, 100, 14);
		contentPane.add(lblNewLabel_38_1);
		
		textField_26 = new JTextField();
		textField_26.setBounds(441, 247, 250, 20);
		contentPane.add(textField_26);
		textField_26.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(441, 291, 250, 20);
		contentPane.add(textField_27);
		
		JButton btnNewButton_10 = new JButton("Volver");
		btnNewButton_10.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				frame.getContentPane().removeAll();
				inicio(frame);
				frame.repaint();
				frame.revalidate();	
			}
		});
		btnNewButton_10.setBounds(372, 357, 89, 23);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_10_1 = new JButton("Elminar");
		btnNewButton_10_1.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showConfirmDialog(null, "¿Está seguro de querer realizar esta acción?");
			}
		});
		btnNewButton_10_1.setBounds(540, 357, 89, 23);
		contentPane.add(btnNewButton_10_1);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		System.out.println("Coordenada X: " + x + " Coordenada Y: " + y);
		
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
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
