package models;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Init {
	public static void main(String[] args) {
		
		PessoaDAO pessoaDB = new PessoaDAO();
		List<Pessoa> listaDePessoas = new ArrayList<Pessoa>();
		
		
		
		
		String nome = JOptionPane.showInputDialog(null, "Digite seu nome:");
		String telefone = JOptionPane.showInputDialog(null, "Digite seu telefone:");	
		String eMail = JOptionPane.showInputDialog(null, "Digite seu email:");
		Pessoa pessoa = pessoaDB.salvar(new Pessoa(nome, telefone, eMail));
		
		JOptionPane.showMessageDialog(null, pessoa.toString());
		
		listaDePessoas = pessoaDB.listarPessoas();
		
		JOptionPane.showMessageDialog(null, listaDePessoas);
		
		
		
	}
}
