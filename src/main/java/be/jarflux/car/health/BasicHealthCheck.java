package be.jarflux.car.health;

import com.codahale.metrics.health.HealthCheck;

/**
 * Developer: Ben Oeyen
 * Date: 05/04/16
 */
public class BasicHealthCheck extends HealthCheck {

        @Override
        protected Result check() throws Exception {
            return Result.healthy("App is up and running");
        }
    }
