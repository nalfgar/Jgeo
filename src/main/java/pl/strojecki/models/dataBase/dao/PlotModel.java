package pl.strojecki.models.dataBase.dao;

import pl.strojecki.models.Line;

import java.math.BigDecimal;

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getVectorArea() {
        return vectorArea;
    }

    public void setVectorArea(BigDecimal vectorArea) {
        this.vectorArea = vectorArea;
    }

    public BigDecimal getVectorReducedArea() {
        return vectorReducedArea;
    }

    public void setVectorReducedArea(BigDecimal vectorReducedArea) {
        this.vectorReducedArea = vectorReducedArea;
    }

    public BigDecimal getVectorDeviationArea() {
        return vectorDeviationArea;
    }

    public void setVectorDeviationArea(BigDecimal vectorDeviationArea) {
        this.vectorDeviationArea = vectorDeviationArea;
    }

    @Override
    public String toString() {
        return "PlotModel{" +
                "number='" + number + '\'' +
                ", vectorArea=" + vectorArea +
                ", vectorReducedArea=" + vectorReducedArea +
                ", vectorDeviationArea=" + vectorDeviationArea +
                '}';
    }
}
