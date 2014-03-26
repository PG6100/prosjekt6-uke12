package no.nith.pg6100.ejb;


import no.nith.pg6100.domain.Order;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@RolesAllowed("user")
@DeclareRoles({"user"})
public class OrderEJB implements OrderRemote {

    @PersistenceContext(unitName = "PG6100")
    private EntityManager em;

    public Order findOrderById(Long id) {
        return null;
    }

    public void deleteOrder(Order order) {
        em.remove(order);
    }
}
