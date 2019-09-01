package rest.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.util.Properties;

@EnableTransactionManagement
@Configuration
public class HibernateConfig implements WebMvcConfigurer, TransactionManagementConfigurer {



    @Bean
    public LocalSessionFactoryBean  getSessionFactory() throws PropertyVetoException {

        Properties properties = new Properties();

        properties.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
        properties.put("hibernate.show_sql","true");
        properties.put("hibernate.hbm2ddl.auto","update");

        LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
        localSessionFactoryBean.setDataSource(getDataSource());
        localSessionFactoryBean.setPackagesToScan("rest");
        localSessionFactoryBean.setHibernateProperties(properties);

        return localSessionFactoryBean;
    }





    @Bean
    public DataSource getDataSource() throws PropertyVetoException {

        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();

        comboPooledDataSource.setDriverClass("org.h2.Driver");
        comboPooledDataSource.setJdbcUrl("jdbc:h2:~/test");
        comboPooledDataSource.setUser("sa");
        comboPooledDataSource.setPassword("");
        comboPooledDataSource.setMinPoolSize(2);
        comboPooledDataSource.setMaxPoolSize(8);
        comboPooledDataSource.setMaxIdleTime(30000);
        return comboPooledDataSource;
    }

    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager(){

        try {
            return getHibernateTransactionManager();
        } catch (PropertyVetoException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Bean
    public HibernateTransactionManager getHibernateTransactionManager() throws PropertyVetoException, IOException {

        HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
        hibernateTransactionManager.setSessionFactory( getSessionFactory().getObject());

        return hibernateTransactionManager;
    }

//    @Bean
//    public HibernateTransactionManager getTransactionManager() throws IOException{
//        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
//        transactionManager.setSessionFactory(getSessionFactory());
//
//        return transactionManager;
//    }





}
