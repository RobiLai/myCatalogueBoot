package it.catalogue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prodotto")
public class ProdottoController {

	@Autowired
	private ProdottoRepository repo;
	
	@GetMapping("/lista")
	public String list() {
		
		Iterable<Prodotto> prodotti = repo.finAll();
		
		prodotti.forEach((Prodotto p) -> {
			System.out.println(p.getNome());
		});
		
		return "prodotti";
		
	}
	
}
