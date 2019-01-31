package ru.vbdsme.vbdsmelogic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.vbdsme.vbdsmelogic.repository.CategoryRepository;

@SpringBootApplication
public class VbdsmeLogicApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(VbdsmeLogicApplication.class, args);

		CategoryRepository repository = context.getBean(CategoryRepository.class);

		repository.findAll();
		System.out.println(repository);
	}

}

