package pl.strojecki.models.dataBase.dao;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class PlotModel {
    private String number;
    private BigDecimal vectorArea;
    private BigDecimal vectorReducedArea;
    private BigDecimal vectorDeviationArea;

    public PlotModel(String string) {
        String[] splittedLine = string.split("\\s+");
        if (splittedLine.length == 5){
            number = splittedLine[1];
            vectorArea = new BigDecimal(splittedLine[2]);
            vectorReducedArea = new BigDecimal(splittedLine[3]);
            vectorDeviationArea = new BigDecimal(splittedLine[4]);
        } else {
            throw new IllegalArgumentException("bad line: " + string);
        }

    }

}
