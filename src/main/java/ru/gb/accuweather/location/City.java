package ru.gb.accuweather.location;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.gb.accuweather.weather.CityTemperature;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Key",
        "LocalizedName",
        "EnglishName",
        "Country",
        "TimeZone",
        "GeoPosition",
        "LocalObservationDateTime",
        "EpochTime",
        "WeatherText",
        "WeatherIcon",
        "HasPrecipitation",
        "PrecipitationType",
        "LocalSource",
        "IsDayTime",
        "Temperature",
        "MobileLink",
        "Link"
})

public class City {

    @JsonProperty("Key")
    private String key;
    @JsonProperty("LocalizedName")
    private String localizedName;
    @JsonProperty("EnglishName")
    private String englishName;
    @JsonProperty("Country")
    private Country country;
    @JsonProperty("TimeZone")
    private TimeZone timeZone;
    @JsonProperty("GeoPosition")
    private GeoPosition geoPosition;
    @JsonProperty("LocalObservationDateTime")
    private String localObservationDateTime;
    @JsonProperty("EpochTime")
    private Integer epochTime;
    @JsonProperty("WeatherText")
    private String weatherText;
    @JsonProperty("WeatherIcon")
    private Integer weatherIcon;
    @JsonProperty("HasPrecipitation")
    private Boolean hasPrecipitation;
    @JsonProperty("PrecipitationType")
    private Object precipitationType;
    @JsonProperty("IsDayTime")
    private Boolean isDayTime;
    @JsonProperty("LocalSource")
    private LocalSource localSource;
    @JsonProperty("Temperature")
    private CityTemperature temperature;
    @JsonProperty("MobileLink")
    private String mobileLink;
    @JsonProperty("Link")
    private String link;

    @JsonProperty("Key")
    public String getKey() {
        return key;
    }

    @JsonProperty("Key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("LocalizedName")
    public String getLocalizedName() {
        return localizedName;
    }

    @JsonProperty("LocalizedName")
    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
    }

    @JsonProperty("EnglishName")
    public String getEnglishName() {
        return englishName;
    }

    @JsonProperty("EnglishName")
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    @JsonProperty("Country")
    public Country getCountry() {
        return country;
    }

    @JsonProperty("Country")
    public void setCountry(Country country) {
        this.country = country;
    }

    @JsonProperty("TimeZone")
    public TimeZone getTimeZone() {
        return timeZone;
    }

    @JsonProperty("TimeZone")
    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    @JsonProperty("GeoPosition")
    public GeoPosition getGeoPosition() {
        return geoPosition;
    }

    @JsonProperty("GeoPosition")
    public void setGeoPosition(GeoPosition geoPosition) {
        this.geoPosition = geoPosition;
    }

    @JsonProperty("LocalObservationDateTime")
    public String getLocalObservationDateTime() {
        return localObservationDateTime;
    }

    @JsonProperty("LocalObservationDateTime")
    public void setLocalObservationDateTime(String localObservationDateTime) {
        this.localObservationDateTime = localObservationDateTime;
    }

    @JsonProperty("EpochTime")
    public Integer getEpochTime() {
        return epochTime;
    }

    @JsonProperty("EpochTime")
    public void setEpochTime(Integer epochTime) {
        this.epochTime = epochTime;
    }

    @JsonProperty("WeatherText")
    public String getWeatherText() {
        return weatherText;
    }

    @JsonProperty("WeatherText")
    public void setWeatherText(String weatherText) {
        this.weatherText = weatherText;
    }

    @JsonProperty("WeatherIcon")
    public Integer getWeatherIcon() {
        return weatherIcon;
    }

    @JsonProperty("WeatherIcon")
    public void setWeatherIcon(Integer weatherIcon) {
        this.weatherIcon = weatherIcon;
    }

    @JsonProperty("HasPrecipitation")
    public Boolean getHasPrecipitation() {
        return hasPrecipitation;
    }

    @JsonProperty("HasPrecipitation")
    public void setHasPrecipitation(Boolean hasPrecipitation) {
        this.hasPrecipitation = hasPrecipitation;
    }

    @JsonProperty("PrecipitationType")
    public Object getPrecipitationType() {
        return precipitationType;
    }

    @JsonProperty("PrecipitationType")
    public void setPrecipitationType(Object precipitationType) {
        this.precipitationType = precipitationType;
    }

    @JsonProperty("LocalSource")
    public void setLocalSource(LocalSource localSource){
        this.localSource = localSource;
    }

    @JsonProperty("LocalSource")
    public LocalSource getLocalSource(){
        return localSource;
    }

    @JsonProperty("IsDayTime")
    public Boolean getIsDayTime() {
        return isDayTime;
    }

    @JsonProperty("IsDayTime")
    public void setIsDayTime(Boolean isDayTime) {
        this.isDayTime = isDayTime;
    }

    @JsonProperty("Temperature")
    public CityTemperature getTemperature() {
        return temperature;
    }

    @JsonProperty("Temperature")
    public void setTemperature(CityTemperature temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("MobileLink")
    public String getMobileLink() {
        return mobileLink;
    }

    @JsonProperty("MobileLink")
    public void setMobileLink(String mobileLink) {
        this.mobileLink = mobileLink;
    }

    @JsonProperty("Link")
    public String getLink() {
        return link;
    }

    @JsonProperty("Link")
    public void setLink(String link) {
        this.link = link;
    }

}