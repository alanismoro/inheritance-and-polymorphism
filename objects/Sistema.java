package objects;
public class Sistema {
	
	public static void main(String[] args) {
		System.out.println("Cadastros no sistema");
		
		Estudante aluno = new Estudante();
		
		aluno.setNome("Fernando Lucas");
		aluno.setCPF("999.999.999-99");
		aluno.setCurso("Sistemas");
		aluno.setEstadoMatricula(true);
		aluno.setIdade(20);
		aluno.setMatricula(123456);
		aluno.setMensalidade(500.0);
		
		aluno.imprimeDados();
		
		Professor prof1 = new Professor();
		prof1.setNome("Laura Silva");
		prof1.setCpf("111.111.111-11");
		prof1.setCurso("Sistemas");
		prof1.setIdade(34);
		prof1.setSalario(2000.0);
		
		prof1.imprimeDados();
	}
}