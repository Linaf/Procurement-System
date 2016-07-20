/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.domain;



/**
 *
 * @author Yoni
 */
public enum RequestStatus {
    requested, //  requested by the Org Unit
    approved, // approved for Proc Officer , Now Supplier can look at them
    pending, // Item in requesition Process
    declined, // Requested But not approved and declined, Item Needs to be reequested again
    purchased // Item Finished the Pending Process... Item Requesitioned/Recieved
            
    
}
