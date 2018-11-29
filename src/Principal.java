import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.setDataDeEntrada("10/12/2000");
		f1.setDepartamento("Vendas");
		f1.setEstaNaEmpresa(true);
		f1.setNome("Wesley");
		f1.setRg("35624");
		f1.setSalario(2365.00);
		f1.calcularSalario();
		
		Gerente gerente = new Gerente();
		gerente.setDepartamento("Vendas");
		gerente.setDataDeEntrada("12/10/2000");
		gerente.setEstaNaEmpresa(true);
		gerente.setNome("Maria");
		gerente.setRg("512212");
		gerente.setSalario(12.654);
		gerente.setLogin("wesley");
		gerente.setSenha("houwr8ayou");
		
		System.out.println(f1.getDataDeEntrada());
		System.out.println(f1.getDepartamento());
		System.out.println(f1.getNome());
		System.out.println(f1.getRg());
		System.out.println(f1.getSalario());
		System.out.println(f1.isEstaNaEmpresa());
		
		System.out.println("///////////////////////////////////");
		
		gerente.autentica(JOptionPane.showInputDialog("Digite o login: "), JOptionPane.showInputDialog("Digite a senha: "));
		System.out.println(gerente.getDataDeEntrada());
		System.out.println(gerente.getDepartamento());
		System.out.println(gerente.getNome());
		System.out.println(gerente.getRg());
		System.out.println(gerente.getSalario());
		System.out.println(gerente.isEstaNaEmpresa());
		
	}

}
