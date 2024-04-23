package ru.gb.accuwheater;

import io.restassured.http.Method;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
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
                .get(getBaseUrl()+"/locations/v1/cities/search")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(1000l))
                .extract()
                .body().jsonPath().getList(".", Location.class);
        Assertions.assertEquals(1, response.size());
        Assertions.assertEquals("Kemerovo", response.get(0).getEnglishName());
    }
    @Test
    void getLocation_by_locationKey(){
        Location response = given()
                .header("Accept-Encoding", "gzip")
                .queryParam("apikey", getApikey())
                .pathParam("locationkey", 293142)
                .when()
                .request(Method.GET, getBaseUrl()+"/locations/v1/{locationkey}")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(1000l))
                .extract()
                .body().jsonPath().getObject(".", Location.class);

        Assertions.assertEquals("City", response.getType());
        Assertions.assertEquals("Kemerovo", response.getEnglishName());

    }
}
