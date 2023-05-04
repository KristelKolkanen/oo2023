package ee.kristel.kodune;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class KasutajaController {
    List<Kasutaja> kasutajad = new ArrayList<>(Arrays.asList(
            new Kasutaja(1,0001, new Date()),
            new Kasutaja(2,0002, new Date()),
            new Kasutaja(3, 0003, new Date()),
            new Kasutaja(4, 0004, new Date())
    ));

    @GetMapping("kasutajad")
    public List<Kasutaja> saaKasutajad(){
        return kasutajad;
    }

    @DeleteMapping("kustuta-kasutaja/{index}")
    public String kustutaKasutaja(@PathVariable int index) {
        kasutajad.remove(index);
        return "Kasutaja kustutatud!";
    }

    @PostMapping("lisa-kasutaja")
    public List<Kasutaja> lisaKasutaja(
            @RequestParam int id,
            @RequestParam int kood){
        kasutajad.add(new Kasutaja(id, kood, new Date()));
        return kasutajad;
    }
}
