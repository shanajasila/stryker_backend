package com.example.System_G_Portal.service;

import com.example.System_G_Portal.model.dao.Consumables;
import com.example.System_G_Portal.repository.ConsumableRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumablesServiceImpl implements ConsumableService {
    @Autowired
    private ConsumableRepo consumableRepo;
    @Override
    public List<Consumables> viewConsumables() {
        return consumableRepo.viewConsumablesById();
    }
}
