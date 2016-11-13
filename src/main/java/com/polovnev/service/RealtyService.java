package com.polovnev.service;

import com.polovnev.model.Realty;

import java.util.List;

public interface RealtyService {

    List<Realty> getRealtiesByUserId(int userId);

    List<Realty> getAllRealties();

    Realty getRealtyById(int id);
}
