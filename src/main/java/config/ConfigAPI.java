package config;

public class ConfigAPI {
	private ConfigLoader config = new ConfigLoader();
    private String baseUrl = config.get("base.url");
    private String apiKey = config.get("api.key");
    
    public String getFullUrl() {
        return baseUrl + apiKey + "/latest/USD";
    }

    public void printUrl() {
        System.out.println("URL de requisição: " + getFullUrl());
    }
}
