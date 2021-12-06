public class For {
	public void percorreColecao(Itereavel colecao) {
		Iterador sequencia = colecao.percorrerColecao();
		Object primeiro = sequencia.proximo();
		Object segundo = sequencia.proximo();
	}
}