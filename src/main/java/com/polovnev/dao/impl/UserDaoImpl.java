package com.polovnev.dao.impl;


import com.polovnev.dao.UserDao;
import com.polovnev.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UserDaoImpl extends AbstractDaoImpl implements UserDao {

    @Override
    public List<User> getUsers() {
        return getSession().createQuery("from User").list();
    }
}
