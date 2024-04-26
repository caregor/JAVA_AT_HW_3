package ru.gb.accuwheater;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.gb.accuweather.location.City;

import java.util.List;

import static io.restassured.RestAssured.given;

public class GetTopCitiesTest extends AccuweatherAbstractTest{

    @Test
    void getTopFiftyCities(){
        List<City> response = given()
                .pathParam("group", "50")
                .queryParam("apikey", getApikey())
                .when()
                .get(getBaseUrl()+"/currentconditions/v1/topcities/{group}")
                .then()
                .extract()
                .body().jsonPath().getList(".", City.class);

        Assertions.assertEquals(50, response.size());
    }
}
