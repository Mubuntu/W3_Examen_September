package edu.ap.rest;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class ProductApplication extends Application {

    /**
     * Creates a root Restlet that will receive all incoming calls.
     */
   @Override
   public synchronized Restlet createInboundRoot() {

       Router router = new Router(getContext());

       router.attach("/producten", ProductsResource.class);
       router.attach("/producten/{searchterm}", ProductsSearchTermResource.class);
       return router;
   }
}