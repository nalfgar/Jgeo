package pl.strojecki.utils;

import java.math.BigDecimal;

public class Config {
//    config MainApp
    public static final BigDecimal ZERO = new BigDecimal("0.00");

    public static final String WORKING_DIRECTORY_WIN = "c:\\Users\\Darek\\IdeaProjects\\Jgeo\\src\\main\\resources\\";
    public static final String WORKING_DIRECTORY_LINUX = "/home/darek/IdeaProjects/Jgeo/src/main/resources/";

//    PRZECIECIA_BAZ
    public static final String DB_CP1250_WIN = "PrzBaz.txt";

//    dzialka, pow, powRed, maxOdch
    public static final String DB_PLOTS_WECTOR_AREAS_WIN = "PolaWektor.txt";


//======================================================================================================================
//    config DAO
    public static final String PG_DRIVER = "org.postgresql.Driver";
    public static final String PG_LINK = "jdbc:postgresql://localhost:5432/testdb";
    public static final String PG_USER = "darek";
    public static final String PG_PASSWORD = "qqqwww123";


}