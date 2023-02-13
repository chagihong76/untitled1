package untitled.common;


import untitled.BoundedContext233Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext233Application.class })
public class CucumberSpingConfiguration {
    
}
