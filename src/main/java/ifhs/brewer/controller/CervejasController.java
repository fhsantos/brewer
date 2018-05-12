package ifhs.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ifhs.brewer.model.Cerveja;

@Controller
public class CervejasController {

	@RequestMapping("/cervejas/novo")
	public String novo() {
		return "cerveja/cadastroCerveja";
	}
	
	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Cerveja cerveja, BindingResult result){
		if(result.hasErrors()) {
			System.out.println(">>>>>>> tem erros");
		}
		System.out.println(">>>>>>> SKU: "+cerveja.getSku());
		System.out.println(">>>>>>> NOME: "+cerveja.getNome());
		return "cerveja/cadastroCerveja";
	}
}