package in.spring.boot.properties;

import in.spring.boot.properties.dto.ApplicationPropertiesConstructorBased;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
/**
 * You can use constructor injection for @ConfigurationProperties class by using any one approach of below
 *
 * 1) @ConfigurationPropertiesScan
 * 2) @EnableConfigurationProperties(value = {ApplicationPropertiesConstructorBased.class})
 *
 * Recommended approach in (2) because here spring boot no need to scan whole packages for @ConfigurationProperties classes
 * It will just look your mentioned classes so application startup time will reduce
 *
 * NOTE : If you are using setter based injection which is by default injection strategy is using for @ConfigurationProperties
 *        classes then you don't need to do all these things , you have to do all these things if and only if you are using
 *        constructor based injection for your @ConfigurationProperties classes to make them immutable
 */
//@ConfigurationPropertiesScan OR
@EnableConfigurationProperties(value = {ApplicationPropertiesConstructorBased.class})
public class SpringBootPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPropertiesApplication.class, args);
	}

}
