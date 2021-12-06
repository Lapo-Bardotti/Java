
public class Cnpj implements Documento {
	private String valor;

	public Cnpj(String string) {
		// TODO Auto-generated constructor stub
	}

	public boolean ehValido() {
		return primeiroDigitoVerificador() == primeiroDigitoCorreto()
				&& segundoDigitoVerificador() == segundoDigitoCorreto();
	}

	private int primeiroDigitoCorreto() {
		return 1;
		// Extrai o primeiro dígito verificador do CNPJ armazenado
		// no atributo cnpj
	}

	private int primeiroDigitoVerificador() {
		return 1;
		// Extrai o segundo dígito verificador do CNPJ armazenado
		// no atributo cnpj
	}

	private int segundoDigitoCorreto() {
		return 2;
		// Calcula o primeiro dígito verificador correto para
		// o CNPJ armazenado no atributo cnpj
	}

	private int segundoDigitoVerificador() {
		return 2;
		// Calcula o primeiro dígito verificador correto para
		// o CNPJ armazenado no atributo cnpj
	}

	public void setValor(String cnpjCredor) {
		this.valor = cnpjCredor;
	}

	public String getValor() {
		return this.valor;
	}
	
	@Override
	public String toString() {
		return this.valor;
	}
}
