/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vega.service.info.controller;

import com.vega.service.info.domain.Info;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 *
 * @author ronaldo.alberton
 */
@RequestMapping(value = "/info")
public interface InfoController{      
    
    @RequestMapping(value = "single", method = RequestMethod.GET)
    Info getSingleInfo();
    
    @RequestMapping(value = "list", method = RequestMethod.GET)
    List<Info> getListInfo();

    @RequestMapping(value = "test", method = RequestMethod.GET)
    String getTest();
        

}
