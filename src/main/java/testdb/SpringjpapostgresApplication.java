package testdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Admin on 20.06.2019.
 */

@SpringBootApplication
@ComponentScan
public class SpringjpapostgresApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringjpapostgresApplication.class, args);
    }

}
