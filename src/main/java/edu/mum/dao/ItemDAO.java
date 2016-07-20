/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.dao;

import edu.mum.domain.Item;
import java.util.List;

/**
 *
 * @author lina
 */
public interface ItemDAO extends GenericDAO<Item> {
   
//    public void saveItem(Item i);
   List<Item> find(Item item);
}
