/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author ADITYA
 */
@ManagedBean(name = "welcome")
@SessionScoped
public class Welcome {
public String name = "Hi from faces";

public String getName() {
return name;
}
    /**
     * Creates a new instance of Welcome
     */
    public Welcome() {
    }
    
}
