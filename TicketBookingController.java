import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rest.springboot.entities.Ticket;
import com.rest.springboot.service.TicketBookingService;

@RestController
@RequestMapping(value="/api/tickets")
public class TicketBookingController {

    @AutoWired
    private TicketBookingService TicketBookingService;

    @PostMapping(value="/create")//http://localhost:8080/api/ticket/create
    public Ticket createTicket(@RequestBody Ticket ticket){
        return TicketBookingService.createTicket(ticket);
    }

    @GetMapping(value="/ticket/(ticketId)")//http://localhost:8080/api/tickets/ticket/1

    public Ticket getTicketById(@pathVariable("ticketId")Integer ticketId){
        return TicketBookingService.getTicketById(ticketId);
    }

     @GetMapping(value="/ticket/alltickets")
    public Iterator<Ticket> getAllBookedTickets(){
        return ticketBookingService.getAllBookedTickets();
    }  

    @DeleteMapping(value="/ticket/{ticketId}")
    public void deleteTicket(@pathVariable("ticketId")Integer ticketId){
        ticketBookingService.deleteTicket(ticketId);
    }
    
    @PutMapping(value="/ticket/{ticketId}")
    public void updateTicket(@pathVariable("ticketId")Integer ticketId,@pathVariable("newEmail")String newEmail){
        return ticketBookingService.updateTicket(ticketId,newEmail);
    }
}