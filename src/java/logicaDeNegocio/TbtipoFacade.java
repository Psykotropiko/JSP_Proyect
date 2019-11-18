/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaDeNegocio;

import database.Tbtipo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class TbtipoFacade extends AbstractFacade<Tbtipo> {

    @PersistenceContext(unitName = "AnimalesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbtipoFacade() {
        super(Tbtipo.class);
    }
    
}
