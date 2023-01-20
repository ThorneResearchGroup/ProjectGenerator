package tech.tresearchgroup.microservices;

import io.activej.http.HttpMethod;
import io.activej.http.HttpResponse;
import io.activej.http.RoutingServlet;
import io.activej.inject.annotation.Provides;
import io.activej.inject.module.AbstractModule;

public class Endpoint extends AbstractModule {
    @Provides
    public RoutingServlet servlet() {
        return RoutingServlet.create()
                .map(HttpMethod.GET, "/", request -> HttpResponse.ok200());
    }
}
