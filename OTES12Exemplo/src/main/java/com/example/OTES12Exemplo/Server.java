package com.example.OTES12Exemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Server {

    @GetMapping("/login/{usuario}/{senha}")
    public String login(@PathVariable(value = "usuario") String usuario,
    					   @PathVariable(value = "senha") String senha) {
    	
    	String usuarioBD = "Jose";
    	String senhaBD = "123456";
    	
    	Boolean usuarioValido;
    	Boolean senhaValida;
    	
    	if (usuario.equals(usuarioBD)) {
    		usuarioValido = true;
    	} else {
    		usuarioValido = false;
    	}
    	
    	if (senha.equals(senhaBD)) {
    		senhaValida = true;
    	} else {
    		senhaValida = false;
    	}
    	
    	String responseJson;
    	
    	if (usuarioValido == true && senhaValida == true) {
        	responseJson = "{\"usuario\" : \"" + usuario + "\", \"senha\": \"" + senha + "\", \"auth\": \"Acesso autorizado\", \"total_vendas_do_mes\":23000}";
    	} else {
        	responseJson = "{\"usuario\" : \"" + usuario + "\", \"senha\": \"" + senha + "\", \"auth\": \"Acesso nao autorizado\", \"total_vendas_do_mes\":23000}";
    	}
    	
    	return responseJson;
    }
    
    @GetMapping("/getVendas/{usuario}/{valor_ultima_venda}")
    public String getVendas(@PathVariable(value = "usuario") String usuario,
    						@PathVariable(value = "valor_ultima_venda") int valor_ultima_venda) {
    	
    	int total_vendas_do_mes = 23000 + valor_ultima_venda;
    	    	
    	String responseJson = "{\"usuario\" : \"" + usuario + "\", \"valor_ultima_venda\": " + valor_ultima_venda + ", \"total_vendas_do_mes\":" + total_vendas_do_mes + ", \"total_vendas_do_grupo\":357000}";
    	
    	return responseJson;
    }

    @GetMapping("/loginSeguro/{usuario}/{senha}")
    public String loginSeguro(@PathVariable(value = "usuario") String usuario,
    					   @PathVariable(value = "senha") String senha) {
    	
    	String usuarioBD = "Jose";
    	String senhaBD = "123456";
    	
    	Boolean usuarioValido;
    	Boolean senhaValida;
    	
    	if (usuario.equals(usuarioBD)) {
    		usuarioValido = true;
    	} else {
    		usuarioValido = false;
    	}
    	
    	if (senha.equals(senhaBD)) {
    		senhaValida = true;
    	} else {
    		senhaValida = false;
    	}
    	
    	String responseJson;
    	
    	if (usuarioValido == true && senhaValida == true) {
        	responseJson = "{\"usuario\" : \"" + usuario + "\", \"senha\": \"" + senha + "\", \"auth\": \"Acesso autorizado\"}";
    	} else {
        	responseJson = "{\"usuario\" : \"" + usuario + "\", \"senha\": \"" + senha + "\", \"auth\": \"Acesso nao autorizado\"}";
    	}
    	
    	return responseJson;
    }

    @GetMapping("/getVendasSeguro/{usuario}/{valor_ultima_venda}")
    public String getVendasSeguro(@PathVariable(value = "usuario") String usuario,
    						@PathVariable(value = "valor_ultima_venda") int valor_ultima_venda) {
    	
    	int total_vendas_do_mes = 23000 + valor_ultima_venda;
    	    	
    	String responseJson = "{\"usuario\" : \"" + usuario + "\", \"valor_ultima_venda\": " + valor_ultima_venda + ", \"total_vendas_do_mes\": "+ total_vendas_do_mes + "}";
    	
    	return responseJson;
    }
    
    @GetMapping("/getVendasDoGrupoSeguro/{usuario}/{valor_ultima_venda}")
    public String getVendasDoGrupoSeguro(@PathVariable(value = "usuario") String usuario,
    						@PathVariable(value = "valor_ultima_venda") int valor_ultima_venda) {
    	    	    	
    	String responseJson = "{\"usuario\" : \"" + usuario + "\", \"total_vendas_do_grupo\":357000}";
    	
    	return responseJson;
    }
}
