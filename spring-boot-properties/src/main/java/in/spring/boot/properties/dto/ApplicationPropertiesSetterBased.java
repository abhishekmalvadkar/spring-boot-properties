package in.spring.boot.properties.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *  @ConfigurationProperties(prefix = "app") is to tell spring boot that map properties by using "app" as
 *  root property node
 */
@ConfigurationProperties(prefix = "app")
@Getter
/**
 * Providing @Setter because in case of @ConfigurationProperties, spring boot uses setter based injection by default
 * to inject property values
 */
@Setter
/**
 * Using @Component to put this into spring context
 */
@Component
public class ApplicationPropertiesSetterBased {

    private String customerSaveMessage;

    private Character customerDefaultGender;

    private Integer code;

    private Boolean cacheEnable;

    private Double productDefaultDiscount;

    private List<String> notificationEmails;

}
