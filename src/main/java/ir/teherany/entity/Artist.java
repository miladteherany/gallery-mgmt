package ir.teherany.entity;

import ir.teherany.entity.enumuration.Nationality;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "artist")
@Data
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "fullName")
    private String fullName;

    @Enumerated(EnumType.STRING)
    @Column(name = "nationality")
    private Nationality nationality;


}
