package br.com.caio.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/index")
	public String ok(){
		return "view/login.jsp";
	}
	
	@RequestMapping("/validaLogin")
	public String validaLogin(Usuario usuario,HttpServletRequest req){
		if ("adm".equals(usuario.getUsuario()) && "123".equals(usuario.getSenha())){
			req.setAttribute("usuario", usuario);
			return "view/ok.jsp";
		}else{
			return "view/login.jsp";
		}
		
	}
	
}
