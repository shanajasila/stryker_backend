package com.example.System_G_Portal.service;

import com.example.System_G_Portal.model.dao.InstrumentSet;
import com.example.System_G_Portal.repository.InstrumentSetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstrumentSetServiceImpl implements InstrumentSetService {
    @Autowired
    private InstrumentSetRepo instrumentSetRepo;
    @Override
    public List<InstrumentSet> viewInstrumentSet() {
        return instrumentSetRepo.viewInstrumentSetById();
    }
}
