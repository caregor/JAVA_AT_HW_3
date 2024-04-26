package ru.gb.accuweather.location;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Id",
        "Name",
        "WeatherCode"
})
public class LocalSource {
    @JsonProperty("Id")
    private Integer id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("WeatherCode")
    private String weatherCode;

    @JsonProperty("Id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("WeatherCode")
    public String getUnitType() {
        return weatherCode;
    }

    @JsonProperty("WeatherCode")
    public void setWeatherCode(String weatherCode) {
        this.weatherCode = weatherCode;
    }
}
