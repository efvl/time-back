package by.evv.timeapp;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class TimeApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplicationBuilder(TimeApplication.class)
													.bannerMode(Banner.Mode.OFF)
													.build();
		springApplication.run(args);
	}

}
