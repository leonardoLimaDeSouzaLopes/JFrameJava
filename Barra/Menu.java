import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Menu extends JFrame{
 
    public Menu(){   // Criando o menu
        
    	// Cria as coisas basicas da Aplicacao
    	this.setTitle("Aplicacao");
    	this.setSize(960, 540);
    	this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    	this.setLocationRelativeTo(null);
    	this.setExtendedState(MAXIMIZED_BOTH); // Maxima a janela

    	// Cria a Barra de Menu
    	JMenuBar barra = new JMenuBar();
    	setJMenuBar(barra); 
    	
    	// Cria o menu Arquivo
    	JMenu arquivo = new JMenu("Arquivo");
    	barra.add(arquivo);
    	
    	// Cria o item Sair
    	JMenuItem sair = new JMenuItem("Sair");
    	sair.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent evento) {
    			System.exit(0);
    		}
    	});
    	arquivo.add(sair);
    	
       
    	this.setVisible(true);
    } 
}