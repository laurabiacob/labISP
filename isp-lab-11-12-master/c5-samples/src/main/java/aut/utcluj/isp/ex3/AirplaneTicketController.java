package aut.utcluj.isp.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AirplaneTicketController {
    private List<AirplaneTicket> tickets;

    public AirplaneTicketController() {
        this.tickets = new ArrayList<>();
    }

    public void addNewTicket(final AirplaneTicket airplaneTicket) {
        tickets.add(airplaneTicket);
    }

    public List<AirplaneTicket> getTickets() {
        return new ArrayList<>(tickets);
    }

    public int getTotalNumberOfTickets() {
        return tickets.size();
    }

    public void removeTicketById(final String ticketId) {
        tickets.removeIf(ticket -> ticket.getId().equals(ticketId));
    }

    public void updateTicketDestination(final String ticketId, final String destination) {
        for (AirplaneTicket ticket : tickets) {
            if (ticket.getId().equals(ticketId)) {
                ticket.setDestination(destination);
                break;
            }
        }
    }

    public List<AirplaneTicket> filterTicketsBetweenMinMaxPrice(final Double minPrice, final Double maxPrice) {
        return tickets.stream()
                .filter(ticket -> ticket.getPrice() >= minPrice && ticket.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    public List<AirplaneTicket> filterTicketsWithPriceAndDestination(final Double minPrice, final Double maxPrice, final String destination) {
        return tickets.stream()
                .filter(ticket -> ticket.getPrice() >= minPrice && ticket.getPrice() <= maxPrice && ticket.getDestination().equals(destination))
                .collect(Collectors.toList());
    }
}