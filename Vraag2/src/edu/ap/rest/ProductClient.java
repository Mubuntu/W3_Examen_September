package edu.ap.rest;

import org.json.JSONObject;
import org.restlet.resource.ClientResource;

public class ProductClient {
	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
			ClientResource resource = new ClientResource("http://localhost:8585/inventory/producten");
			JSONObject product1 = new JSONObject();
			product1.put("naam", "xbox 360");
			product1.put("producent", "MicroSoft");
			product1.put("prijs", 200);
			// product1.put("Hoeveelheid", "20");
			resource.post(product1.toString());
			System.out.println(resource.getResponseEntity().getText());

			JSONObject product2 = new JSONObject();
			product2.put("naam", "Playstation 4 PRo");
			product2.put("producent", "Sony");
			product2.put("prijs", 450);
			// product2.put("Hoeveelheid", "20");
			resource.post(product2.toString());
			System.out.println(resource.getResponseEntity().getText());

			ClientResource resource2 = new ClientResource("http://localhost:8585/inventory/producten/Macbook");
			System.out.println(resource2.get());

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR in PRODUCTCLIENT: " + e.getMessage());
		}
	}
}
