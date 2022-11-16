package pl.coderslab.chesstrainer.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
@Entity
@Table(name = "white_eco_stats")
@Data
public class WhiteGame {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Pattern(regexp = "[A-E]{1}-[00-99]{1}", message = "Musi być z przedziału A00-E99")
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
