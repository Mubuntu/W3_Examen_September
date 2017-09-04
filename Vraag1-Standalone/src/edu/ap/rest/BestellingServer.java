package edu.ap.rest;

import org.restlet.Component;
import org.restlet.data.Protocol;

public class BestellingServer {
public static void main(String[] args) throws Exception {
	 // Create a new Component.  
    Component component = new Component();  

    // Add a new HTTP server listening on port 8182.  
    component.getServers().add(Protocol.HTTP, 8484);  

    // Attach the sample application.  
    component.getDefaultHost().attach("/bestelling",  new BestellingApplication());  

    // Start the component.  
    component.start();  
}
}
