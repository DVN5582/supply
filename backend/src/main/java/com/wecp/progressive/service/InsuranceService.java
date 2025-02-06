package com.wecp.progressive.service;

import com.wecp.progressive.entity.Insurance;

<<<<<<< HEAD
import java.sql.SQLException;
=======
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
import java.util.List;

public interface InsuranceService {

<<<<<<< HEAD
    List<Insurance> getAllInsurances() throws SQLException;

    int addInsurance(Insurance insurance) throws SQLException;

    Insurance getInsuranceById(int insuranceId) throws SQLException;

    void updateInsurance(Insurance insurance) throws SQLException;

    void deleteInsurance(int insuranceId) throws SQLException;
=======
    List<Insurance> getAllInsurances();

    int addInsurance(Insurance insurance);

    Insurance getInsuranceById(int insuranceId);

    void updateInsurance(Insurance insurance);

    void deleteInsurance(int insuranceId);
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
}
