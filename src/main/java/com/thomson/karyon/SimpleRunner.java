package com.thomson.karyon;

import com.netflix.karyon.Karyon;
import com.netflix.karyon.ShutdownModule;
import com.netflix.karyon.archaius.ArchaiusSuite;

/**
 * @author Nitesh Kant
 */
public class SimpleRunner {

    public static void main(String[] args) {

        Karyon.forRequestHandler(8888,
                                 new SimpleRouter(), /* Use this instead of RouterWithInterceptors below if interceptors are not required */
                                 //new RouterWithInterceptors(),
                                 new ArchaiusSuite("hello-netflix-oss"),
                                 // KaryonEurekaModule.asSuite(), /* Uncomment if you need eureka */
                                 /*KaryonWebAdminModule.asSuite(),*/
                                 ShutdownModule.asSuite())/*,
                                 KaryonServoModule.asSuite())*/
              .startAndWaitTillShutdown();
    }
}
