package ru.gb.accuwheater;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import ru.gb.accuweather.location.Location;

import java.util.List;

import static io.restassured.RestAssured.given;

public class GetLocationTest extends AccuweatherAbstractTest{

    @Test
    void getLocation_search_retKemerovo(){
        List<Location>response = given()
                .queryParam("apikey", getApikey())
                .queryParam("q", "Kemerovo")
                .when()
                .get(getBaseUrl()+"/location/v1/cities/search")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(1000l))
                .extract()
                .body().jsonPath().getList(".", Location.class);
    }
}
