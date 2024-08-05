package some.mstest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import some.lib.metadata.ListsToFil;

@SpringBootApplication(scanBasePackages = "some")
public class MsTestApplication implements CommandLineRunner {

	@Autowired
	private ListsToFil listsToFil;

	public static void main(String[] args) {
		SpringApplication.run(MsTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(listsToFil.getList1());

	}
}
