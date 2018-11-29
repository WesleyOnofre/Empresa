
public class Funcionario {
	
	private String nome;
	private String departamento;
	private double salario;
	private String dataDeEntrada;
	private String rg;
	private boolean estaNaEmpresa;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDataDeEntrada() {
		return dataDeEntrada;
	}
	public void setDataDeEntrada(String dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public boolean isEstaNaEmpresa() {
		return estaNaEmpresa;
	}
	public void setEstaNaEmpresa(boolean estaNaEmpresa) {
		this.estaNaEmpresa = estaNaEmpresa;
	}
	
	public void calcularSalario(double valor) {
		this.salario = valor - (valor * 0.06);
	}
	
	public void calcularSalario(double valor, double horasExtras) {
		double valorHorasExtras = (valor/30) / 8 * horasExtras;
		this.salario = valor - (valor*0.06) + valorHorasExtras;
	}
	
	public double calcularSalario() {
		return this.salario = 1000 - (1000 * 0.06);
	}
	
	public void bonifica(double valor) {
		salario += valor;
	}
		
	public void demite() {
		estaNaEmpresa = false;
	}
	
	public double calcularGanhoAnual() {
		return salario * 12;
	}
	
}
