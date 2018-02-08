package pl.strojecki;

import pl.strojecki.models.Line;
import pl.strojecki.models.dataBase.dao.PlotDao;
import pl.strojecki.models.dataBase.dao.PlotModel;
import pl.strojecki.models.dataBase.dao.impl.PlotModelImpl;
import pl.strojecki.utils.Config;
import pl.strojecki.utils.Cp1250FileReadToListOfString;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    private static String txtDbFile;
    private static String vectorPlotsAreasFile;
    private static PlotModel plotModel;
    private static PlotDao plotDao = new PlotModelImpl();



    public static void main(String[] args) {

        if(System.getProperty("os.name").contains("Windows")){
            txtDbFile = Config.WORKING_DIRECTORY_WIN + Config.DB_CP1250_WIN;
            vectorPlotsAreasFile = Config.WORKING_DIRECTORY_WIN + Config.DB_PLOTS_WECTOR_AREAS_WIN;
        } else if(System.getProperty("os.name").contains("Linux")){
            txtDbFile = Config.WORKING_DIRECTORY_LINUX + Config.DB_CP1250_WIN;
            vectorPlotsAreasFile = Config.WORKING_DIRECTORY_LINUX + Config.DB_PLOTS_WECTOR_AREAS_WIN;
        }

        List<String> list = new ArrayList<>();
        list = Cp1250FileReadToListOfString.read(vectorPlotsAreasFile);

        for (String string : list) {
            plotModel = new PlotModel(string);
            plotDao.savePlot(plotModel);
        }

    }
}