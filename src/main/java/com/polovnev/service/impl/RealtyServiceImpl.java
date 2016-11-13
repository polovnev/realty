package com.polovnev.service.impl;

import com.polovnev.dao.RealtyDao;
import com.polovnev.model.Realty;
import com.polovnev.service.RealtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RealtyServiceImpl implements RealtyService {

    @Autowired
    private RealtyDao realtyDao;

    @Override
    public List<Realty> getRealtiesByUserId(int userId) {
        return realtyDao.getRealtiesByUserId(userId);
    }

    @Override
    public List<Realty> getAllRealties() {
        return realtyDao.getAllRealties();
    }

    @Override
    public Realty getRealtyById(int id) {
        return realtyDao.getRealtyById(id);
    }
}
