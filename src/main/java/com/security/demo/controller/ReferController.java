package com.security.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/rest/ref")
public class ReferController {

	@GetMapping("/get")
	public String get() {
		return "well come";
	}
}


/*
 * 2020-04-05 11:13:17.231  INFO 23520 --- [restartedMain] c.s.demo.SpringSecurityApplication       : No active profile set, falling back to default profiles: default
2020-04-05 11:13:17.683  INFO 23520 --- [restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2020-04-05 11:13:17.746  INFO 23520 --- [restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 45ms. Found 2 JPA repository interfaces.
2020-04-05 11:13:17.915  INFO 23520 --- [restartedMain] o.s.cloud.context.scope.GenericScope     : BeanFactory id=5439de8e-6876-3288-a043-2934c74a779e
2020-04-05 11:13:18.030  INFO 23520 --- [restartedMain] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.security.config.annotation.configuration.ObjectPostProcessorConfiguration' of type [org.springframework.security.config.annotation.configuration.ObjectPostProcessorConfiguration] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2020-04-05 11:13:18.030  INFO 23520 --- [restartedMain] trationDelegate$BeanPostProcessorChecker : Bean 'objectPostProcessor' of type [org.springframework.security.config.annotation.configuration.AutowireBeanFactoryObjectPostProcessor] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2020-04-05 11:13:18.030  INFO 23520 --- [restartedMain] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.security.access.expression.method.DefaultMethodSecurityExpressionHandler@2502c2be' of type [org.springframework.security.access.expression.method.DefaultMethodSecurityExpressionHandler] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2020-04-05 11:13:18.030  INFO 23520 --- [restartedMain] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration' of type [org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2020-04-05 11:13:18.030  INFO 23520 --- [restartedMain] trationDelegate$BeanPostProcessorChecker : Bean 'methodSecurityMetadataSource' of type [org.springframework.security.access.method.DelegatingMethodSecurityMetadataSource] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2020-04-05 11:13:18.360  INFO 23520 --- [restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 9080 (http)
2020-04-05 11:13:18.362  INFO 23520 --- [restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2020-04-05 11:13:18.362  INFO 23520 --- [restartedMain] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.33]
2020-04-05 11:13:18.446  INFO 23520 --- [restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2020-04-05 11:13:18.447  INFO 23520 --- [restartedMain] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1205 ms
2020-04-05 11:13:18.570  INFO 23520 --- [restartedMain] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2020-04-05 11:13:18.689  INFO 23520 --- [restartedMain] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.4.12.Final
2020-04-05 11:13:18.764  INFO 23520 --- [restartedMain] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.0.Final}
2020-04-05 11:13:18.829  INFO 23520 --- [restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2020-04-05 11:13:18.829  WARN 23520 --- [restartedMain] com.zaxxer.hikari.util.DriverDataSource  : Registered driver with driverClassName=com.mysql.jdbc.Driver was not found, trying direct instantiation.
2020-04-05 11:13:19.166  INFO 23520 --- [restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2020-04-05 11:13:19.175  INFO 23520 --- [restartedMain] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.MySQL8Dialect
2020-04-05 11:13:19.649  INFO 23520 --- [restartedMain] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2020-04-05 11:13:19.665  INFO 23520 --- [restartedMain] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2020-04-05 11:13:19.687  INFO 23520 --- [restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2020-04-05 11:13:19.730  WARN 23520 --- [restartedMain] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2020-04-05 11:13:20.050  WARN 23520 --- [restartedMain] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'springSecurityFilterChain' defined in class path resource [org/springframework/security/config/annotation/web/configuration/WebSecurityConfiguration.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [javax.servlet.Filter]: Factory method 'springSecurityFilterChain' threw exception; nested exception is java.lang.IllegalStateException: Can't configure antMatchers after anyRequest
2020-04-05 11:13:20.050  INFO 23520 --- [restartedMain] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2020-04-05 11:13:20.050  INFO 23520 --- [restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2020-04-05 11:13:20.050  INFO 23520 --- [restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
2020-04-05 11:13:20.066  INFO 23520 --- [restartedMain] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2020-04-05 11:13:20.066  INFO 23520 --- [restartedMain] ConditionEvaluationReportLoggingListener : 

Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2020-04-05 11:13:20.082 ERROR 23520 --- [restartedMain] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'springSecurityFilterChain' defined in class path resource [org/springframework/security/config/annotation/web/configuration/WebSecurityConfiguration.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [javax.servlet.Filter]: Factory method 'springSecurityFilterChain' threw exception; nested exception is java.lang.IllegalStateException: Can't configure antMatchers after anyRequest
	at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:656) ~[spring-beans-5.2.5.RELEASE.jar:5.2.5.RELEASE]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:484) ~[spring-beans-5.2.5.RELEASE.jar:5.2.5.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1338) ~[spring-beans-5.2.5.RELEASE.jar:5.2.5.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1177) ~[spring-beans-5.2.5.RELEASE.jar:5.2.5.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:557) ~[spring-beans-5.2.5.RELEASE.jar:5.2.5.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:517) ~[spring-beans-5.2.5.RELEASE.jar:5.2.5.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:323) ~[spring-beans-5.2.5.RELEASE.jar:5.2.5.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:222) ~[spring-beans-5.2.5.RELEASE.jar:5.2.5.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:321) ~[spring-beans-5.2.5.RELEASE.jar:5.2.5.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) ~[spring-beans-5.2.5.RELEASE.jar:5.2.5.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:310) ~[spring-beans-5.2.5.RELEASE.jar:5.2.5.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) ~[spring-beans-5.2.5.RELEASE.jar:5.2.5.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:882) ~[spring-beans-5.2.5.RELEASE.jar:5.2.5.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:878) ~[spring-context-5.2.5.RELEASE.jar:5.2.5.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:550) ~[spring-context-5.2.5.RELEASE.jar:5.2.5.RELEASE]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:141) ~[spring-boot-2.2.6.RELEASE.jar:2.2.6.RELEASE]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:747) [spring-boot-2.2.6.RELEASE.jar:2.2.6.RELEASE]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:397) [spring-boot-2.2.6.RELEASE.jar:2.2.6.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:315) [spring-boot-2.2.6.RELEASE.jar:2.2.6.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1226) [spring-boot-2.2.6.RELEASE.jar:2.2.6.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1215) [spring-boot-2.2.6.RELEASE.jar:2.2.6.RELEASE]
	at com.security.demo.SpringSecurityApplication.main(SpringSecurityApplication.java:10) [classes/:na]
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_241]
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_241]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_241]
	at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_241]
	at org.springframework.boot.devtools.restart.RestartLauncher.run(RestartLauncher.java:49) [spring-boot-devtools-2.2.6.RELEASE.jar:2.2.6.RELEASE]
Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [javax.servlet.Filter]: Factory method 'springSecurityFilterChain' threw exception; nested exception is java.lang.IllegalStateException: Can't configure antMatchers after anyRequest
	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:185) ~[spring-beans-5.2.5.RELEASE.jar:5.2.5.RELEASE]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:651) ~[spring-beans-5.2.5.RELEASE.jar:5.2.5.RELEASE]
	... 26 common frames omitted
Caused by: java.lang.IllegalStateException: Can't configure antMatchers after anyRequest
	at org.springframework.util.Assert.state(Assert.java:73) ~[spring-core-5.2.5.RELEASE.jar:5.2.5.RELEASE]
	at org.springframework.security.config.annotation.web.AbstractRequestMatcherRegistry.antMatchers(AbstractRequestMatcherRegistry.java:122) ~[spring-security-config-5.2.2.RELEASE.jar:5.2.2.RELEASE]
	at com.security.demo.config.UserSecurityConfig.configure(UserSecurityConfig.java:34) ~[classes/:na]
	at org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter.getHttp(WebSecurityConfigurerAdapter.java:231) ~[spring-security-config-5.2.2.RELEASE.jar:5.2.2.RELEASE]
	at org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter.init(WebSecurityConfigurerAdapter.java:322) ~[spring-security-config-5.2.2.RELEASE.jar:5.2.2.RELEASE]
	at org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter.init(WebSecurityConfigurerAdapter.java:92) ~[spring-security-config-5.2.2.RELEASE.jar:5.2.2.RELEASE]
	at com.security.demo.config.UserSecurityConfig$$EnhancerBySpringCGLIB$$8be22c.init(<generated>) ~[classes/:na]
	at org.springframework.security.config.annotation.AbstractConfiguredSecurityBuilder.init(AbstractConfiguredSecurityBuilder.java:370) ~[spring-security-config-5.2.2.RELEASE.jar:5.2.2.RELEASE]
	at org.springframework.security.config.annotation.AbstractConfiguredSecurityBuilder.doBuild(AbstractConfiguredSecurityBuilder.java:324) ~[spring-security-config-5.2.2.RELEASE.jar:5.2.2.RELEASE]
	at org.springframework.security.config.annotation.AbstractSecurityBuilder.build(AbstractSecurityBuilder.java:41) ~[spring-security-config-5.2.2.RELEASE.jar:5.2.2.RELEASE]
	at org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration.springSecurityFilterChain(WebSecurityConfiguration.java:104) ~[spring-security-config-5.2.2.RELEASE.jar:5.2.2.RELEASE]
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_241]
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_241]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_241]
	at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_241]
	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:154) ~[spring-beans-5.2.5.RELEASE.jar:5.2.5.RELEASE]
	... 27 common frames omitted


 * 
 * 
 */