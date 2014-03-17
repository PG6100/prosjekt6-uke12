package no.nith.pg6100.ejb;

import no.nith.pg6100.domain.Order;

import javax.ejb.Remote;

@Remote
public interface OrderRemote {

    public Order findOrderById(Long id);

}
