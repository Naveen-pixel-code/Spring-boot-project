package com.naveen.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.naveen.springboot.model.User;
import com.naveen.springboot.userrepository.UserRepository;

@SpringBootApplication
public class SpringBootProjectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
	}
	
	 @Autowired
	    private UserRepository userRepository;

	    @Override
	    public void run(String...args) throws Exception {
	        this.userRepository.save(new User("Ramesh", "Fadatare", "ramesh@gmail.com"));
	        this.userRepository.save(new User("Tom", "Cruise", "tom@gmail.com"));
	        this.userRepository.save(new User("Tony", "Stark", "tony@gmail.com"));
	    }

}
