package ir.teherany.entity;

import ir.teherany.entity.enumuration.Genre;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "artwork")
@Data
public class Artwork {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "date")
    private Date date;

    @Column(name = "price")
    private Double price;

    @Column(name = "description")
    private String desc;

    @Enumerated(EnumType.STRING)
    @Column(name = "genre")
    private Genre genre;
}
