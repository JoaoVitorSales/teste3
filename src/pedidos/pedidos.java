package pedidos;

import entities.orderStatus;

import java.util.Date;

public class pedidos {
    private Integer id;
    private Date moment;
    private orderStatus status;

    public pedidos(){
    }

    public pedidos(Integer id, Date moment, orderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public orderStatus getStatus() {
        return status;
    }

    public void setStatus(orderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "pedidos{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
