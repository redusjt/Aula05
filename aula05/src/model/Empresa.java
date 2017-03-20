package model;

public class Empresa {
	private String cnpj;
	private String razaoSocial;
	private String horario;
	private String horarioAr;
	private int conjuntos;
	private double tempMax;
	
	public Empresa(String cnpj, String razaoSocial, String horario, String horarioAr, int conjuntos, double tempMax) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.horario = horario;
		this.horarioAr = horarioAr;
		this.conjuntos = conjuntos;
		this.tempMax = tempMax;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getHorarioAr() {
		return horarioAr;
	}

	public void setHorarioAr(String horarioAr) {
		this.horarioAr = horarioAr;
	}

	public int getConjuntos() {
		return conjuntos;
	}

	public void setConjuntos(int conjuntos) {
		this.conjuntos = conjuntos;
	}

	public double getTempMax() {
		return tempMax;
	}

	public void setTempMax(double tempMax) {
		this.tempMax = tempMax;
	}
	
	
}
