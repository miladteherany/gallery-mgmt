package ir.teherany.dto;

import ir.teherany.common.BaseDto;
import ir.teherany.dto.annotationDTO.OnUpdate;
import ir.teherany.entity.enumuration.Gender;
import ir.teherany.entity.enumuration.Nationality;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArtistDTO extends BaseDto {
    @NotNull(groups = OnUpdate.class, message = "id")
    private Long id;

    @NotNull
    @NotBlank
    private String fullName;

    @NotNull
    @NotBlank
    private Nationality nationalCode;

    @NotNull
    @NotBlank
    private Gender gender;

}
