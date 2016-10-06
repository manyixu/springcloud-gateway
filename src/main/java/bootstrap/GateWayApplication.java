package bootstrap;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import auth.AccessFilter;

@EnableZuulProxy
@SpringBootApplication
public class GateWayApplication {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(GateWayApplication.class).web(
				true).run(args);
	}
	
	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}
}
