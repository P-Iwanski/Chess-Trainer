package pl.coderslab.chesstrainer.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "black_eco_stats")
@Data
public class BlackGame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(max = 3)
    private String eco;
    private Integer quantityOfSuccessfulGames;
    private Integer quantityOfFailedGames;
    @ManyToOne
    private User user;
    private LocalDate createdAt;
    @PrePersist
    public void created(){
        LocalDate date = LocalDate.now();
        this.setCreatedAt(date);
    }
}
