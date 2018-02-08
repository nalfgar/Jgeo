package pl.strojecki;

import pl.strojecki.utils.Config;
import pl.strojecki.utils.Cp1250FileReadToListOfString;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list = Cp1250FileReadToListOfString.read(Config.WORKING_DIRECTORY_LINUX + Config.PRZECIECIA_BAZ_CP1250_WIN);
        for (String string : list) {
            System.out.println(string);
        }
    }
}