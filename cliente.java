package generation;

public class cliente {
	
	private String cpf;
	private String nome;
	private String email;
	private String endereco;
	
	public cliente(String cpf, String nome, String email, String endereco) {
		// TODO Auto-generated constructor stub
	}

	public void Cliente(String cpf, String nome, String email, String endereco) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
		
		@Override
		public String toString() {
			String s = "\nNome: " + nome;
			s += "\nEmail: " + email;
			s += "\nCPF: " + cpf;
			s += "\nENDERECO\n";
			s += endereco;
			
			return s;
	}

		public char[] getDadosCompletos() {
			// TODO Auto-generated method stub
			return null;
		}
}
