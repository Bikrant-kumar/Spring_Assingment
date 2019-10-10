package Spring.assignment.Assignment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public samsung getPhone() {
		return new samsung();
	}

	@Bean
	public MobileInterface getProcessor() {
		return new Snapdragon();
	}
}
