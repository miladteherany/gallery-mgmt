package ir.teherany.entity;

import ir.teherany.gallery.entity.enumuration.Nationality;
import ir.teherany.gallery.entity.enumuration.Type;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "middleName")
    private String middleName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "age")
    private Integer age;

    @Column(name = "nationalCode")
    private String nationalCode;

    @Column(name = "nationality")
    private Nationality nationality;

    @Column(name = "avatar")
    private String avatar;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private Type type;
}
