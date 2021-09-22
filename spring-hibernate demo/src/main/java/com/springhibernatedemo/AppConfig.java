package com.springhibernatedemo;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan
//@EnableTransactionManagement annotation that enables transaction support 
//to the application
@EnableTransactionManagement
public class AppConfig {
	
	@Bean
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/mytrainingdb");
		dataSource.setUsername("root");
		dataSource.setPassword("secret");
		return dataSource;
	}
	
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		//LocalSessionFactoryBean creates hibernate session factory
		//and set in the spring application context so that
		//session factory can be injected wherever required
		//using @Autowired
		
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		
		//linking datasource with session factory
		sessionFactory.setDataSource(dataSource());
		//add packages where @Entity classes are present
		sessionFactory.setPackagesToScan("com.springhibernatedemo");
		//setting the hibernate properties
		sessionFactory.setHibernateProperties(getHibernateProperties());
		return sessionFactory;
	}
	
	private Properties getHibernateProperties() {
		Properties props = new Properties();
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		props.setProperty("hibernate.show_sql", "true");
		return props;
		
	}

	//this is a bean that is used for transaction management
	//for hibernate methods when integrated using spring
	//it works with @Transactional for commit, rollback operations
	//all the ACID properties are managed by transaction manager
	@Bean
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory);
		return txManager;
	}
}
