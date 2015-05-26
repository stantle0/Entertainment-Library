package br.com.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.helloworld.dao.DAO;
import br.com.helloworld.model.User;

@Controller
@RequestMapping("index")
public class IndexController {
	
	@Autowired
	private DAO<User> userDAO;
	
	@RequestMapping("/add-client")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/add-client/profession")
	public ModelAndView indexProfession() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("profession", true);
		return mv;
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public String saveClient(@RequestParam("name") String name, @RequestParam("age") int age, @RequestParam("profession") String profession) {
		User user = new User(name, age, profession);
		userDAO.save(user);
		return "Cliente cadastrado com sucesso!";
	}

}