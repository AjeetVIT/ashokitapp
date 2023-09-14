package in.nareshit.raghu.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public CommandLineRunner clra() {
		CommandLineRunner cob=(args)->{System.out.println("FROM LAMBDA EXP !");
	};
		return  cob;
	}

}
