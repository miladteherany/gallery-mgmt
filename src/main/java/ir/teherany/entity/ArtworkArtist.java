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
public class ArtworkArtist {
    @EmbeddedId
    private ArtworkArtistId artworkArtistId;

    @ManyToOne
    @JoinColumn(name = "artworkId", referencedColumnName = "id", insertable = false, updatable = false)
    private Artwork artwork;

    @ManyToOne
    @JoinColumn(name = "artistId", referencedColumnName = "id", insertable = false, updatable = false)
    private Artist artist;
}
