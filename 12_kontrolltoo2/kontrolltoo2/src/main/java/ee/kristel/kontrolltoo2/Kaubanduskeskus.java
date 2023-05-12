package ee.kristel.kontrolltoo2;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Kaubanduskeskus {
    @Id
    private String nimetus;
    @ManyToMany
    private List<Pood> poed;
}
