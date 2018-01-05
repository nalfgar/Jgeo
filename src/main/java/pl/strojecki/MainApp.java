package pl.strojecki;

import pl.strojecki.utils.Cp1250FileReadToListOfString;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<String> data = Cp1250FileReadToListOfString.read("PrzBazDefault.txt");
        System.out.println(data.size());

//        for (String string : data) {
//            System.out.println(string);
//        }
    }

}
