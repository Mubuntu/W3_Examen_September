package edu.ap.json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONFactory {
	private static final String FILENAME = "C:/Users/Public/TI/Vraag2/producten.json";
	
	public static String getProduct(String naamProduct) {
		String gevondenProduct = "";
		try {
			FileReader reader = new FileReader(FILENAME);
			JSONParser parser = new JSONParser();
			JSONArray arr = new JSONArray((JSONArray)parser.parse(reader));
			JSONObject jsonObject = (JSONObject)parser.parse(reader);
			Iterator<?> keys = jsonObject.keys();
			/*
			String[] alleObjs = new String[arr.length()];
			for (int i = 0; i < arr.length(); i++) {
				JSONObject obj = arr.getJSONObject(i);
				String naam = (String) obj.get("naam");
				String producent = (String) jsonObject.get("producent");
				int prijs = (int) jsonObject.get("prijs");
				alleObjs[i] = naam + "\n" + producent + "\n" + "\n" + prijs;
				if (naam.equals(naamProduct)) {
					gevondenProduct += "GEVONDEN Product MET DE NAAM " + naamProduct + "\n";
					gevondenProduct += naam + "\nNaam: " + naam + "\nProducent: " + producent + "\nPrijs: " + prijs;
				} else {
					gevondenProduct += "GEEN PRODUCTEN GEVONDEN MET DE NAAM" + naamProduct;
				}

			}**/

			while(keys.hasNext()){
			
			String naam = (String) jsonObject.get("Naam");
			String producent = (String) jsonObject.get("producent");
			int prijs = (int) jsonObject.get("prijs");
			//String hoeveelheid = (String) jsonObject.get("Hoeveelheid");
			
			
			if (naam.equals(naamProduct)) {
				gevondenProduct+= "GEVONDEN Product MET DE NAAM " + naamProduct + "\n";
				gevondenProduct += naam + "\nNaam: " + naam + "\nProducent: "+producent + "\nPrijs: " + prijs;
			}
			else{
				gevondenProduct += "GEEN PRODUCTEN GEVONDEN MET DE NAAM" + naamProduct;
			}
			keys.next();
			}
			

	
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR in JSONFACTORY: " + e.getMessage());
		}
		
		return gevondenProduct;
		
	}
	
	public static String allProducts(){
		String producten = "";
		BufferedReader br = null;
		try {
			String line;
			br = new BufferedReader(new FileReader(FILENAME));
			while((line=br.readLine())!=null){
				producten+=line + "\n";
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR in All Bestellingen van JSONFACTORY: " + e.getMessage());
		}
		
		return producten;

	}
}
