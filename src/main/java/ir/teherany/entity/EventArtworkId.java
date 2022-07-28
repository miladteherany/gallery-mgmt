package ir.teherany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventArtworkId implements Serializable {
    @Column(name = "eventId")
    private Long eventId;

    @Column(name = "artworkId")
    private Long artworkId;
}
