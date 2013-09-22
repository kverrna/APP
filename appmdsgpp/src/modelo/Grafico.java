package modelo;

public class Grafico {
	
	private int idGrafico;
	private int eixoOrdenadas;
	private int eixoAbcissas;
	private String legenda;
	
	public Grafico(){}
	
	//M�todos recuperadores e modificadores
	public int getIdGrafico() {
		return idGrafico;
	}
	public void setIdGrafico(int idGrafico) {
		this.idGrafico = idGrafico;
	}
	public int getEixoOrdenadas() {
		return eixoOrdenadas;
	}
	public void setEixoOrdenadas(int eixoOrdenadas) {
		this.eixoOrdenadas = eixoOrdenadas;
	}
	public int getEixoAbcissas() {
		return eixoAbcissas;
	}
	public void setEixoAbcissas(int eixoAbcissas) {
		this.eixoAbcissas = eixoAbcissas;
	}
	public String getLegenda() {
		return legenda;
	}
	public void setLegenda(String legenda) {
		this.legenda = legenda;
	}

}
