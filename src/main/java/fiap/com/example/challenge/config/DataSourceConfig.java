package fiap.com.example.challenge.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.CannotReadScriptException;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;


@Component
public class DataSourceConfig {
//    @Bean
//    public DataSourceInitializer dataSourceInitializer(DataSource dataSource) {
//        ResourceDatabasePopulator databasePopulator = new ResourceDatabasePopulator();
//        //databasePopulator.addScript(new ClassPathResource("data/schema.sql"));
//        databasePopulator.addScript(new ClassPathResource("data/data.sql"));
//
//        DataSourceInitializer initializer = new DataSourceInitializer();
//        initializer.setDataSource(dataSource);
//        initializer.setDatabasePopulator(databasePopulator);
//        return initializer;
//    }

    private final DataSource dataSource;

    @Autowired
    public DataSourceConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runDataScriptsAfterStartup() {
        ResourceDatabasePopulator resourceDatabasePopulator = new ResourceDatabasePopulator();
        try {
            resourceDatabasePopulator.addScript(new ClassPathResource("data/data.sql"));
            resourceDatabasePopulator.execute(dataSource);
            System.out.println("data.sql script executed successfully.");
        } catch (CannotReadScriptException e) {
            System.err.println("Failed to read data.sql: " + e.getMessage());
            throw e;
        }
    }

}
