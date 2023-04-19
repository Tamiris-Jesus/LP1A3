import java.util.List;


public class Main {

	public static void main(String[] args) {

		Gerente g1 = new Gerente("Pedro de Souza", 1, 9000.00);
		Analista a1 = new Analista("Ana Vieira", 2, 4000.00);
		Programador p1 = new Programador("Maria Alexandra", 3, 5000.00);
		Programador p2 = new Programador("Joao Augusto dos Anjos", 4, 4500.00);
		Programador p3 = new Programador("Vanessa Lopes de Almeida", 5, 5500.00);
		Analista a2 = new Analista("Victória Jesus", 6, 6000.00);
		
		
		a2.horaEntrada(7);
		a1.horaEntrada(8);
		p1.horaEntrada(10);
		p2.horaEntrada(11);
		p2.horaSaida(21);
		p3.horaEntrada(9);
		p3.horaSaida(19);
		a1.horaSaida(18);
		p1.horaSaida(20);
		
	//Criando departamento e adicionando funcionarios 
	Departamento dptoTI = new Departamento<>();
	dptoTI.adicionarGerente(g1);
	dptoTI.adicionarFuncionario(g1);
	dptoTI.adicionarFuncionario(a1);
	dptoTI.adicionarFuncionario(a2);
	dptoTI.adicionarFuncionario(p1);
	dptoTI.adicionarFuncionario(p2);
	dptoTI.adicionarFuncionario(p3);

	String formato = "%1$-5s %2$-40s %3$-21s %4$-15s";

	
    // listando as informações sobre os funcionarios
	System.out.println("Funcionarios do departamento:");
	System.out.printf(formato, "ID", " | NOME" , " | HORA DE ENTRADA", " | SAL�RIO (R$)");
    List<Funcionario> funcionarios = dptoTI.listarFuncionarios();
    System.out.println("Funcionários:");
 
    for (Funcionario funcionario : funcionarios) {
        System.out.printf(formato, funcionario.getId(),
        		" | " + funcionario.getNome(),
        		" | " + funcionario.getHoraEntrada() + "h",
        	    " | " + funcionario.getSalario());
        
		System.out.println();
    }
    
	
 // lista os funcionarios atrasados, considerando o horario de entrada sendo 7h
    List<Funcionario> atrasados = dptoTI.listarAtrasados(7);
    System.out.println("\nFuncionarios que chegaram atrasados:");
    for (Funcionario atrasado : atrasados) {
        System.out.println(atrasado.getNome());
    }
    
    
	}

}
