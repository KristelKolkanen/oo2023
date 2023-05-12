package ee.kristel.kontrolltoo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PoodController {
    @Autowired
    PoodRepository poodRepository;
    //localhost:8080/lisa-pood?id=1&nimetus=Rimi&kylastajad=500&avamine=9&sulgemine=22
    @GetMapping("lisa-pood")
    public List<Pood> lisaPood(
        @RequestParam Long id,
        @RequestParam String nimetus,
        @RequestParam int kylastajad,
        @RequestParam int avamine,
        @RequestParam int sulgemine
    ) {
        poodRepository.save(new Pood(id, nimetus, kylastajad, avamine, sulgemine));
        return poodRepository.findAll();
    }
    //localhost:8080/leia-sulgemise-jargi?antudaeg=23
    @GetMapping("leia-sulgemise-jargi")
    public List<Pood> leiaSulgemiseJargi(
            @RequestParam int antudaeg
    ){
        List<Pood> poed = poodRepository.findAll();
        List<Pood> tagastatavadPoed = new ArrayList<>();
        for(int i = 0; i < poed.size(); i++){
            if(poed.get(i).getSulgemine() >= antudaeg){
                tagastatavadPoed.add(poed.get(i));
            }
        }
        return tagastatavadPoed;
    }
    //localhost:8080/lisa-kylastusi?id=1&poodId=1&kylastajad=500
    @GetMapping("lisa-kylastusi")
    public List<Pood> lisaKylastusi(
        @RequestParam Long id,
        @RequestParam Long poodId,
        @RequestParam int kylastajad
    ){
        Pood pood = poodRepository.findById(poodId).orElseThrow(() -> new RuntimeException("Pood not found"));
        pood.setKylastajad(kylastajad + 1);
        poodRepository.save(pood);
        return poodRepository.findAll();
    }
}
