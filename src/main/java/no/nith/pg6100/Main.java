package no.nith.pg6100;

import no.nith.pg6100.domain.Order;
import no.nith.pg6100.ejb.OrderRemote;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        props.setProperty("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
        props.setProperty("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
        props.setProperty("java.naming.factory.state", "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
        // optional.  Default er localhost
        //props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");
        // optional.  Default er uansett 3700.
        //props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
        //brukernavn..
        props.put(Context.SECURITY_PRINCIPAL, "testbruker");
        // password
        props.put(Context.SECURITY_CREDENTIALS, "minbruker");

        InitialContext context = new InitialContext(props);
        OrderRemote ejb = (OrderRemote) context.lookup(OrderRemote.class.getName());
        Order orderById = ejb.findOrderById(123L);
        System.out.println("orderById:" + orderById);
    }


}