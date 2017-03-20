package model;

public class Usuario {
	private String nome;
	private long cpf;
	private String senha;
	private String tipoFuncionario;
	private String empresa;
	private String horario;
	private boolean autorizado;
	
	public Usuario(String nome, long cpf, String senha, String tipoFuncionario, String empresa, String horario,
			boolean autorizado) {
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.tipoFuncionario = tipoFuncionario;
		this.empresa = empresa;
		this.horario = horario;
		this.autorizado = autorizado;
	}
	
	public Usuario(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipoFuncionario() {
		return tipoFuncionario;
	}

	public void setTipoFuncionario(String tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public boolean isAutorizado() {
		return autorizado;
	}

	public void setAutorizado(boolean autorizado) {
		this.autorizado = autorizado;
	}
	
	
}
