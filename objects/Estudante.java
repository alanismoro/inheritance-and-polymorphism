package objects;

public class Estudante {
	//Atributos
	private String nome;
	private String CPF;
	private String curso;
	private int idade;
	private int matricula;
	private double mensalidade;
	private boolean estadoMatricula;
	
	//Métodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	public boolean isEstadoMatricula() {
		return estadoMatricula;
	}
	public void setEstadoMatricula(boolean estadoMatricula) {
		this.estadoMatricula = estadoMatricula;
	}
	
	public void imprimeDados() {
		System.out.println("-------------------------");
		System.out.println("Nome:" +this.nome);
		System.out.println("CPF:" +this.CPF);
		System.out.println("Curso:" +this.curso);
		System.out.println("Idade: " +this.idade);
		System.out.println("Matricula: " +this.matricula);
		System.out.println("Mensalidade: " +this.mensalidade);
		//System.out.println("Aluno ativo: " +this.estadoMatricula);
		if(estadoMatricula)
			System.out.println("Aluno Ativo");
		else
			System.out.println("Aluno inativo");
		System.out.println("-------------------------");
	}
}
