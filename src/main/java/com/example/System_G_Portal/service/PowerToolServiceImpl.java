package com.example.System_G_Portal.service;

import com.example.System_G_Portal.model.dao.PowerToolSet;
import com.example.System_G_Portal.repository.PowerToolSetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PowerToolServiceImpl implements PowerToolService {
    @Autowired
    private PowerToolSetRepo powerToolSetRepo;
    @Override
    public List<PowerToolSet> viewPowerToolSet() {
        return powerToolSetRepo.viewPowerToolById();
    }
}
