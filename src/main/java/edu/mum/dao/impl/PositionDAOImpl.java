/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.dao.impl;

import org.springframework.stereotype.Repository;
import edu.mum.dao.PositionDAO;
import edu.mum.domain.Position;

/**
 *
 * @author Lina
 */

@SuppressWarnings("unchecked")
@Repository
public class PositionDAOImpl extends GenericDAOImpl<Position> implements PositionDAO{

    public PositionDAOImpl() {
       super.setDaoType(Position.class);
	
    }


    
}
