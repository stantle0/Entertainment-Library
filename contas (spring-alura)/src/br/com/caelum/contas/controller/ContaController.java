package br.com.caelum.contas.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.caelum.contas.dao.ContaDAO;
import br.com.caelum.contas.modelo.Conta;

@Controller
public class ContaController {
	
	ContaDAO dao;
	
	@Autowired
	public ContaController(ContaDAO dao) {
		this.dao = dao;
	}
	
	@RequestMapping("/form")
	public String formulario() {
		return "conta/formulario";
	}

//	@RequestMapping("/adicionaConta")
//	public String adicionaConta(Conta conta) {
//		System.out.println("Conta adicionada é:" + conta.getDescricao());
//		new ContaDAO().adiciona(conta);
//		return "conta-adicionada";
//	}
	
	@RequestMapping("/adicionaConta")
	public String adiciona(@Valid Conta conta, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println(result.toString());
			return "conta/formulario";
		}
		System.out.println("tipo da conta:" + conta.getTipo());
	    dao.adiciona(conta);
	    return "redirect:/lista";
	}
	
//	@RequestMapping("lista")
//	public String lista(Model modelAndView) {
//		List<Conta> contas = new ContaDAO().lista();
//		System.out.println(contas);
//		modelAndView.addAttribute("todasContas", contas);
//		
//		return "conta/lista";
//	}
	
	@RequestMapping("/lista")
	public ModelAndView lista() {
	  List<Conta> contas = dao.lista();
	  System.out.println(contas);
	  ModelAndView mv = new ModelAndView("conta/lista");
	  mv.addObject("todasContas", contas);
	  return mv;
	}
	
	@RequestMapping("/removeConta")
	public String removeConta(Conta conta) {
		dao.remove(conta);
		return "redirect:/lista";
	}
	
	@RequestMapping("/mostraConta")
	public ModelAndView mostra(Long id) {
		ModelAndView mv = new ModelAndView("conta/mostra");
		mv.addObject("conta", dao.buscaPorId(id));
		return mv;
	}
	
	@RequestMapping("/alteraConta")
	public String altera(Conta conta) {
		dao.altera(conta);
		return "redirect:lista";
	}
	
	@RequestMapping("pagaConta")
	public void pagaConta(Long id, HttpServletResponse response) {
		System.out.println("pagamento da conta");
		dao.paga(id);
		response.setStatus(200);
	}
}
