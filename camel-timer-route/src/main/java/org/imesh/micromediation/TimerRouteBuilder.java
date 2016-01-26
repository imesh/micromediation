package org.imesh.micromediation;

import javax.inject.Inject;

import org.apache.camel.Endpoint;
import org.apache.camel.cdi.ContextName;
import org.apache.camel.cdi.Uri;

/**
 * Timer route builder
 */
@ContextName("timerCdiCamelContext")
public class TimerRouteBuilder extends org.apache.camel.builder.RouteBuilder {

    @Inject
    @Uri("timer:foo?period=5000")
    private Endpoint inputEndpoint;

    @Inject
    @Uri("log:output")
    private Endpoint resultEndpoint;

    @Inject
    @Uri("netty4-http:http://localhost:8080/camel-sample-web/camel/hello?disconnect=true&keepAlive=false")
    private Endpoint httpEndpoint;

    @Inject
    private NameBean nameBean;

    @Override
    public void configure() throws Exception {
        // Route configuration in Java DSL
        from(inputEndpoint)
                .setHeader("name", method(nameBean))
                .to(httpEndpoint)
                .to(resultEndpoint);
    }
}
