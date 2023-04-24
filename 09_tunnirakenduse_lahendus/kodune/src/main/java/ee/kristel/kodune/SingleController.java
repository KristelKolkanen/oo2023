package ee.kristel.kodune;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class SingleController {
    Single single = new Single(new Date(), "Gravity", "Khai", false);

    @GetMapping("single")
    public Single getSingle() {
        return single;
    }
    @GetMapping("change-name/{name}")
    public Single changeName(@PathVariable String name) {
        single.setName( name );
        return single;
    }

}
