package com.algaworks.algafood;

<<<<<<< HEAD
import java.util.TimeZone;

=======
>>>>>>> a1905c0c77da4ea241fee2cea01d0cab7cfadcc6
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

<<<<<<< HEAD
import com.algaworks.algafood.core.io.Base64ProtocolResolver;
=======
>>>>>>> a1905c0c77da4ea241fee2cea01d0cab7cfadcc6
import com.algaworks.algafood.infrastructure.repository.CustomJpaRepositoryImpl;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = CustomJpaRepositoryImpl.class)
public class AlgafoodApiApplication {

	public static void main(String[] args) {
<<<<<<< HEAD
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		
		var app = new SpringApplication(AlgafoodApiApplication.class);
		app.addListeners(new Base64ProtocolResolver());
		app.run(args);
=======
		SpringApplication.run(AlgafoodApiApplication.class, args);
>>>>>>> a1905c0c77da4ea241fee2cea01d0cab7cfadcc6
	}

}
