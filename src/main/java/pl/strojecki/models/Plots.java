package pl.strojecki.models;

import pl.strojecki.utils.Config;

import java.util.ArrayList;
import java.util.List;

public class Plots {
    private List<Plot> plots = new ArrayList<>();

    public void update(Plot plot){
        if (!plot.getPlotArea().equals(Config.ZERO) && !plots.contains(plot)){
            plots.add(plot);
        }
    }

    public void print(){
        for (Plot plot : plots) {
            System.out.println(plot);
        }
    }

    public int size(){
        return plots.size();
    }
}
