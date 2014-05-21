/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.adminModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author s03tapnd
 */
@Controller
@RequestMapping(value = "/demo")
public class demo {

    @RequestMapping(value = "/demo/{id}", method = RequestMethod.GET)
    public String index(ModelMap m, @PathVariable(value = "id") int id) {
        adminModel am=new adminModel();        
        m.put("admin",am.getRow(2));
        m.put("id", id);
        m.put("test", 1);
        return "demo";
    }
}
