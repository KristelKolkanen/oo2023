package ee.kristel.kodune;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class SingleListController {

    List<Single> singles = new ArrayList<>(Arrays.asList(
            new Single(new Date(), "Mad","Khai", true),
            new Single(new Date(), "Echo", "Khai", true),
            new Single(new Date(), "Bad Intentions", "Khai", false),
            new Single(new Date(), "Bravest", "Khai", true),
            new Single(new Date(), "Drive","Khai", false)
    ));

    @GetMapping("singles")
    public List<Single> getSingles() {
        return singles;
    }
    @DeleteMapping("delete-single/{index}")
    public String deleteSingle(@PathVariable int index) {
        singles.remove(index);
        return "Single deleted!";
    }
    @PostMapping("add-single")
    public List<Single> addSingle(
            @RequestParam String name,
            @RequestParam String artist,
            @RequestParam Boolean isPublic) {
        singles.add(new Single(new Date(), name, artist, isPublic));
        return singles;
    }

}
