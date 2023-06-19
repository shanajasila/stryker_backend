package com.example.System_G_Portal.service;

import com.example.System_G_Portal.model.dao.SpecialityAttachments;
import com.example.System_G_Portal.repository.SpecialityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialityServiceImpl implements SpecialityService {

    @Autowired
    private SpecialityRepo specialityRepo;
    @Override
    public List<SpecialityAttachments> viewSpeciality() {
        return specialityRepo.viewSpecialityById();
    }
}
