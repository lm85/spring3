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

import org.springframework.data.jpa.repository.JpaRepository;

   

interface LoverRepository extends JpaRepository<Lover, Long> {

    public Lover findOne(int id);

    public void delete(int id);



}
