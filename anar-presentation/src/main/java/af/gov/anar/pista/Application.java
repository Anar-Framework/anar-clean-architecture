package af.gov.anar.pista;

import af.gov.anar.core.applicationname.EnableApplicationName;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.envers.repository.support.EnversRevisionRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableAsync;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableApplicationName
@ComponentScan(basePackages = {"af.*"})
@EnableJpaRepositories(basePackages = {"af.*"}, repositoryFactoryBeanClass = EnversRevisionRepositoryFactoryBean.class)
@EntityScan(basePackages = {"af.*"})
@EnableSwagger2
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableAsync
@EnableRetry
// @Slf4j
public class Application{
        public static void main(String[] args) {
                SpringApplication.run(Application.class, args);
        }
}
