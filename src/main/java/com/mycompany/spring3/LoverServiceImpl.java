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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
/* https://www.baeldung.com/spring-component-repository-service*/
/*
@Component is a generic stereotype for any Spring-managed component
@Service annotates classes at the service layer
@Repository annotates classes at the persistence layer, which will act as a database repositor
*/
@Component
public class LoverServiceImpl implements LoverService {

  @Autowired
    private LoverRepository loverRepository;
    
    @Transactional
    public Lover getLoverById(int id)
    {
        return loverRepository.findOne(id);
    }
    @Transactional
    public void saveLover(Lover lover)
    {
        loverRepository.save(lover);
    }
    @Transactional
    public void updateLover(Lover lover)
    {
        loverRepository.save(lover);       
    }
    @Transactional
    public void deleteLover(int id)
    {
        loverRepository.delete(id);
    }
    @Transactional
    public List<Lover> getAllLovers()
    {
       return loverRepository.findAll();
    }  
}
