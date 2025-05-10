package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.lang.DisplayMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);


		DisplayMessage displayMessage = new DisplayMessage();

		Thread threadFrench = new Thread(() -> {
			Locale locale = Locale.CANADA_FRENCH;
			String Frwelcome = displayMessage.getMessage(locale);
			System.out.println("French: " + Frwelcome);
			});



		Thread threadEnglish  = new Thread(() -> {
			Locale locale = Locale.US;
			String Enwelcome = displayMessage.getMessage(locale);
			System.out.println("English: " + Enwelcome);
		});
		threadEnglish.start();
		threadFrench.start();



	}
}