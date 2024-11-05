import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ListModel;

public class PrimeiraJanela extends JFrame {
	JLabel lbNome;
	JTextField txNome;
	JButton btExibir;
	JComboBox cbCurso;
	JRadioButton rdTurma1;
	JRadioButton rdTurma2;
	JRadioButton rdTurma3;
	ButtonGroup bgTurma;
	JCheckBox ckCoresPreferida1;
	JCheckBox ckCoresPreferida2;
	JCheckBox ckCoresPreferida3;
	ButtonGroup bgCores;

public PrimeiraJanela() {
	this.setTitle("Minha primeira Janela!");
	this.setSize(800, 300); //this.setLocation(0,0);
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation (EXIT_ON_CLOSE); this.setLayout(null);
	
	lbNome = new JLabel();
	lbNome.setBounds (20, 20, 100, 20);
	lbNome.setText("Digite seu Nome: "); add(lbNome);
	txNome = new JTextField();
	
	txNome.setBounds (20, 40, 100, 20); add(txNome);
	btExibir = new JButton();
	btExibir.setBounds (20, 180, 100, 40);
	
	btExibir.setText("Exibir");
	btExibir.setBackground (Color.BLACK);
	btExibir.setForeground (Color.YELLOW); add(btExibir);
	
	btExibir.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		String nome, curso, turma="", cor=""; nome = txNome.getText();
		curso = cbCurso.getSelectedItem().toString();
		
		
		
	
}
}

