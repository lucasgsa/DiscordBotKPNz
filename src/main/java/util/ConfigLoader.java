package util;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ConfigLoader {
	private String path;
	JSONObject json;
	
	public ConfigLoader(String path) throws IOException, ParseException {
		this.path = path;
		JSONParser jparser = new JSONParser();
		FileReader fr = new FileReader(this.path);
		json = (JSONObject) jparser.parse(fr);
		System.out.println("ConfigLoader - Configurações do bot foram carregadas com sucesso!");
	}
	
	public Object getObject(String name) {
		return json.get(name);
	}
}
