package in.spring.boot.properties.runner;

import in.spring.boot.properties.dto.ApplicationPropertiesSetterBased;
import in.spring.boot.properties.dto.ApplicationPropertiesConstructorBased;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class AppPropertiesConstructorBasedRunner implements CommandLineRunner {

    private final ApplicationPropertiesSetterBased appProps;

    @Override
    public void run(String... args) throws Exception {
        log.info("... AppPropertiesConstructorBasedRunner ...");

        log.info("CUSTOMER SAVED MESSAGE : {}", appProps.getCustomerSaveMessage());
        log.info("DEFAULT CUSTOMER GENDER : {}", appProps.getCustomerDefaultGender());
        log.info("APP CODE : {}", appProps.getCode());
        log.info("IS CACHE ENABLED : {}", appProps.getCacheEnable());
        log.info("PRODUCT DEFAULT DISCOUNT : {}", appProps.getProductDefaultDiscount());

        for (String notificationEmail : appProps.getNotificationEmails()) {
            log.info("NOTIFICATION EMAIL : {}", notificationEmail);
        }

        log.info("... AppPropertiesConstructorBasedRunner ...");
    }
}
