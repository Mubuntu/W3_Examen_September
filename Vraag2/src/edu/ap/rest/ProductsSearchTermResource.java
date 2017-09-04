package edu.ap.rest;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import edu.ap.json.JSONFactory;

public class ProductsSearchTermResource extends ServerResource {

	@Get("html")
	public String getSearchProduct(String search_term) {
		search_term = getAttribute("searchterm");
		JSONFactory parser = new JSONFactory();
		return parser.getProduct(search_term);
	}
}
