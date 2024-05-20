package aut.utcluj.isp.ex4;

/**
 * @author stefan
 */
public class AirplaneTicket {
    private String id;
    private Double price;
    private String destination;
    private TicketStatus status;
    private String customerId;

    public AirplaneTicket(String id, Double price, String destination) {
        this.id = id;
        this.price = price;
        this.destination = destination;
        this.status = TicketStatus.NEW;
        this.customerId = null;
    }
    public String getId() {
        return id;
    }
    public Double getPrice() {
        return price;
    }
    public String getDestination() {
        return destination;
    }
    public TicketStatus getStatus() {
        return status;
    }
    public void setStatus(TicketStatus status) {
        this.status = status;
    }
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

}
