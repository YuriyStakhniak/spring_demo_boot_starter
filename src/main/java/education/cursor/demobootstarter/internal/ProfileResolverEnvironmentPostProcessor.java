package education.cursor.demobootstarter.internal;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

public class ProfileResolverEnvironmentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        System.out.println("Volodia I hate you!!!!!!");
        if (environment.getActiveProfiles().length == 0) {
                environment.addActiveProfile("DEV");
        }
    }
}
