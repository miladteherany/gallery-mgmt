package ir.teherany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventArtwork {

    @EmbeddedId
    private EventArtworkId eventArtworkId;

    @ManyToOne
    @JoinColumn(name = "eventId", referencedColumnName = "id", insertable = false, updatable = false)
    private Event event;

    @ManyToOne
    @JoinColumn(name = "artworkId", referencedColumnName = "id", insertable = false, updatable = false)
    private Artwork artwork;
}
