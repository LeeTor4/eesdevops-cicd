package br.com.cicd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuario;


@WebServlet(urlPatterns = "/projeto")
public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = 4237640443961022276L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
            System.out.println("Acessando o Servlet!!!");
            String login = req.getParameter("login");
            String senha = req.getParameter("senha");
            String msg = "";
           
    		Usuario usu = new Usuario(login,senha);
            usu.setNome("Lee");
            usu.setSenha("123");
    		if(usu.getNome().equals(login) && usu.getSenha().equals(senha)) {
    			msg = "Usuário " + usu.getNome() + " logado com Sucesso!!";
    		}else {
    			msg = "Login inválido!!";
    		}
           
            RequestDispatcher rd = req.getRequestDispatcher("/retornoLogin.jsp");
            req.setAttribute("msg", msg);
            rd.forward(req, resp);
	}
}
