package generation;

public class endereco {

	private String rua;
	private int numero;
	private String cidade;
	private String estado;

	public void Endereco() {

	}

	public void Endereco(String rua, int numero, String cidade, String estado) {
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		String s = "Rua: " + rua + ", " + numero + ", " + cidade + " - " + estado;
		
		return s;
}
}