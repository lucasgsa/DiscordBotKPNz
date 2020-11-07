package util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class PreMessagesLoader {
	private String path;
	JSONObject json;
	
	public PreMessagesLoader(String path) throws IOException, ParseException {
		this.path = path;
		JSONParser jparser = new JSONParser();
		BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream(this.path), "UTF-8"));
		json = (JSONObject) jparser.parse(fr);
		fr.close();
		System.out.println("PreMessagesLoader - Mensagens pré-criadas carregadas com sucesso!");
	}
	
	public String getOutput(String name) {
		return (String) json.get(name);
	}
	
	@SuppressWarnings("unchecked")
	public Set<String> getInputs() {
		return json.keySet();
	}
}
