package com.Musibase.Musibase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.codec.CodecCustomizer;

@SpringBootApplication
public class MusibaseApplication implements CommandLineRunner {

//teste

	public static void main(String[] args) {
		SpringApplication.run(MusibaseApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception{
		System.out.println("teste");
	}
}
