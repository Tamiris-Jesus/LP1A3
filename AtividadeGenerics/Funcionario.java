
public class Funcionario {
	
	 	private String nome;
	    private int id;
	    private double salario;
	    private int horaEntrada;
	    private int horaSaida;

	    public Funcionario(String nome, int id, double salario) {
	        this.nome = nome;
	        this.id = id;
	        this.salario = salario;
	    }

	    public void setNome(String nome) {
	    	this.nome= nome;
	    }
	    
	    public String getNome() {
	    	return nome;
	    }
	    
	    public void setId(int id) {
	    	this.id = id;
	    }
	    
	    
	    public int getId() {
	        return this.id;
	    }

	    public double getSalario() {
	    	return this.salario;
	    }
	    public void setHoraEntrada(int horaEntrada) {
	        this.horaEntrada = horaEntrada;
	    }

	    public void setHoraSaida(int horaSaida) {
	        this.horaSaida = horaSaida;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;
	        }
	        Funcionario outro = (Funcionario) obj;
	        return this.id == outro.id;
	    }

		public int getHoraEntrada() {
			return horaEntrada;
		}

}
