package some.mstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "some")
public class MsTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsTestApplication.class, args);
	}

}
