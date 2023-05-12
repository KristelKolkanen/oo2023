package ee.kristel.kontrolltoo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class KaubanduskeskusController {
    @Autowired
    KaubanduskeskusRepository kaubanduskeskusRepository;
    @Autowired
    PoodRepository poodRepository;

    @GetMapping("lisa-keskus")
    public List<Kaubanduskeskus> lisaKeskus(
            @RequestParam List<Long> poodIds,
            @RequestParam String nimetus
    ) {
        List<Pood> poed = poodRepository.findAllById(poodIds);
        kaubanduskeskusRepository.save(new Kaubanduskeskus(nimetus, poed));
        return kaubanduskeskusRepository.findAll();
    }

    @GetMapping("leia-poed")
    public List<Pood> leiaPoed(
            @RequestParam int antudaeg,
            @RequestParam String nimetus
    ) {
        List<Kaubanduskeskus> keskused = kaubanduskeskusRepository.findByNimetus(nimetus);
        List<Pood> poed = poodRepository.findAll();
        List<Pood> tagastatavadPoed = new ArrayList<>();

        for (Pood pood : poed) {
            if (pood.getSulgemine() >= antudaeg && keskused.equals(nimetus)) {
                tagastatavadPoed.add(pood);
            }
        }
        return tagastatavadPoed;
    }
    //localhost:8080/leia-kylastused?nimetus=Kristiine
    @GetMapping("leia-kylastused")
    public int leiaKylastused(
            @RequestParam String nimetus
    ) {
        List<Kaubanduskeskus> keskused = kaubanduskeskusRepository.findByNimetus(nimetus);
        int kylastusteArv = 0;

        if (!keskused.isEmpty()) {
            for (Kaubanduskeskus kaubanduskeskus : keskused) {
                if (kaubanduskeskus.getNimetus().equals(nimetus)) {
                    List<Pood> poed = kaubanduskeskus.getPoed();
                    for (Pood pood : poed) {
                        kylastusteArv += pood.getKylastajad();
                    }
                    break;
                }
            }
        }
        return kylastusteArv;
    }
}
