package ee.kristel.veeipood;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Tellimus {
    private int id;
    private Isik tellija;
    private List<Toode> tooted;
}
