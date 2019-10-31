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

import java.util.List;
public interface LoverService {
    public abstract Lover getLoverById(int id);
    public abstract void saveLover(Lover lover);
    public abstract void updateLover(Lover lover);
    public abstract void deleteLover(int id);
    public abstract List<Lover> getAllLovers();
}
