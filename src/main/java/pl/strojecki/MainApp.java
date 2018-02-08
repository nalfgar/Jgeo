package pl.strojecki;

import pl.strojecki.models.Line;
import pl.strojecki.models.Plot;
import pl.strojecki.models.Plots;
import pl.strojecki.utils.Config;
import pl.strojecki.utils.Cp1250FileReadToListOfString;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    private static Plots plots = new Plots();
    private static String workDirectory;
    private static String txtDbName;
    private static String txtDbFile;

    public static void main(String[] args) {

        if(System.getProperty("os.name").contains("Windows")){
            txtDbFile = Config.WORKING_DIRECTORY_WIN + Config.DB_CP1250_WIN;
        } else if(System.getProperty("os.name").contains("Linux")){
            txtDbFile = Config.WORKING_DIRECTORY_LINUX + Config.DB_CP1250_WIN;
        }

        List<String> list = new ArrayList<>();
        list = Cp1250FileReadToListOfString.read(txtDbFile);
        for (String string : list) {
            plots.update(new Plot(new Line(string)));
        }

        System.out.println(plots.size());
        plots.print();
    }
}