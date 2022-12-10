package ec.edu.itsqmet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ec.edu.itsqmet.services.IBirdCategoryServices;

@SpringBootTest
class EvaluaciodfApplicationTests {
	
	@Autowired
	private IBirdCategoryServices categoryServices;

	@Test
	void contextLoads() {
	
		System.out.println(categoryServices.getAll());
	}

}
