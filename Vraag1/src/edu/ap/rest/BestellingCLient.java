package edu.ap.rest;

import org.restlet.resource.ClientResource;

public class BestellingCLient {
	 public static void main(String[] args) {
		 try {
		       	ClientResource resource = new ClientResource("http://localhost:8383/bestelling/bestellingen");
		       	// Post a new race
		       	String bestelling1 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
		       	bestelling1 += "<bestelling id=\"3\" datum=\"25/01/2017\" naamKlant=\"Bin laden\" adres=\"brustraat 32\" hoeveelheid=\"7\">";
		       	bestelling1 += "<product id=\"4\">Verkoudheidje</product>";
		       	bestelling1 += "</bestelling>";
		   		resource.post(bestelling1);
		   		// get the response
		       	System.out.println(resource.getResponseEntity().getText());
		       	
		       	String bestelling2 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
		       	bestelling2 += "<bestelling id=\"5\" datum=\"25/02/2017\" naamKlant=\"Kimberly Maes\" adres=\"antwerpenstraat 3\" hoeveelheid=\"2\">";
		       	bestelling2 += "<prod"
		       			+ "uct id=\"7\">cursus</product>";
		       	bestelling2 += "</bestelling>";
		   		resource.post(bestelling2);
		   		// get the response
		       	System.out.println(resource.getResponseEntity().getText());
		       }
		       catch (Exception e) {
		           System.out.println("In main : " + e.getMessage());
		       }
	}
}
