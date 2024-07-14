package br.com.cfarias.toggle_server_cfarias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ToggleServerCfariasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToggleServerCfariasApplication.class, args);
	}

}
