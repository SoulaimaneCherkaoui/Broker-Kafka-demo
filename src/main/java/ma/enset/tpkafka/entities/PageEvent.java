package ma.enset.tpkafka.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@Data
@AllArgsConstructor @NoArgsConstructor @ToString
public class PageEvent {
private String name; //nom page
    private String user;
    private Date date;
    private long duration;
}
