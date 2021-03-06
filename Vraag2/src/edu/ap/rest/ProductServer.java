package edu.ap.rest;

import org.restlet.Component;
import org.restlet.data.Protocol;

public class ProductServer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				try {
					
					// Create a new Component.
				    Component component = new Component();
			
				    // Add a new HTTP server listening on port 8585.
				    component.getServers().add(Protocol.HTTP, 8585);
			
				    // Attach the sample application.
				    component.getDefaultHost().attach("/inventory", new ProductApplication());
					component.start();
				} 
			    catch (Exception e) {
					System.out.println("ERROR in productserver: " + e.getMessage());
				}

	}
}
