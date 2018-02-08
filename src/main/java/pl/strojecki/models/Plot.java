package pl.strojecki.models;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


@Data
@ToString
public class Plot {
    private String number;
    private BigDecimal plotArea;
    private Map<String, BigDecimal> ground = new HashMap<>();

    public Plot(Line line) {
        number = line.getNumber();
        plotArea = line.getArea();
        ground.put(line.getGround(), line.getArea());
    }
}
