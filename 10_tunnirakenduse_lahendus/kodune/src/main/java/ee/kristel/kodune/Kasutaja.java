package ee.kristel.kodune;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Kasutaja {
    private int id;
    private int kood;
    private Date registreerunud;
}
