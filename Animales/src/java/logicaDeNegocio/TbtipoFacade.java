/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaDeNegocio;

import database.Tbtipo;
import java.util.List;
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
    
    //Hay que crear este metodo
    //public List<T> findAllByTipo() {
      //  javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        //cq.select(cq.from(entityClass));
        //return getEntityManager().createQuery(cq).getResultList();
    //}
    
}
