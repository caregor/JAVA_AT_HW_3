package ru.gb.accuwheater;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public abstract class AccuweatherAbstractTest {

    static Properties prop = new Properties();
    private static InputStream configFile;
    private static String apikey;
    private static String baseUrl;

    @BeforeAll
    static void initTest() throws IOException {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        configFile = new FileInputStream("src/test/resources/accuweather.properties");
        prop.load(configFile);

        apikey = prop.getProperty("apikey");
        baseUrl = prop.getProperty("base_url");

    }

    public static String getBaseUrl() {
        return baseUrl;
    }

    public static String getApikey() {
        return apikey;
    }
}
