package projekcik.projekt.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student jan = new Student(
                    1L,
                    "Jan",
                    "jankowalski@wp.pl",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    21
            );
            Student piotr = new Student(
                    1L,
                    "Piotr",
                    "piotrnowak@wp.pl",
                    LocalDate.of(2003, Month.MARCH, 14),
                    18
            );

            repository.saveAll(
                    List.of(piotr, jan)
            );
        };
    }
}
