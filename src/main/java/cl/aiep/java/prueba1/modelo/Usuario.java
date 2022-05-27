package cl.aiep.java.prueba1.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario {
	
	private long id;
	private String username;
	private String password;
	private String rol;
	


}
