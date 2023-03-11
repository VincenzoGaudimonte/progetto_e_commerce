package model;

public class OrdineModel {
	private int numOrdine;
	private String clienteId;
	private String prodottoId;
	private Stato stato;
	private int quantita;
	public OrdineModel(String clienteId, String prodottoId, int quantita) {
		super();
		this.clienteId = clienteId;
		this.prodottoId = prodottoId;
		this.stato = Stato.REGISTRATO;
		this.quantita = quantita;
	}
	public int getNumOrdine() {
		return numOrdine;
	}
	public void setNumOrdine(int numOrdine) {
		this.numOrdine = numOrdine;
	}
	public String getClienteId() {
		return clienteId;
	}
	public void setClienteId(String clienteId) {
		this.clienteId = clienteId;
	}
	public String getProdottoId() {
		return prodottoId;
	}
	public void setProdottoId(String prodottoId) {
		this.prodottoId = prodottoId;
	}
	public Stato getStato() {
		return stato;
	}
	public void setStato(Stato stato) {
		this.stato = stato;
	}
	public int getQuantita() {
		return quantita;
	}
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	
	
	
}
