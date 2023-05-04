package ee.kristel.kodune;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class RaamatController {
    List<Raamat> raamatud = new ArrayList<>(Arrays.asList(
            new Raamat(1, "The Alchemist", "Paulo Coelho"),
            new Raamat(2, "Lord of the Rings", "J.R.R Tolkien"),
            new Raamat(3, "Pinocchio", "Carlo Collodi"),
            new Raamat(4, "Animal Farm", "George Orwell")
    ));

    @GetMapping("raamatud")
    public List<Raamat> saaRaamatud() {
        return raamatud;
    }

    @DeleteMapping("kustuta-raamat/{index}")
    public String kustutaRaamat(@PathVariable int index) {
        raamatud.remove(index);
        return "Raamat kustutatud!";
    }

    @PostMapping("lisa-raamat")
    public List<Raamat> lisaRaamat(
            @RequestParam int id,
            @RequestParam String nimi,
            @RequestParam String autor) {
        raamatud.add(new Raamat(id, nimi, autor));
        return raamatud;
    }

}
