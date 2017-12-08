package lv.javaguru.springboot.customermanager2;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerManager2Application {
    @Bean
    public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf) {
        return hemf.getSessionFactory();
    }

    public static void main(String[] args) {
        SpringApplication.run(CustomerManager2Application.class, args);
    }
}

//
//        22:18:38.777 [main] DEBUG org.springframework.boot.devtools.settings.DevToolsSettings - Included patterns for restart : []
//        22:18:38.791 [main] DEBUG org.springframework.boot.devtools.settings.DevToolsSettings - Excluded patterns for restart : [/spring-boot-starter/target/classes/, /spring-boot-autoconfigure/target/classes/, /spring-boot-starter-[\w-]+/, /spring-boot/target/classes/, /spring-boot-actuator/target/classes/, /spring-boot-devtools/target/classes/]
//        22:18:38.791 [main] DEBUG org.springframework.boot.devtools.restart.ChangeableUrls - Matching URLs for reloading : [file:/C:/Users/Oleg/IdeaProjects/CustomerManager2/target/classes/]
//
//        .   ____          _            __ _ _
//        /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
//        ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
//        \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
//        '  |____| .__|_| |_|_| |_\__, | / / / /
//        =========|_|==============|___/=/_/_/_/
//        :: Spring Boot ::        (v1.5.9.RELEASE)
//
//        2017-12-08 22:18:39.289  INFO 9612 --- [  restartedMain] l.j.s.c.CustomerManager2Application      : Starting CustomerManager2Application on LinuxSRV with PID 9612 (C:\Users\Oleg\IdeaProjects\CustomerManager2\target\classes started by Oleg in C:\Users\Oleg\IdeaProjects\CustomerManager2)
//        2017-12-08 22:18:39.290  INFO 9612 --- [  restartedMain] l.j.s.c.CustomerManager2Application      : No active profile set, falling back to default profiles: default
//2017-12-08 22:18:39.699  INFO 9612 --- [  restartedMain] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@338498a8: startup date [Fri Dec 08 22:18:39 EET 2017]; root of context hierarchy
//        2017-12-08 22:18:42.103  INFO 9612 --- [  restartedMain] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 8080 (http)
//        2017-12-08 22:18:42.116  INFO 9612 --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
//        2017-12-08 22:18:42.118  INFO 9612 --- [  restartedMain] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.23
//        2017-12-08 22:18:42.231  INFO 9612 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
//        2017-12-08 22:18:42.231  INFO 9612 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 2538 ms
//        2017-12-08 22:18:42.406  INFO 9612 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Mapping servlet: 'dispatcherServlet' to [/]
//        2017-12-08 22:18:42.411  INFO 9612 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
//2017-12-08 22:18:42.411  INFO 9612 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
//2017-12-08 22:18:42.411  INFO 9612 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
//2017-12-08 22:18:42.411  INFO 9612 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
//Fri Dec 08 22:18:42 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Fri Dec 08 22:18:42 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Fri Dec 08 22:18:42 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Fri Dec 08 22:18:42 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Fri Dec 08 22:18:42 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Fri Dec 08 22:18:42 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Fri Dec 08 22:18:42 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Fri Dec 08 22:18:42 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Fri Dec 08 22:18:42 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Fri Dec 08 22:18:42 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//2017-12-08 22:18:43.048  INFO 9612 --- [  restartedMain] j.LocalContainerEntityManagerFactoryBean : Building JPA container EntityManagerFactory for persistence unit 'default'
//2017-12-08 22:18:43.066  INFO 9612 --- [  restartedMain] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [
//	name: default
//	...]
//2017-12-08 22:18:43.146  INFO 9612 --- [  restartedMain] org.hibernate.Version                    : HHH000412: Hibernate Core {5.0.12.Final}
//2017-12-08 22:18:43.148  INFO 9612 --- [  restartedMain] org.hibernate.cfg.Environment            : HHH000206: hibernate.properties not found
//2017-12-08 22:18:43.149  INFO 9612 --- [  restartedMain] org.hibernate.cfg.Environment            : HHH000021: Bytecode provider name : javassist
//2017-12-08 22:18:43.201  INFO 9612 --- [  restartedMain] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.0.1.Final}
//2017-12-08 22:18:43.352  INFO 9612 --- [  restartedMain] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.MySQLDialect
//2017-12-08 22:18:43.933  INFO 9612 --- [  restartedMain] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
//2017-12-08 22:18:44.378  INFO 9612 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@338498a8: startup date [Fri Dec 08 22:18:39 EET 2017]; root of context hierarchy
//2017-12-08 22:18:44.463  INFO 9612 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/],methods=[GET]}" onto public java.lang.String lv.javaguru.springboot.customermanager2.controller.CustomerController.initializeCustomer(org.springframework.ui.Model)
//2017-12-08 22:18:44.464  INFO 9612 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/customer/add],methods=[POST]}" onto public java.lang.String lv.javaguru.springboot.customermanager2.controller.CustomerController.addCustomer(lv.javaguru.springboot.customermanager2.model.Customer)
//2017-12-08 22:18:44.465  INFO 9612 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/edit/{id}]}" onto public java.lang.String lv.javaguru.springboot.customermanager2.controller.CustomerController.editCustomer(int,org.springframework.ui.Model)
//2017-12-08 22:18:44.465  INFO 9612 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/customerdata/{id}]}" onto public java.lang.String lv.javaguru.springboot.customermanager2.controller.CustomerController.customerData(int,org.springframework.ui.Model)
//2017-12-08 22:18:44.465  INFO 9612 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/customers],methods=[GET]}" onto public java.lang.String lv.javaguru.springboot.customermanager2.controller.CustomerController.listCustomers(org.springframework.ui.Model)
//2017-12-08 22:18:44.465  INFO 9612 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/remove/{id}]}" onto public java.lang.String lv.javaguru.springboot.customermanager2.controller.CustomerController.removeCustomer(int)
//2017-12-08 22:18:44.470  INFO 9612 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
//2017-12-08 22:18:44.470  INFO 9612 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
//2017-12-08 22:18:44.519  INFO 9612 --- [  restartedMain] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
//2017-12-08 22:18:44.519  INFO 9612 --- [  restartedMain] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
//2017-12-08 22:18:44.568  INFO 9612 --- [  restartedMain] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
//        2017-12-08 22:18:45.276  INFO 9612 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
//        2017-12-08 22:18:45.353  INFO 9612 --- [  restartedMain] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
//        2017-12-08 22:18:45.427  INFO 9612 --- [  restartedMain] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8080 (http)
//        2017-12-08 22:18:45.434  INFO 9612 --- [  restartedMain] l.j.s.c.CustomerManager2Application      : Started CustomerManager2Application in 6.625 seconds (JVM running for 7.845)
//        2017-12-08 22:19:08.273  INFO 9612 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring FrameworkServlet 'dispatcherServlet'
//        2017-12-08 22:19:08.273  INFO 9612 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization started
//        2017-12-08 22:19:08.297  INFO 9612 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization completed in 24 ms
//        2017-12-08 22:19:08.426  INFO 9612 --- [nio-8080-exec-1] o.h.h.i.QueryTranslatorFactoryInitiator  : HHH000397: Using ASTQueryTranslatorFactory
//        2017-12-08 22:19:08.524 DEBUG 9612 --- [nio-8080-exec-1] org.hibernate.SQL                        :
//        select
//        customer0_.id as id1_0_,
//        customer0_.address as address2_0_,
//        customer0_.email as email3_0_,
//        customer0_.name as name4_0_,
//        customer0_.reg_nr as reg_nr5_0_
//        from
//        customer customer0_
//        2017-12-08 22:19:08.561  INFO 9612 --- [nio-8080-exec-1] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=1, regNr='11111111111', name='Name11111111111111111111', address=Address1, email=EMail7}
//        2017-12-08 22:19:08.561  INFO 9612 --- [nio-8080-exec-1] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=2, regNr='2222222222', name='Name2Edit', address=Address2, email=EMail2}
//        2017-12-08 22:19:08.561  INFO 9612 --- [nio-8080-exec-1] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=5, regNr='333333333', name='Name3NewEdition', address=Address3, email=Email3}
//        2017-12-08 22:19:08.561  INFO 9612 --- [nio-8080-exec-1] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=16, regNr='44444444', name='Name4', address=Address4, email=EMail4}
//        2017-12-08 22:19:08.561  INFO 9612 --- [nio-8080-exec-1] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=17, regNr='555555', name='Name5', address=Address5, email=EMail5}
//        2017-12-08 22:19:36.399  INFO 9612 --- [nio-8080-exec-2] l.j.s.c.dao.CustomerDaoImpl              : Customer successfully saved. Customer details: Customer{id=0, regNr='777777', name='Name7', address=Address7, email=EMail7}
//        2017-12-08 22:19:36.404 DEBUG 9612 --- [nio-8080-exec-2] org.hibernate.SQL                        :
//        insert
//        into
//        customer
//        (address, email, name, reg_nr)
//        values
//        (?, ?, ?, ?)
//        2017-12-08 22:19:36.410 TRACE 9612 --- [nio-8080-exec-2] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [VARCHAR] - [Address7]
//        2017-12-08 22:19:36.410 TRACE 9612 --- [nio-8080-exec-2] o.h.type.descriptor.sql.BasicBinder      : binding parameter [2] as [VARCHAR] - [EMail7]
//        2017-12-08 22:19:36.410 TRACE 9612 --- [nio-8080-exec-2] o.h.type.descriptor.sql.BasicBinder      : binding parameter [3] as [VARCHAR] - [Name7]
//        2017-12-08 22:19:36.410 TRACE 9612 --- [nio-8080-exec-2] o.h.type.descriptor.sql.BasicBinder      : binding parameter [4] as [VARCHAR] - [777777]
//        2017-12-08 22:19:36.433 DEBUG 9612 --- [nio-8080-exec-4] org.hibernate.SQL                        :
//        select
//        customer0_.id as id1_0_,
//        customer0_.address as address2_0_,
//        customer0_.email as email3_0_,
//        customer0_.name as name4_0_,
//        customer0_.reg_nr as reg_nr5_0_
//        from
//        customer customer0_
//        2017-12-08 22:19:36.435  INFO 9612 --- [nio-8080-exec-4] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=1, regNr='11111111111', name='Name11111111111111111111', address=Address1, email=EMail7}
//        2017-12-08 22:19:36.435  INFO 9612 --- [nio-8080-exec-4] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=2, regNr='2222222222', name='Name2Edit', address=Address2, email=EMail2}
//        2017-12-08 22:19:36.435  INFO 9612 --- [nio-8080-exec-4] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=5, regNr='333333333', name='Name3NewEdition', address=Address3, email=Email3}
//        2017-12-08 22:19:36.435  INFO 9612 --- [nio-8080-exec-4] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=16, regNr='44444444', name='Name4', address=Address4, email=EMail4}
//        2017-12-08 22:19:36.435  INFO 9612 --- [nio-8080-exec-4] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=17, regNr='555555', name='Name5', address=Address5, email=EMail5}
//        2017-12-08 22:19:36.435  INFO 9612 --- [nio-8080-exec-4] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=18, regNr='777777', name='Name7', address=Address7, email=EMail7}
//        2017-12-08 22:19:39.470 DEBUG 9612 --- [nio-8080-exec-5] org.hibernate.SQL                        :
//        select
//        customer0_.id as id1_0_0_,
//        customer0_.address as address2_0_0_,
//        customer0_.email as email3_0_0_,
//        customer0_.name as name4_0_0_,
//        customer0_.reg_nr as reg_nr5_0_0_
//        from
//        customer customer0_
//        where
//        customer0_.id=?
//        2017-12-08 22:19:39.473 TRACE 9612 --- [nio-8080-exec-5] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [INTEGER] - [18]
//        2017-12-08 22:19:39.483  INFO 9612 --- [nio-8080-exec-5] l.j.s.c.dao.CustomerDaoImpl              : Customer successfully loaded. Customer details: Customer{id=18, regNr='777777', name='Name7', address=Address7, email=EMail7}
//        2017-12-08 22:19:39.485 DEBUG 9612 --- [nio-8080-exec-5] org.hibernate.SQL                        :
//        select
//        customer0_.id as id1_0_,
//        customer0_.address as address2_0_,
//        customer0_.email as email3_0_,
//        customer0_.name as name4_0_,
//        customer0_.reg_nr as reg_nr5_0_
//        from
//        customer customer0_
//        2017-12-08 22:19:39.488  INFO 9612 --- [nio-8080-exec-5] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=1, regNr='11111111111', name='Name11111111111111111111', address=Address1, email=EMail7}
//        2017-12-08 22:19:39.488  INFO 9612 --- [nio-8080-exec-5] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=2, regNr='2222222222', name='Name2Edit', address=Address2, email=EMail2}
//        2017-12-08 22:19:39.488  INFO 9612 --- [nio-8080-exec-5] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=5, regNr='333333333', name='Name3NewEdition', address=Address3, email=Email3}
//        2017-12-08 22:19:39.488  INFO 9612 --- [nio-8080-exec-5] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=16, regNr='44444444', name='Name4', address=Address4, email=EMail4}
//        2017-12-08 22:19:39.489  INFO 9612 --- [nio-8080-exec-5] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=17, regNr='555555', name='Name5', address=Address5, email=EMail5}
//        2017-12-08 22:19:39.489  INFO 9612 --- [nio-8080-exec-5] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=18, regNr='777777', name='Name7', address=Address7, email=EMail7}
//        2017-12-08 22:19:48.304  INFO 9612 --- [nio-8080-exec-8] l.j.s.c.dao.CustomerDaoImpl              : Customer successfully update. Customer details: Customer{id=18, regNr='777777', name='Name7Edition', address=Address7, email=EMail7}
//        2017-12-08 22:19:48.313 DEBUG 9612 --- [nio-8080-exec-8] org.hibernate.SQL                        :
//        update
//        customer
//        set
//        address=?,
//        email=?,
//        name=?,
//        reg_nr=?
//        where
//        id=?
//        2017-12-08 22:19:48.315 TRACE 9612 --- [nio-8080-exec-8] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [VARCHAR] - [Address7]
//        2017-12-08 22:19:48.315 TRACE 9612 --- [nio-8080-exec-8] o.h.type.descriptor.sql.BasicBinder      : binding parameter [2] as [VARCHAR] - [EMail7]
//        2017-12-08 22:19:48.316 TRACE 9612 --- [nio-8080-exec-8] o.h.type.descriptor.sql.BasicBinder      : binding parameter [3] as [VARCHAR] - [Name7Edition]
//        2017-12-08 22:19:48.316 TRACE 9612 --- [nio-8080-exec-8] o.h.type.descriptor.sql.BasicBinder      : binding parameter [4] as [VARCHAR] - [777777]
//        2017-12-08 22:19:48.316 TRACE 9612 --- [nio-8080-exec-8] o.h.type.descriptor.sql.BasicBinder      : binding parameter [5] as [INTEGER] - [18]
//        2017-12-08 22:19:48.331 DEBUG 9612 --- [nio-8080-exec-9] org.hibernate.SQL                        :
//        select
//        customer0_.id as id1_0_,
//        customer0_.address as address2_0_,
//        customer0_.email as email3_0_,
//        customer0_.name as name4_0_,
//        customer0_.reg_nr as reg_nr5_0_
//        from
//        customer customer0_
//        2017-12-08 22:19:48.333  INFO 9612 --- [nio-8080-exec-9] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=1, regNr='11111111111', name='Name11111111111111111111', address=Address1, email=EMail7}
//        2017-12-08 22:19:48.333  INFO 9612 --- [nio-8080-exec-9] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=2, regNr='2222222222', name='Name2Edit', address=Address2, email=EMail2}
//        2017-12-08 22:19:48.333  INFO 9612 --- [nio-8080-exec-9] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=5, regNr='333333333', name='Name3NewEdition', address=Address3, email=Email3}
//        2017-12-08 22:19:48.333  INFO 9612 --- [nio-8080-exec-9] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=16, regNr='44444444', name='Name4', address=Address4, email=EMail4}
//        2017-12-08 22:19:48.333  INFO 9612 --- [nio-8080-exec-9] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=17, regNr='555555', name='Name5', address=Address5, email=EMail5}
//        2017-12-08 22:19:48.333  INFO 9612 --- [nio-8080-exec-9] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=18, regNr='777777', name='Name7Edition', address=Address7, email=EMail7}
//        2017-12-08 22:20:13.503 DEBUG 9612 --- [nio-8080-exec-2] org.hibernate.SQL                        :
//        select
//        customer0_.id as id1_0_,
//        customer0_.address as address2_0_,
//        customer0_.email as email3_0_,
//        customer0_.name as name4_0_,
//        customer0_.reg_nr as reg_nr5_0_
//        from
//        customer customer0_
//        2017-12-08 22:20:13.506  INFO 9612 --- [nio-8080-exec-2] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=1, regNr='11111111111', name='Name11111111111111111111', address=Address1, email=EMail7}
//        2017-12-08 22:20:13.506  INFO 9612 --- [nio-8080-exec-2] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=2, regNr='2222222222', name='Name2Edit', address=Address2, email=EMail2}
//        2017-12-08 22:20:13.506  INFO 9612 --- [nio-8080-exec-2] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=5, regNr='333333333', name='Name3NewEdition', address=Address3, email=Email3}
//        2017-12-08 22:20:13.506  INFO 9612 --- [nio-8080-exec-2] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=16, regNr='44444444', name='Name4', address=Address4, email=EMail4}
//        2017-12-08 22:20:13.506  INFO 9612 --- [nio-8080-exec-2] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=17, regNr='555555', name='Name5', address=Address5, email=EMail5}
//        2017-12-08 22:20:13.506  INFO 9612 --- [nio-8080-exec-2] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=18, regNr='777777', name='Name7Edition', address=Address7, email=EMail7}
//        2017-12-08 22:20:15.726 DEBUG 9612 --- [nio-8080-exec-6] org.hibernate.SQL                        :
//        select
//        customer0_.id as id1_0_0_,
//        customer0_.address as address2_0_0_,
//        customer0_.email as email3_0_0_,
//        customer0_.name as name4_0_0_,
//        customer0_.reg_nr as reg_nr5_0_0_
//        from
//        customer customer0_
//        where
//        customer0_.id=?
//        2017-12-08 22:20:15.727 TRACE 9612 --- [nio-8080-exec-6] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [INTEGER] - [18]
//        2017-12-08 22:20:15.732  INFO 9612 --- [nio-8080-exec-6] l.j.s.c.dao.CustomerDaoImpl              : Customer successfully removed. Customer details: Customer{id=18, regNr='777777', name='Name7Edition', address=Address7, email=EMail7}
//        2017-12-08 22:20:15.733 DEBUG 9612 --- [nio-8080-exec-6] org.hibernate.SQL                        :
//        delete
//        from
//        customer
//        where
//        id=?
//        2017-12-08 22:20:15.733 TRACE 9612 --- [nio-8080-exec-6] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [INTEGER] - [18]
//        2017-12-08 22:20:15.762 DEBUG 9612 --- [nio-8080-exec-5] org.hibernate.SQL                        :
//        select
//        customer0_.id as id1_0_,
//        customer0_.address as address2_0_,
//        customer0_.email as email3_0_,
//        customer0_.name as name4_0_,
//        customer0_.reg_nr as reg_nr5_0_
//        from
//        customer customer0_
//        2017-12-08 22:20:15.764  INFO 9612 --- [nio-8080-exec-5] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=1, regNr='11111111111', name='Name11111111111111111111', address=Address1, email=EMail7}
//        2017-12-08 22:20:15.764  INFO 9612 --- [nio-8080-exec-5] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=2, regNr='2222222222', name='Name2Edit', address=Address2, email=EMail2}
//        2017-12-08 22:20:15.764  INFO 9612 --- [nio-8080-exec-5] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=5, regNr='333333333', name='Name3NewEdition', address=Address3, email=Email3}
//        2017-12-08 22:20:15.764  INFO 9612 --- [nio-8080-exec-5] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=16, regNr='44444444', name='Name4', address=Address4, email=EMail4}
//        2017-12-08 22:20:15.764  INFO 9612 --- [nio-8080-exec-5] l.j.s.c.dao.CustomerDaoImpl              : Customer list: Customer{id=17, regNr='555555', name='Name5', address=Address5, email=EMail5}
//
//        Process finished with exit code 1
//