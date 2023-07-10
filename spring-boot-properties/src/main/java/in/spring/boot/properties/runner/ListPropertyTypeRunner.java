package in.spring.boot.properties.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class ListPropertyTypeRunner implements CommandLineRunner {

    @Value(value = "${app.notification-emails}")
    private List<String> notificationEmails;


    @Override
    public void run(String... args) throws Exception {
        log.info("... ListPropertyTypeRunner ...");

        for (String notificationEmail : notificationEmails) {
            log.info("NOTIFICATION EMAIL : {}", notificationEmail);
        }

        log.info("... ListPropertyTypeRunner ...");
    }
}
