package cl.aiep.java.prueba1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cl.aiep.java.prueba1.modelo.Usuario;

@Controller
public class usuarioController {
	
	
	@GetMapping("/")
	public String index(Model modelo) {
		Usuario miUsuario = Usuario.builder()
			.username("administrador@123.cl")
			.password("1234")
			.rol("ADMIN")
			.build()
		;
		modelo.addAttribute("usuario", miUsuario);
		
		//new Usuario(null, "administrador@123.cl", "1234", "ADMIN"); //Es lo mismo
		
		return "index";
	}

}
