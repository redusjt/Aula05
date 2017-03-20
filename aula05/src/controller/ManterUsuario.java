package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuario;
import service.UsuarioService;

@WebServlet("/ManterUsuario.do")
public class ManterUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pNome = request.getParameter("nome");
		String pTipoFuncionario = request.getParameter("cargo");
		String pEmpresa = request.getParameter("empresa");
		String pHorario = request.getParameter("horario");
		String pCpf = request.getParameter("cpf");
		String pSenha = request.getParameter("senha");
		
		long cpf = Long.parseLong(pCpf);
		
		//instanciar o javabean
		Usuario usuario = new Usuario(pNome, cpf, pSenha, pTipoFuncionario, pEmpresa, pHorario, false);
		
		//instanciar o service
		UsuarioService us = new UsuarioService();
		us.criar(usuario);
		usuario = us.carregar(usuario.getCpf());
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Usuário Cadastrado</title></head><body>");
		out.println(	"CPF: "+usuario.getCpf()+"<br>");
		out.println(	"Nome: "+usuario.getNome()+"<br>");
		out.println(	"Cargo: "+usuario.getTipoFuncionario()+"<br>");
		out.println(	"Horário: "+usuario.getHorario()+"<br>");
		out.println(	"Empresa: "+usuario.getEmpresa()+"<br>");
		out.println(	"Senha: "+usuario.getSenha()+"<br>");
	    out.println("</body></html>");
		
	}
}
