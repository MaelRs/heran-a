package pooheranca.pessoa;

public class CodExecucao {

	public static void main(String[] args) {
		Pessoa p=new Pessoa();
		Aluno a = new Aluno();
		Professor prof=new Professor();
		Funcionario f= new Funcionario();
		
		a.setNome("Paula");
		a.setMatricula(212121);
		a.setIdade(26);
		a.setSexo("f");
		a.setCurso("Marcenaria");
		
		prof.setNome("Saulo");
		prof.setIdade(45);
		prof.setSexo("M");
		prof.setEspecialidade("Biologia");
		prof.setSalario(6300.86f);
		
		f.setNome("Ana");
		f.setIdade(28);
		f.setSexo("F");
		f.setSetor("Producao");
		f.setTrabalhando(true);
		
		p.setNome("Paulo");
		p.setIdade(35);
		p.setSexo("M");
		
		System.out.println(p.toString());
		System.out.println(a.toString());
		System.out.println(prof.toString());
		System.out.println(f.toString());
		
		
	}

}
