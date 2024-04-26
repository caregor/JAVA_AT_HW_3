package ru.gb.accuwheater;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.gb.accuweather.location.City;
import ru.gb.accuweather.weather.History;

import java.util.List;

import static io.restassured.RestAssured.given;

public class GetHistoricalCurrentConditionsTest extends AccuweatherAbstractTest{

    @Test
    void getHistory24Hours(){
        List<History> response = given()
                .queryParam("apikey", getApikey())
                .pathParam("locationkey", 293142)
                .when()
                .get(getBaseUrl()+"/currentconditions/v1/{locationkey}/historical/24")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(1000L))
                .extract()
                .body().jsonPath().getList(".", History.class);

        Assertions.assertEquals(24, response.size());

    }
}
