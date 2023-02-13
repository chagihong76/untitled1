package untitled.common;


import untitled.BoundedContext602Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext602Application.class })
public class CucumberSpingConfiguration {
    
}
