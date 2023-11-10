package br.inatel.labs.padraosoa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public MyMessage processarGetHello() {
		
		/* Aqui se MyMessage fosse Class e nao record
		MyMessage msg = new MyMessage();
		msg.setInfo("Ola, padrão arquitetural SOA");
		return msg;
		*/
		
		MyMessage msg = new MyMessage("Ola, padrão arquitetural SOA");
		//msg.info(); Retorna a mensagem ('Get' do Record)
		
		return msg;
	}
	

}
