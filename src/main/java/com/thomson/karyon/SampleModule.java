/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thomson.karyon;

import com.google.inject.AbstractModule;
import com.netflix.governator.guice.LifecycleInjectorBuilder;
import com.netflix.governator.guice.LifecycleInjectorBuilderSuite;
import com.netflix.karyon.health.HealthCheckHandler;

/**
 *
 * @author u2410358
 */
public class SampleModule extends AbstractModule {
    @Override
    protected void configure() {
       bind(HealthCheckHandler.class).to(HealthCheck.class);
    }
    
    public static LifecycleInjectorBuilderSuite asSuite() {
        return new LifecycleInjectorBuilderSuite() {
            @Override
            public void configure(LifecycleInjectorBuilder builder) {
                builder.withAdditionalModules(new SampleModule());
            }
        };
    }
    
}
