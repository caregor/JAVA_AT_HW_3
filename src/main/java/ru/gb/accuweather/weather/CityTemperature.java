package ru.gb.accuweather.weather;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.gb.accuweather.location.Imperial;
import ru.gb.accuweather.location.Metric;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Metric",
        "Imperial"
})
public class CityTemperature {

    @JsonProperty("Metric")
    private Metric metric;
    @JsonProperty("Imperial")
    private Imperial imperial;

    @JsonProperty("Metric")
    public Metric getMetric() {
        return metric;
    }

    @JsonProperty("Metric")
    public void setMetric(Metric metric) {
        this.metric = metric;
    }

    @JsonProperty("Imperial")
    public Imperial getImperial() {
        return imperial;
    }

    @JsonProperty("Imperial")
    public void setImperial(Imperial imperial) {
        this.imperial = imperial;
    }

}
