package config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import config.ConfigLoader;

public class ConfigLoader {
	 private Properties props;

	    public ConfigLoader() {
	        props = new Properties();
	        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
	            if (input != null) {
	                props.load(input);
	            } else {
	                System.err.println("Arquivo config.properties não encontrado.");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public String get(String key) {
	        return props.getProperty(key);
	    }
}
