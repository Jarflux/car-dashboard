package be.jarflux.car;

import be.jarflux.car.controller.ClimateController;
import be.jarflux.car.controller.EnergyController;
import be.jarflux.car.controller.MultimediaController;
import be.jarflux.car.health.BasicHealthCheck;
import com.google.inject.Guice;
import com.google.inject.Injector;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;
import org.eclipse.jetty.servlets.CrossOriginFilter;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import java.util.EnumSet;

/**
 * Developer: Ben Oeyen
 * Date: 05/04/16
 */

public class Car extends Application<Configuration> {

    public static void main(String[] args) throws Exception {
        new Car().run(args);
    }

    @Override
    public void run(Configuration configuration, Environment environment) throws Exception {

        //Register HealthChecks
        environment.healthChecks().register("basic", new BasicHealthCheck());

        //Enable CORS
        FilterRegistration.Dynamic filter = environment.servlets().addFilter("CORS", CrossOriginFilter.class);
        filter.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), true, "/*");
        filter.setInitParameter(CrossOriginFilter.ALLOWED_METHODS_PARAM, "GET,PUT,POST,DELETE,OPTIONS");
        filter.setInitParameter(CrossOriginFilter.ALLOWED_ORIGINS_PARAM, "*");
        filter.setInitParameter(CrossOriginFilter.ACCESS_CONTROL_ALLOW_ORIGIN_HEADER, "*");
        filter.setInitParameter("allowedHeaders", "Content-Type,Authorization,X-Requested-With,Content-Length,Accept,Origin");
        filter.setInitParameter("allowCredentials", "true");

        //Dependency Injection
        Injector injector = Guice.createInjector();
        final ClimateController climateController = injector.getInstance(ClimateController.class);
        final EnergyController energyController = injector.getInstance(EnergyController.class);
        final MultimediaController multimediaController = injector.getInstance(MultimediaController.class);

        //Register REST Controllers
        environment.jersey().register(climateController);
        environment.jersey().register(energyController);
        environment.jersey().register(multimediaController);
    }
}