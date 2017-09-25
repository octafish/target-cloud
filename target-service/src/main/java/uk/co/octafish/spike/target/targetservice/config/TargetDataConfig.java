package uk.co.octafish.spike.target.targetservice.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uk.co.octafish.spike.target.targetservice.domain.Location;
import uk.co.octafish.spike.target.targetservice.domain.Target;
import uk.co.octafish.spike.target.targetservice.repository.TargetRepository;

import java.util.Arrays;

@Configuration
public class TargetDataConfig {

    static final Log log = LogFactory.getLog(TargetDataConfig.class);

    @Bean
    public CommandLineRunner commandLineRunner(TargetRepository targetRepository) {
        log.debug("Saving dummy Target data");

        return (args) -> {
            Arrays.asList(new Target("target1", Location.from(1.12, 2.13)),
                    new Target("target2", Location.from(21.111, 1.13)),
                    new Target("target3", Location.from(4.12, 7.13)),
                    new Target("target4", Location.from(11.12, 2.14)),
                    new Target("target5", Location.from(5.1, 2.13)))
                    .stream()
                    .forEach((t) -> targetRepository.save(t));
        };
    }
}
