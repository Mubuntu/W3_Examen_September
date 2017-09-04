package edu.ap.rest;

import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import edu.ap.xml.XMLParser;

public class BestellingResource  extends ServerResource{
	@Get("html")
	public String getBestellingen() {
		XMLParser parser = new XMLParser();
		return parser.getBestellingen();
	}
	
	@Post("txt")
	public String addPatient(String xml) {
		XMLParser parser = new XMLParser();
		return parser.addPatient(xml);
	}
}
