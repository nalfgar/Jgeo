package pl.strojecki.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Cp1250FileReadToListOfString {

    public static List<String> read(String file) {
        List<String> readData = new ArrayList<>();
        String line = null;
        BufferedReader bufferedReader;

        try {
            bufferedReader = new BufferedReader(
                                new InputStreamReader(
                                new FileInputStream(file), "CP1250"));

            while ((line = bufferedReader.readLine()) != null) {
                if (!line.equals("")) readData.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return readData;
    }
}