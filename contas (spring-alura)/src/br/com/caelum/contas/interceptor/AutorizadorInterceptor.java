package br.com.caelum.contas.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AutorizadorInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object controller) throws Exception {
		String uri = request.getRequestURI();
		if (uri.endsWith("efetuaLogin") || uri.endsWith("login") || uri.contains("resources")) {
			return true;
		}
		
		if (request.getSession().getAttribute("usuarioLogado")!=null) {
			return true;
		} else {
			System.out.println("usuario nao logado");
			response.sendRedirect("login");
			return false;
		}
	}
}

// public class AutorizadorInterceptor extends HandlerInterceptorAdapter {
//
// public boolean preHandle(HttpServletRequest request, HttpServletResponse
// response, Object controller)
// throws Exception {
//
// String uri = request.getRequestURI();
// if(uri.endsWith("loginForm") || uri.endsWith("efetuaLogin") ||
// uri.contains("resources")) {
// return true;
// }
//
// if(request.getSession().getAttribute("usuarioLogado")!=null) {
// return true;
// } else {
// response.sendRedirect("loginForm");
// return false;
// }
//
// }
// }
