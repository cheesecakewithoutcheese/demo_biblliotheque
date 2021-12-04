package pachetprincipal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pachetcarte.LibraryRepository;

@Configuration 
@ComponentScan(basePackageClasses = LibraryRepository.class)
public class BeanConfiguration {
	@Bean
	public LibraryRepository getLibraryRepo() {
		return LibraryRepository();
	}


}
