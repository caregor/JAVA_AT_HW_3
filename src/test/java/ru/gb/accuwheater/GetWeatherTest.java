package ru.gb.accuwheater;

import io.restassured.http.Method;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.gb.accuweather.weather.Weather;

import static io.restassured.RestAssured.given;

public class GetWeatherTest extends AccuweatherAbstractTest {

    @Test
    void getOneDayWeather() {
        Weather response = given()
                .queryParam("apikey", getApikey())
                .when()
                .get(getBaseUrl() + "/forecasts/v1/daily/1day/293142")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(1000l))
                .extract()
                .response()
                .body().as(Weather.class);

        Assertions.assertEquals(1, response.getDailyForecasts().size());
    }

    @Test
    void getOneDayWeatherMetrics() {
        Weather response = given()
                .queryParam("apikey", getApikey())
                .queryParam("metric", true)
                .pathParam("locationkey", 293142)
                .when()
                .get(getBaseUrl() + "/forecasts/v1/daily/1day/{locationkey}")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(1000l))
                .extract()
                .response()
                .body().as(Weather.class);

        Assertions.assertEquals("C", response.getDailyForecasts().get(0).getTemperature().getMaximum().getUnit());
        Assertions.assertEquals(17, response.getDailyForecasts().get(0).getTemperature().getMaximum().getUnitType());
    }

    @Test
    void getTenDaysWeather(){
        /**
         * Return 401 because we have only Demo key
         */
        given()
                .queryParam("apikey", getApikey())
                .pathParam("location", 293142)
                .when()
                .request(Method.GET, getBaseUrl()+"/forecasts/{version}/daily/10day/{location}")
                .then()
                .statusCode(401);
    }
}
