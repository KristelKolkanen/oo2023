package ee.kristel.veeipood;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class TellimusController {
    List<Toode> tellimuseTooted = new ArrayList<>(Arrays.asList(
            new Toode(3, "Sprite", 1.7),
            new Toode(3, "Sprite", 1.7)
    ));
    List<Toode> tellimuse2Tooted = new ArrayList<>(Arrays.asList(
            new Toode(3, "Sprite", 1.7),
            new Toode(4, "Vichy", 2.0),
            new Toode(5, "Vitamin well", 2.5)
    ));
    Isik tellija = new Isik(1, "Ees", "Pere", new Date());
    List<Tellimus> tellimused = new ArrayList<>(Arrays.asList(
            new Tellimus(1, tellija, tellimuseTooted),
            new Tellimus(2, tellija, tellimuse2Tooted)
    ));

    // GET    api.err.ee/tellimused
    // GET    localhost:8080/tellimused
    @GetMapping("tellimused")
    public List<Tellimus> saaTellimused() {
        return tellimused;
    }

    // DELETE localhost:8080/kustuta-tellimus/1
    @DeleteMapping("kustuta-tellimus/{index}")
    public String kustutaTellimus(@PathVariable int index) {
        tellimused.remove(index);
        return "Tellimus kustutatud!";
    }

    @Autowired
    ToodeController toodeController;
    @Autowired
    IsikController isikController;
    // POST localhost:8080/lisa-tellimus
    @PostMapping("lisa-tellimus")
    public List<Tellimus> lisaTellimus(
            @RequestParam int id,
            @RequestParam int tellijaIndex,
            @RequestParam int tooteIndex) {
        Isik tellija = isikController.isikud.get(tellijaIndex);

        Toode tellitudToode = toodeController.tooted.get(tooteIndex);
        List<Toode> tellitudTooted = new ArrayList<>(Arrays.asList(tellitudToode));

        tellimused.add(new Tellimus(id, tellija, tellitudTooted));
        return tellimused;
    }

    @PostMapping("lisa-tellimus2")
    public List<Tellimus> lisaTellimus2(
            @RequestParam int id,
            @RequestParam int tellijaIndex,
            @RequestParam int[] tooteIndexid) {
        Isik tellija = isikController.isikud.get(tellijaIndex);

        List<Toode> tellitudTooted = new ArrayList<>();
        for(int i: tooteIndexid){
            Toode toode = toodeController.tooted.get(i);
            tellitudTooted.add(toode);
        }

        tellimused.add(new Tellimus(id, tellija, tellitudTooted));
        return tellimused;
    }

    @PostMapping("lisa-tellimus3")
    public List<Tellimus> lisaTellimus3(
            @RequestBody Tellimus tellimus) {
        tellimused.add(tellimus);
        return tellimused;
    }

}
