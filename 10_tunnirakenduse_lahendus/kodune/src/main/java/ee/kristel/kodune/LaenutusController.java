package ee.kristel.kodune;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class LaenutusController {

    @Autowired
    KasutajaController kasutajaController;
    @Autowired
    RaamatController raamatController;

    List<Raamat> laenutatavadRaamatud = new ArrayList<>(Arrays.asList(
            new Raamat(5, "1984", "George Orwell"),
            new Raamat(6, "Eleven Minutes", "Paulo Coelho")
    ));

    Kasutaja laenutaja = new Kasutaja(5, 0005, new Date());
    List<Laenutus> laenutused = new ArrayList<>(Arrays.asList(
            new Laenutus(1, laenutaja, laenutatavadRaamatud)
    ));

    @PostMapping("lisa-laenutus")
    public List<Laenutus> lisaLaenutus(
            @RequestParam int id,
            @RequestParam int kasutajaIndex,
            @RequestParam int raamatuIndex) {
        Kasutaja laenutaja = kasutajaController.kasutajad.get(kasutajaIndex);

        Raamat laenatudRaamat = raamatController.raamatud.get(raamatuIndex);
        List<Raamat> laenatudRaamatud = new ArrayList<>(Arrays.asList(laenatudRaamat));

        laenutused.add(new Laenutus(id, laenutaja, laenatudRaamatud));
        return laenutused;
    }

    @GetMapping("laenutused")
    public List<Laenutus> saaLaenutused(){
        return laenutused;
    }
}
