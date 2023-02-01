package sa01jeduk;

import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
	  
	//estruturas de repetição
	  /*
	   * do while
	   * while
	   * for
	   * 
	   */
    String resp;
	do {
		String nome = JOptionPane.showInputDialog("Digite o nome:");
	    String saString = JOptionPane.showInputDialog("Digite o sa:");
	    int sa = Integer.parseInt(saString);
	    String status = JOptionPane.showInputDialog("Digite o status:");
	    
	    try (FileWriter writer = new FileWriter("fontededados.txt", true)) {
	      writer.write(nome + "," + sa + "," + status + "\n");
	      JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
	    } catch (IOException e) {
	      JOptionPane.showMessageDialog(null, "Erro ao salvar dados: " + e.getMessage());
	    }
	    
	    resp = JOptionPane.showInputDialog("exit (fechar) ou Qualquer tecla para continuar");
	    
		
	}while(!resp.equals("exit"));
    
  }
}
