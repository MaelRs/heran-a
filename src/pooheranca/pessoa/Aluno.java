package pooheranca.pessoa;

public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	
	public void cancelarMatricula() {
		System.out.println("Cancelando Matricula");
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Aluno [matricula=" + matricula + ", curso=" + curso +  "]";
	}
}
