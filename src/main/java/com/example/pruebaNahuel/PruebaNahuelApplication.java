package com.example.pruebaNahuel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PruebaNahuelApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PruebaNahuelApplication.class, args);

		AutoRepository repository = context.getBean(AutoRepository.class);

		Auto autito= new Auto();
		System.out.println("find");
		System.out.println("num de computadoras: "+repository.findAll().size());
		System.out.println("todavia no guarde nada");

		repository.save(autito);

		System.out.println("num de computadoras: "+repository.findAll().size());


	}

}
