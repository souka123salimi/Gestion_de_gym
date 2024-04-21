package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;

import Controller.ClientController;
import Controller.EquipementController;
import Controller.PaiementController;
import Controller.SeanceController;
import Controller.StatistiquesController;
import Model.ClientModel;
import Model.EquipementModel;
import Model.PaiementModel;
import Model.SeanceModel;
import Model.StatistiquesModel;

public class seanceView extends JFrame implements ActionListener, KeyListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField Id_tf;
	public JTextField Label_tf;
	public JTextField Horaire_tf;
	public JTextField search_tf;
	public static JTable table;
	public JButton btnAdd;
	public JButton btnUpdate;
	public JButton btnExit;
	public JButton btnDelete;
	public static JComboBox coachs;
	public static JList list_equipements;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					SeanceModel model = new SeanceModel();
					seanceView view = new seanceView();
					SeanceController controller = new SeanceController(model, view);

					view.setVisible(true);
					controller.table_load();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public seanceView() {
		setResizable(false);
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

		btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Californian FB", Font.PLAIN, 19));
		btnAdd.setBackground(new Color(87, 205, 230));
		btnAdd.setSelectedIcon(new ImageIcon(seanceView.class.getResource("/img/img2.png")));
		btnAdd.setBounds(175, 380, 103, 45);
		panel_1.add(btnAdd);

		search_tf = new JTextField();
		search_tf.setFont(new Font("Californian FB", Font.PLAIN, 21));
		search_tf.setBounds(10, 11, 317, 43);
		panel_1.add(search_tf);
		search_tf.setColumns(10);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBorder(new MatteBorder(2, 2, 2, 2, new Color(128, 216, 238)));
		panel_3.setBounds(10, 69, 425, 300);
		panel_1.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel_2_1 = new JLabel("Label");
		lblNewLabel_2_1.setBounds(20, 101, 74, 24);
		panel_3.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setFont(new Font("Californian FB", Font.PLAIN, 20));

		JLabel lblNewLabel_2 = new JLabel("Id");
		lblNewLabel_2.setBounds(20, 51, 17, 24);
		panel_3.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Californian FB", Font.PLAIN, 20));

		JLabel lblNewLabel_2_2 = new JLabel("Instructeur");
		lblNewLabel_2_2.setBounds(20, 156, 111, 31);
		panel_3.add(lblNewLabel_2_2);
		lblNewLabel_2_2.setFont(new Font("Californian FB", Font.PLAIN, 20));

		JLabel lblNewLabel_2_4 = new JLabel("Horaire");
		lblNewLabel_2_4.setBounds(20, 213, 138, 31);
		panel_3.add(lblNewLabel_2_4);
		lblNewLabel_2_4.setFont(new Font("Californian FB", Font.PLAIN, 20));

		Id_tf = new JTextField();
		Id_tf.setFont(new Font("Californian FB", Font.PLAIN, 17));
		Id_tf.setBounds(188, 52, 138, 24);
		panel_3.add(Id_tf);
		Id_tf.setColumns(10);
		Id_tf.setEditable(false);

		Label_tf = new JTextField();
		Label_tf.setFont(new Font("Californian FB", Font.PLAIN, 17));
		Label_tf.setBounds(188, 102, 138, 24);
		panel_3.add(Label_tf);
		Label_tf.setColumns(10);

		Horaire_tf = new JTextField();
		Horaire_tf.setFont(new Font("Californian FB", Font.PLAIN, 17));
		Horaire_tf.setBounds(188, 216, 138, 27);
		panel_3.add(Horaire_tf);
		Horaire_tf.setColumns(10);

		coachs = new JComboBox();
		coachs.setBounds(188, 161, 138, 24);
		panel_3.add(coachs);

		JLabel lblNewLabel_2_4_1 = new JLabel("Equipements");
		lblNewLabel_2_4_1.setFont(new Font("Californian FB", Font.PLAIN, 20));
		lblNewLabel_2_4_1.setBounds(20, 259, 138, 31);
		panel_3.add(lblNewLabel_2_4_1);

		list_equipements = new JList();
		list_equipements.setBorder(new LineBorder(new Color(0, 0, 0)));
		list_equipements.setBounds(188, 269, 138, 21);
		panel_3.add(list_equipements);

		btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Californian FB", Font.PLAIN, 19));
		btnDelete.setBackground(new Color(58, 204, 211));
		btnDelete.setBounds(310, 380, 103, 45);
		panel_1.add(btnDelete);

		btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Californian FB", Font.PLAIN, 19));
		btnUpdate.setBackground(new Color(87, 205, 230));
		btnUpdate.setBounds(445, 380, 103, 45);
		panel_1.add(btnUpdate);

		btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Californian FB", Font.PLAIN, 19));
		btnExit.setBackground(new Color(58, 204, 211));
		btnExit.setBounds(583, 380, 103, 45);
		panel_1.add(btnExit);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(seanceView.class.getResource("/img/search-16.gif")));
		lblNewLabel_4.setBounds(228, 11, 30, 43);
		panel_1.add(lblNewLabel_4);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(seanceView.class.getResource("/img/search-16.gif")));
		lblNewLabel_3.setBounds(252, 11, 49, 43);
		panel_1.add(lblNewLabel_3);

		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(252, 28, 49, 14);
		panel_1.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(seanceView.class.getResource("/img/search-24.png")));
		lblNewLabel_6.setBounds(330, 11, 30, 43);
		panel_1.add(lblNewLabel_6);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(445, 69, 492, 300);
		panel_1.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Id", "Label", "Instructeur", "Horaire", "Equipements" }));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(205, 0, 947, 47);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(seanceView.class.getResource("/img/icons8-gym-64.png")));
		lblNewLabel_1_1.setBounds(10, 0, 64, 42);
		panel_2.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1 = new JLabel("Gym managment system");
		lblNewLabel_1.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_1.setForeground(new Color(99, 207, 235));
		lblNewLabel_1.setBounds(84, 11, 275, 25);
		panel_2.add(lblNewLabel_1);
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 201, 500);
		contentPane.add(layeredPane);

		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					dispose();

					EquipementModel model = new EquipementModel();
					equipementView view = new equipementView();
					EquipementController controller = new EquipementController(model, view);
					view.setVisible(true);
					controller.table_load();
					new equipementView().setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
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
				dispose();

				SeanceModel model = new SeanceModel();
				seanceView view = new seanceView();
				SeanceController controller = new SeanceController(model, view);
				view.setVisible(true);
				try {
					controller.table_load();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
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
				dispose();

				PaiementModel model = new PaiementModel();
				paimentView view = new paimentView();
				PaiementController controller = new PaiementController(model, view);
				view.setVisible(true);
				try {
					controller.table_load();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
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
				dispose();

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
					dispose();

					ClientModel model = new ClientModel();
					clientView view = new clientView();
					ClientController controller = new ClientController(model, view);
					view.setVisible(true);
					controller.table_load();

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
				dispose();

				StatistiquesModel model = new StatistiquesModel();
				home view = new home();
				StatistiquesController controller = new StatistiquesController(model, view);
				try {
					controller.updateStatistics();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				view.setVisible(true);
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

	public int getSearchId() {
		String idText = search_tf.getText();
		if (idText.isEmpty()) {
			// Handle the case where the text field is empty
			return -1; // Or any other appropriate default value
		}

		try {
			int id = Integer.parseInt(idText);
			return id;
		} catch (NumberFormatException e) {
			// Handle the case where the text field contains non-numeric characters
			e.printStackTrace(); // Or log the error
			return -1; // Or any other appropriate default value
		}
	}

	public void clearInputs() {
		Id_tf.setText("");
		Horaire_tf.setText("");
		Label_tf.setText("");
	}

	public void addAddButtonListener(ActionListener listener) {
		btnAdd.addActionListener(listener);
	}

	public void addUpdateButtonListener(ActionListener listener) {
		btnUpdate.addActionListener(listener);
	}

	public void addDeleteButtonListener(ActionListener listener) {
		btnDelete.addActionListener(listener);
	}

	public void addExitButtonListener(ActionListener listener) {
		btnExit.addActionListener(listener);
	}

	public void addSearcheButtonListener(KeyAdapter kA) {
		btnDelete.addKeyListener(kA);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
}