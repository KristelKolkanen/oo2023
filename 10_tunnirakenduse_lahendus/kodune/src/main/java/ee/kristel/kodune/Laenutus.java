package ee.kristel.kodune;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Laenutus {
    private int id;
    private Kasutaja laenutaja;
    private List<Raamat> raamatud;
}
