package pl.strojecki.models.dataBase.dao;

import pl.strojecki.models.Line;

import java.math.BigDecimal;

public class PlotModel {
    private String number;
    private String vectorArea;
    private String vectorReducedArea;
    private String vectorDeviationArea;

    public PlotModel(String string) {
        String[] splittedLine = string.split("\\s+");
        if (splittedLine.length == 5){
            number = splittedLine[1];
            vectorArea = splittedLine[2];
            vectorReducedArea = splittedLine[3];
            vectorDeviationArea = splittedLine[4];
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

    public String getVectorArea() {
        return vectorArea;
    }

    public void setVectorArea(String vectorArea) {
        this.vectorArea = vectorArea;
    }

    public String getVectorReducedArea() {
        return vectorReducedArea;
    }

    public void setVectorReducedArea(String vectorReducedArea) {
        this.vectorReducedArea = vectorReducedArea;
    }

    public String getVectorDeviationArea() {
        return vectorDeviationArea;
    }

    public void setVectorDeviationArea(String vectorDeviationArea) {
        this.vectorDeviationArea = vectorDeviationArea;
    }

    @Override
    public String toString() {
        return "PlotModel{" +
                "number='" + number + '\'' +
                ", vectorArea='" + vectorArea + '\'' +
                ", vectorReducedArea='" + vectorReducedArea + '\'' +
                ", vectorDeviationArea='" + vectorDeviationArea + '\'' +
                '}';
    }
}
