package programa;

import entities.orderStatus;
import pedidos.pedidos;

import java.util.Date;

public class programa {
    public static void main(String[] args){
        pedidos order = new pedidos(1080, new Date(), orderStatus.PENDING_PAYMENT);

        System.out.println(order);

        orderStatus pd1 = orderStatus.DELIVERED;
        orderStatus pd2 = orderStatus.valueOf("SHIPPED");
        orderStatus pd3 = orderStatus.PROCESSING;
        orderStatus pd4 = orderStatus.SHIPPED;
        System.out.println(pd1);
        System.out.println(pd2);
        System.out.println(pd3);
        System.out.println(pd4);
    }
}
