package ir.teherany.dto;

import ir.teherany.dto.annotationDTO.OnUpdate;
import ir.teherany.entity.enumuration.Gender;
import ir.teherany.entity.enumuration.Nationality;
import ir.teherany.entity.enumuration.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    @NotNull(groups = OnUpdate.class, message = "id")
    private Long id;

    @NotNull
    @NotBlank
    private String firstName;

    @NotNull
    @NotBlank
    private String middleName;

    @NotNull
    @NotBlank
    private String lastName;

    @NotNull
    @NotBlank
    private Integer age;

    @NotNull
    @NotBlank
    private Nationality nationality;

    @NotNull
    @NotBlank
    private String avatar;

    @NotNull
    @NotBlank
    private Gender gender;

    @NotNull
    @NotBlank
    private Type type;

}
