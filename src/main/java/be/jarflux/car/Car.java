package be.jarflux.car;

import be.jarflux.car.controller.EnergyController;
import be.jarflux.car.health.BasicHealthCheck;
import com.google.inject.Guice;
import com.google.inject.Injector;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

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

        //Dependency Injection
        Injector injector = Guice.createInjector();
        final EnergyController energyController = injector.getInstance(EnergyController.class);

        //Register REST Controllers
        environment.jersey().register(energyController);
    }
}