package br.com.fafic.estudos.classes;

public class Correspondencia {
	private String data;
	private String remetente;
	private String destinatario;
	
	public Correspondencia() {
	}

	public Correspondencia(String data, String remetente, String destinatario) {
		this.data = data;
		this.remetente = remetente;
		this.destinatario = destinatario;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	@Override
	public String toString() {
		return "Data = " + data + ", Remetente = " + remetente + ", Destinatário = " + destinatario;
	}
}	
	