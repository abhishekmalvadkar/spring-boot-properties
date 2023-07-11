package in.spring.boot.properties.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *  @ConfigurationProperties(prefix = "app") is to tell spring boot that map properties by using "app" as
 *  root property node
 */
@ConfigurationProperties(prefix = "app")
@Getter
@RequiredArgsConstructor
/**
 * Using @Component to put this into spring context
 */
/**
 * @ConstructorBinding means telling to spring boot that use constructor to inject property values
 */
@ConstructorBinding
/**
 * In case of constructor
 * don't put @Component here
 * otherwise it will be created as regular bean,
 * in the case of constructor we have to tell spring
 * boot that use constructor, we can do this in
 * below steps
 *
 * STEP 1 : Use @ConstrcutorBinding here
 *
 * STEP 2 : Use
 * @EnableConfigurationProperties(
 * value =
 * {ApplicationPropertiesConstructorBased.class}) on main class
 *
 * OR
 *
 * STEP 2 : Use @ConfigurationPropertiesScan
 * on main class
 */
public class ApplicationPropertiesConstructorBased {

    private final String customerSaveMessage;

    private final Character customerDefaultGender;

    private final Integer code;

    private final Boolean cacheEnable;

    private final Double productDefaultDiscount;

    private final List<String> notificationEmails;

}
