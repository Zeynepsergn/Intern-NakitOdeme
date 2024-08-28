package tr.gov.gib.nakitodeme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "tr.gov.gib")
public class NakitOdemeApplication {

	public static void main(String[] args) {
		SpringApplication.run(NakitOdemeApplication.class, args);
	}

}
