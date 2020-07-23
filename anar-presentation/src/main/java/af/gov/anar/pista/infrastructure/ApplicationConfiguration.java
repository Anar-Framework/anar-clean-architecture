package af.gov.anar.pista.infrastructure;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.TimeZone;

@Component
@Primary
public class ApplicationConfiguration {

    @PostConstruct
    public void init(){
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));   // It will set UTC timezone
        System.out.println("Spring boot application running in UTC timezone :" + new Date());   // It will print UTC timezone
    }
//
//    @Bean
//    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//    public KeycloakRestTemplate keycloakRestTemplate() {
//        return new KeycloakRestTemplate(keycloakClientRequestFactory());
//    }
//
//    @Bean
//    public KeycloakClientRequestFactory keycloakClientRequestFactory()
//    {
//     return new KeycloakClientRequestFactory();
//    }
}
