package com.polovnev.web;

import com.polovnev.dao.RealtyDao;
import com.polovnev.dao.UserDao;
import com.polovnev.model.Realty;
import com.polovnev.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/realty")
public class RealtyController {

    @Autowired
    private RealtyDao realtyDao;

    @RequestMapping(method = RequestMethod.GET)
    public String getRealties(ModelMap model, @RequestParam("id") int id) {
        List<Realty> realties = realtyDao.getRealtiesByUserId(id);
        model.addAttribute("realties", realties);
        return "realties";
    }
}