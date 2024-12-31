import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    @Id
    @Column(name="ticket_id")
    private Integer ticket_id;

    @Column(name="passenger_name",nullable=false)
    private String passenger_Name;

    @Column(name="source_station")
    private String sourceStation;
   
    @Column(name="dest_station")
    private String destStation;
    
    @Column(name="email")
    private String email;

    
}