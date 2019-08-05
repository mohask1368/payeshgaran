package moh.ask.restcrud.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.h2.jdbcx.JdbcDataSourceFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;


public class Config {

//    @Autowired
//    private DataSource dataSource;




//    @Bean(name = "sessionFactory")
//    public LocalSessionFactoryBean getSessionFactory() {            // creating session factory
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource);
//        sessionFactory.setPackagesToScan(new String[]{"moh.ask.restcrud.model"});
//      //  sessionFactory.setHibernateProperties(hibernateProperties());
//        return sessionFactory;
//    }



   /* private Properties hibernateProperties() {                  // configure hibernate properties
        Properties properties = new Properties();
        properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
        properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
        properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
        properties.put("hibernate.hbm2ddl.auto", "update");
        return properties;
    }*/


//    @Autowired
//    @Bean(name = "transactionManager")                      // creating transaction manager factory
//    public HibernateTransactionManager getTransactionManager(
//            SessionFactory sessionFactory) {
//        HibernateTransactionManager transactionManager = new HibernateTransactionManager(
//                sessionFactory);
//        return transactionManager;
//    }





























//    @Autowired
//    private Environment env;
//
//    @Bean
//    public LocalSessionFactoryBean sessionFactory() {
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//        sessionFactory.setDataSource(restDataSource());
//        sessionFactory.setPackagesToScan(new String[] { "moh.ask.restcrud" });
//        sessionFactory.setHibernateProperties(hibernateProperties());
//
//        return sessionFactory;
//    }
//
//
//    @Bean
//    public DataSource restDataSource() {
//        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setDriverClassName(env.getProperty("org.h2.Driver"));
//        dataSource.setUrl(env.getProperty("jdbc:h2:file:~/test"));
//        dataSource.setUsername(env.getProperty("sa"));
//        dataSource.setPassword(env.getProperty(""));
//
//        return dataSource;
//    }
//
//
//    Properties hibernateProperties() {
//        return new Properties() {
//            {
//                setProperty("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
//                setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
//                setProperty("hibernate.globally_quoted_identifiers", "true");
//            }
//        };
//    }

}
