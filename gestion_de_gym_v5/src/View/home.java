package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;

public class home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					home frame = new home();
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
	public home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1166, 537);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(185, 230, 242));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(205, 50, 947, 450);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(null);
		panel_3.setBounds(64, 53, 212, 121);
		panel_1.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("Membres inscrits");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Californian FB", Font.BOLD, 20));
		lblNewLabel_3.setBounds(30, 79, 143, 31);
		panel_3.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(home.class.getResource("/img/conference-48.png")));
		lblNewLabel_4.setBounds(20, 11, 73, 47);
		panel_3.add(lblNewLabel_4);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 0, 212, 121);
		lblNewLabel_2.setIcon(new ImageIcon(home.class.getResource("/img/img5 (1).png")));
		panel_3.add(lblNewLabel_2);

		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(671, 53, 212, 121);
		panel_1.add(panel_3_1);
		panel_3_1.setLayout(null);

		JLabel lblNewLabel_3_2_2 = new JLabel("Equipement disponible");
		lblNewLabel_3_2_2.setForeground(Color.WHITE);
		lblNewLabel_3_2_2.setFont(new Font("Californian FB", Font.BOLD, 20));
		lblNewLabel_3_2_2.setBounds(10, 79, 201, 31);
		panel_3_1.add(lblNewLabel_3_2_2);

		JLabel lblNewLabel_5 = new JLabel("\r\n");
		lblNewLabel_5.setIcon(new ImageIcon(home.class.getResource("/img/icons8-gym-48.png")));
		lblNewLabel_5.setBounds(23, 11, 64, 41);
		panel_3_1.add(lblNewLabel_5);

		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon(home.class.getResource("/img/img6.png")));
		lblNewLabel_2_1_1.setBounds(-182, 0, 463, 121);
		panel_3_1.add(lblNewLabel_2_1_1);

		JPanel panel_3_4 = new JPanel();
		panel_3_4.setBounds(360, 53, 212, 121);
		panel_1.add(panel_3_4);
		panel_3_4.setLayout(null);

		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setBounds(21, 11, 73, 47);
		panel_3_4.add(lblNewLabel_4_1);
		lblNewLabel_4_1.setIcon(new ImageIcon(home.class.getResource("/img/icons8-gym-49.png")));

		JLabel lblNewLabel_3_2 = new JLabel("Seances disponible");
		lblNewLabel_3_2.setBounds(31, 79, 158, 31);
		panel_3_4.add(lblNewLabel_3_2);
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Californian FB", Font.BOLD, 20));

		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon(home.class.getResource("/img/img7.png")));
		lblNewLabel_2_2.setBounds(-196, 0, 408, 121);
		panel_3_4.add(lblNewLabel_2_2);

		JPanel panel_3_4_1 = new JPanel();
		panel_3_4_1.setLayout(null);
		panel_3_4_1.setBounds(64, 267, 212, 121);
		panel_1.add(panel_3_4_1);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(home.class.getResource("/img/money-bag-48.png")));
		lblNewLabel_6.setBounds(20, 11, 49, 43);
		panel_3_4_1.add(lblNewLabel_6);

		JLabel lblNewLabel_3_1_1 = new JLabel("Total des gains");
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("Californian FB", Font.BOLD, 20));
		lblNewLabel_3_1_1.setBounds(41, 79, 137, 31);
		panel_3_4_1.add(lblNewLabel_3_1_1);

		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(home.class.getResource("/img/img6.png")));
		lblNewLabel_2_1.setBounds(-129, 0, 341, 121);
		panel_3_4_1.add(lblNewLabel_2_1);

		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBorder(null);
		panel_3_2.setBounds(360, 267, 212, 121);
		panel_1.add(panel_3_2);

		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(22, 0, 49, 68);
		panel_3_2.add(lblNewLabel_7);
		lblNewLabel_7.setIcon(new ImageIcon(home.class.getResource("/img/icons8-gym-51.png")));

		JLabel lblNewLabel_3_1_1_2 = new JLabel("Coach disponible");
		lblNewLabel_3_1_1_2.setBounds(30, 79, 156, 31);
		panel_3_2.add(lblNewLabel_3_1_1_2);
		lblNewLabel_3_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_2.setFont(new Font("Californian FB", Font.BOLD, 20));

		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setIcon(new ImageIcon(home.class.getResource("/img/img5 (1).png")));
		lblNewLabel_2_3.setBounds(0, 0, 212, 121);
		panel_3_2.add(lblNewLabel_2_3);

		JPanel panel_3_4_2 = new JPanel();
		panel_3_4_2.setLayout(null);
		panel_3_4_2.setBounds(671, 267, 212, 121);
		panel_1.add(panel_3_4_2);

		JLabel lblNewLabel_4_1_1 = new JLabel("");
		lblNewLabel_4_1_1.setIcon(new ImageIcon(home.class.getResource("/img/k.png")));
		lblNewLabel_4_1_1.setBounds(21, 11, 73, 57);
		panel_3_4_2.add(lblNewLabel_4_1_1);

		JLabel lblNewLabel_3_2_1 = new JLabel("Total seances ");
		lblNewLabel_3_2_1.setForeground(Color.WHITE);
		lblNewLabel_3_2_1.setFont(new Font("Californian FB", Font.BOLD, 20));
		lblNewLabel_3_2_1.setBounds(56, 79, 126, 31);
		panel_3_4_2.add(lblNewLabel_3_2_1);

		JLabel lblNewLabel_2_2_1 = new JLabel("");
		lblNewLabel_2_2_1.setIcon(new ImageIcon(home.class.getResource("/img/img7.png")));
		lblNewLabel_2_2_1.setBounds(-196, 0, 408, 121);
		panel_3_4_2.add(lblNewLabel_2_2_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(205, 0, 947, 47);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(home.class.getResource("/img/icons8-gym-64.png")));
		lblNewLabel_1_1.setBounds(10, 0, 64, 42);
		panel_2.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1 = new JLabel("Gym managment system");
		lblNewLabel_1.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_1.setForeground(new Color(64, 186, 221));
		lblNewLabel_1.setBounds(84, 11, 275, 25);
		panel_2.add(lblNewLabel_1);
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 201, 500);
		contentPane.add(layeredPane);

		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new equipementView().setVisible(true);
			}
		});
		panel_4_1_1.setLayout(null);
		panel_4_1_1.setForeground(Color.WHITE);
		panel_4_1_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255),
				new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		panel_4_1_1.setBackground(new Color(58, 204, 211));
		panel_4_1_1.setBounds(10, 444, 181, 42);
		layeredPane.add(panel_4_1_1);

		JLabel Statistiques_1_1_1 = new JLabel("Gestion Equipement");
		Statistiques_1_1_1.setForeground(Color.WHITE);
		Statistiques_1_1_1.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 20));
		Statistiques_1_1_1.setBounds(0, 11, 171, 26);
		panel_4_1_1.add(Statistiques_1_1_1);

		JPanel panel_4_1 = new JPanel();
		panel_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new seanceView().setVisible(true);
			}
		});
		panel_4_1.setLayout(null);
		panel_4_1.setForeground(Color.WHITE);
		panel_4_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255),
				new Color(255, 255, 255), new Color(255, 255, 255)));
		panel_4_1.setBackground(new Color(58, 204, 211));
		panel_4_1.setBounds(10, 338, 181, 42);
		layeredPane.add(panel_4_1);

		JLabel Statistiques_1_1 = new JLabel("Gestion Seances");
		Statistiques_1_1.setForeground(Color.WHITE);
		Statistiques_1_1.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 21));
		Statistiques_1_1.setBounds(20, 11, 161, 26);
		panel_4_1.add(Statistiques_1_1);

		JPanel panel_6 = new JPanel();
		panel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new paimentView().setVisible(true);
			}

		});
		panel_6.setLayout(null);
		panel_6.setForeground(Color.WHITE);
		panel_6.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255),
				new Color(255, 255, 255), new Color(255, 255, 255)));
		panel_6.setBackground(new Color(87, 205, 230));
		panel_6.setBounds(10, 391, 181, 42);
		layeredPane.add(panel_6);

		JLabel lblGestionPaiement = new JLabel("Gestion Paiement");
		lblGestionPaiement.setForeground(Color.WHITE);
		lblGestionPaiement.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 21));
		lblGestionPaiement.setBounds(10, 11, 171, 26);
		panel_6.add(lblGestionPaiement);

		JPanel panel_5 = new JPanel();
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new coachView().setVisible(true);
			}
		});
		panel_5.setLayout(null);
		panel_5.setForeground(Color.WHITE);
		panel_5.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255),
				new Color(255, 255, 255), new Color(255, 255, 255)));
		panel_5.setBackground(new Color(87, 205, 230));
		panel_5.setBounds(10, 285, 181, 42);
		layeredPane.add(panel_5);

		JLabel lblGestionCoach = new JLabel("Gestion Coach\r\n");
		lblGestionCoach.setForeground(Color.WHITE);
		lblGestionCoach.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 21));
		lblGestionCoach.setBounds(21, 11, 139, 26);
		panel_5.add(lblGestionCoach);

		JPanel panel_4 = new JPanel();
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					new clientView().setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel_4.setLayout(null);
		panel_4.setForeground(Color.WHITE);
		panel_4.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255),
				new Color(255, 255, 255), new Color(255, 255, 255)));
		panel_4.setBackground(new Color(58, 204, 211));
		panel_4.setBounds(10, 232, 181, 42);
		layeredPane.add(panel_4);

		JLabel Statistiques_1 = new JLabel("Gestion Clients");
		Statistiques_1.setForeground(Color.WHITE);
		Statistiques_1.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 21));
		Statistiques_1.setBounds(20, 11, 151, 26);
		panel_4.add(Statistiques_1);

		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new home().setVisible(true);
			}
		});
		panel.setBackground(new Color(87, 205, 230));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255),
				new Color(255, 255, 255), new Color(255, 255, 255)));
		panel.setBounds(10, 179, 181, 42);
		layeredPane.add(panel);
		panel.setLayout(null);

		JLabel Statistiques = new JLabel("Statistiques");
		Statistiques.setBounds(34, 11, 107, 26);
		panel.add(Statistiques);

		Statistiques.setForeground(new Color(255, 255, 255));
		Statistiques.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 21));

		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(coachView.class.getResource("/img/imageedit_1_8651314769 (1).png")));
		lblNewLabel_8.setBounds(0, 24, 178, 144);
		layeredPane.add(lblNewLabel_8);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(coachView.class.getResource("/img/img2.png")));
		lblNewLabel.setBounds(-50, 0, 251, 500);
		layeredPane.add(lblNewLabel);
	}

}