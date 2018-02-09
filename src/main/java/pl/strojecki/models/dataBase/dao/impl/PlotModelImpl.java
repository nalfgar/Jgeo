package pl.strojecki.models.dataBase.dao.impl;

import pl.strojecki.models.dataBase.DataBaseConnector;
import pl.strojecki.models.dataBase.dao.PlotDao;
import pl.strojecki.models.dataBase.dao.PlotModel;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PlotModelImpl implements PlotDao{
    private DataBaseConnector dataBaseConnector = DataBaseConnector.getInstance();

    @Override
    public void savePlot(PlotModel plotModel) {
        PreparedStatement preparedStatement = dataBaseConnector.createStatement("INSERT INTO plots(id, pew, pew2, pew3) VALUES(?,?,?,?)");

        try {
            preparedStatement.setString(1, plotModel.getNumber());
            preparedStatement.setBigDecimal (2, plotModel.getVectorArea());
            preparedStatement.setBigDecimal(3, plotModel.getVectorReducedArea());
            preparedStatement.setBigDecimal(4, plotModel.getVectorDeviationArea());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
