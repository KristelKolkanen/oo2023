package ee.kristel.kontrolltoo2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Pood {
    @Id
    private Long Id;
    private String nimetus;
    private int kylastajad;
    private int avamine;
    private int sulgemine;
}

