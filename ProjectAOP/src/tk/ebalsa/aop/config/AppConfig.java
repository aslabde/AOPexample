package tk.ebalsa.aop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.context.annotation.ComponentScan;



@Configuration
@EnableTransactionManagement
@EnableAspectJAutoProxy
@ComponentScan("tk.ebalsa.aop")
public class AppConfig {
	

}
