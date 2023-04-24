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
public class Single {
    private Date upload;
    private String songName;
    private String artist;
    private boolean isPublic;
    public String setName(String songName){
        this.songName = songName;
        return songName;
    }
}
