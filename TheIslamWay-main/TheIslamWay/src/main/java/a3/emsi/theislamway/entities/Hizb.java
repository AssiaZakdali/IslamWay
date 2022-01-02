package a3.emsi.theislamway.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hizb {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long No;
    private boolean lu;
    @ManyToOne
    private User user;
}
