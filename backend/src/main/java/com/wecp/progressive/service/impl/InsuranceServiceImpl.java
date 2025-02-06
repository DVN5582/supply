package com.wecp.progressive.service.impl;

<<<<<<< HEAD
import com.wecp.progressive.entity.Insurance;
import com.wecp.progressive.repository.InsuranceRepository;
import com.wecp.progressive.service.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class InsuranceServiceImpl implements InsuranceService {

    @Autowired
    InsuranceRepository insuranceRepository;

    @Override
    public List<Insurance> getAllInsurances() throws SQLException {
        return insuranceRepository.findAll();
    }

    @Override
    public int addInsurance(Insurance insurance) throws SQLException {
        return insuranceRepository.save(insurance).getInsuranceId();
    }

    @Override
    public Insurance getInsuranceById(int insuranceId) throws SQLException {
        return insuranceRepository.findByInsuranceId(insuranceId);
    }

    @Override
    public void updateInsurance(Insurance insurance) throws SQLException {
        insuranceRepository.save(insurance);
    }

    @Override
    public void deleteInsurance(int insuranceId) throws SQLException {
        insuranceRepository.deleteById(insuranceId);
    }
=======
import java.util.List;

import com.wecp.progressive.entity.Insurance;
import com.wecp.progressive.service.InsuranceService;

public class InsuranceServiceImpl implements InsuranceService  {
    
    @Override
    public List<Insurance> getAllInsurances() {
        // TODO Auto-generated method stub
        return List.of();
    }

    @Override
    public int addInsurance(Insurance insurance) {
        // TODO Auto-generated method stub
        return -1;
    }

    @Override
    public Insurance getInsuranceById(int insuranceId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateInsurance(Insurance insurance) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteInsurance(int insuranceId) {
        // TODO Auto-generated method stub
    }

>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
}