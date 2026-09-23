package net.haruyuzuriha.seiroku.web;

import net.haruyuzuriha.seiroku.core.SeirokuCoreConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SeirokuApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeirokuApplication.class, args);
    }

    // The only place engine-web ever names an engine-core type: to obtain the
    // exported entry point and register its beans, typed as engine-api
    // interfaces from here on.
    @Bean
    SeirokuCoreConfiguration seirokuCoreConfiguration() {
        return new SeirokuCoreConfiguration();
    }

    @Bean
    net.haruyuzuriha.seiroku.api.account.AccountService accountService(
            SeirokuCoreConfiguration core) {
        return core.accountService();
    }
}
