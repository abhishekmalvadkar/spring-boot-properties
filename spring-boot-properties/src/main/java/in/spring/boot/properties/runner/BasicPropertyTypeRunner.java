package in.spring.boot.properties.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class BasicPropertyTypeRunner implements CommandLineRunner {

    @Value(value = "${app.customer.save.message}")
    private String customerSavedMessage;

    @Value(value = "${app.customer.default.gender}")
    private Character defaultCustomerAge;
    @Value(value = "${app.code}")
    private Integer appCode;
    @Value(value = "${app.cache.enable}")
    private Boolean isCacheEnabled;

    @Value(value = "${app.product.default.discount}")
    private Double productDefaultDiscount;

    @Override
    public void run(String... args) throws Exception {
        log.info("... BasicPropertyTypeRunner ...");

        log.info("CUSTOMER SAVED MESSAGE : {}", customerSavedMessage);
        log.info("DEFAULT CUSTOMER AGE : {}", defaultCustomerAge);
        log.info("APP CODE : {}", appCode);
        log.info("IS CACHE ENABLED : {}", isCacheEnabled);
        log.info("PRODUCT DEFAULT DISCOUNT : {}", productDefaultDiscount);

        log.info("... BasicPropertyTypeRunner ...");
    }
}
