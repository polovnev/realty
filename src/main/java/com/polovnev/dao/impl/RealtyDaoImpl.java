package com.polovnev.dao.impl;

import com.polovnev.dao.RealtyDao;
import com.polovnev.model.Realty;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class RealtyDaoImpl extends AbstractDaoImpl implements RealtyDao {

    @Override
    public List<Realty> getRealtiesByUserId(int userId) {
        return getSession().createQuery("from Realty where user = " + userId).list();
    }

    @Override
    public List<Realty> getAllRealties() {
        return getSession().createQuery("from Realty").list();
    }


    @Override
    public Realty getRealtyById(int id) {
        return getSession().get(Realty.class, id);

    }

}
