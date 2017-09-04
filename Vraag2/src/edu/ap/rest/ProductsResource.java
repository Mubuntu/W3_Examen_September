package edu.ap.rest;

import edu.ap.json.*;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class ProductsResource extends ServerResource {

	@Get("html")
	public String getProducts() {
		JSONFactory json = new JSONFactory();
		return json.allProducts();
	}

}
