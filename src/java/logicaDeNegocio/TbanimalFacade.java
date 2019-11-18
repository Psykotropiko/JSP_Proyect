/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaDeNegocio;

import database.Tbanimal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class TbanimalFacade extends AbstractFacade<Tbanimal> {

    @PersistenceContext(unitName = "AnimalesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbanimalFacade() {
        super(Tbanimal.class);
    }
    
}
