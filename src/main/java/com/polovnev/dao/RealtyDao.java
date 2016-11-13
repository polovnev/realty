package com.polovnev.dao;


import com.polovnev.model.Realty;

import java.util.List;

public interface RealtyDao {

    List<Realty> getRealtiesByUserId(int userId);

    List<Realty> getAllRealties();

    Realty getRealtyById(int id);
}
