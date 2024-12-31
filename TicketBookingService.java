package com.rest.spring.boot.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.stereotype.Service;
import com.rest.springboot.dao.TicketBookingDAO;
import com.rest.springboot.entities.Ticket;

public class TicketBookingService {
    private TicketBookingDAO TicketBookingDAO;

    public Ticket createTicket(Ticket ticket){
        return ticketBookingDAO.findById(ticketId).get();
    }
    public Ticket getTicketById(Ticket ticket){
        return ticketBookingDAO.findById(ticketId).get();
    }
    public Iterator<Ticket> getAllBookedTickets(){
        return ticketBookingDAO.findAll();
    }
    public void deleteTicket(Integer ticketId){
        ticketBookingDAO.deleteById(ticketId);
    }
    public Ticket updateTicket(Integer ticketId, String newEmail){
        Ticket ticketFromDb = ticketBookingDAO.findById(ticketId).get();
        ticketFromDb.setEmail(newEmail);
        Ticket updateTicket = ticketBookingDAO.save(ticketFromDb);
        return updateTicket;
    }

}