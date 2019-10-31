/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring3;

/**
 *
 * @author masic
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity //model dle MVC odpovĂ­dajĂ­cĂ­ entitÄ› v db
class Lover {

    private @Id @GeneratedValue Long id;
    private int age = 0;
    private String name = "";
    private int boobs = 5;

    public Lover(int age, String name, int boobs) throws Exception {

        if (age < 15) {
            throw new Exception("You are pedofil!");
        }
        if (name.length() < 1) {
            throw new Exception("Name is too short");
        }
        if (!(boobs >= 0 && boobs <= 5)) {
            throw new Exception("Impossible boobs!");
        }

        this.age = age;
        this.name = name;
        this.boobs = boobs;

    }

    public Lover() {
    }

    @Override
    public String toString() {

        return "Age:" + age + ", Name:" + name + ", Boobs:" + boobs;
    }
}