package pl.strojecki.models;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Data
@ToString(exclude = "matcher")
public class Line {
    private static Pattern pattern = Pattern.compile("([\\w-/\\.]+)\\s+([\\w+-Ł]+)\\s+(-?\\d+\\.\\d+)");
    private Matcher matcher;

    private String number;
    private String ground;
    private BigDecimal area;

    public Line(String line) {
        matcher = pattern.matcher(line);
        if (matcher.matches()){
            number = matcher.group(1);
            ground = matcher.group(2);
            area = new BigDecimal(matcher.group(3));
        }
    }

    public String getNumber() {
        return number;
    }

    public String getGround() {
        return ground;
    }

    public BigDecimal getArea() {
        return area;
    }
}
