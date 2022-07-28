package ir.teherany.dto;


import ir.teherany.common.BaseDto;
import ir.teherany.dto.annotationDTO.OnUpdate;
import ir.teherany.entity.enumuration.Gender;
import ir.teherany.entity.enumuration.Genre;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class ArtWorkDTO extends BaseDto {
    @NotNull(groups = OnUpdate.class, message = "id")
    private Long id;

    @NotNull
    @NotBlank
    private String name;

    @NotNull
    @NotBlank
    private Date date;

    @NotNull
    @NotBlank
    private Double price;

    @NotNull
    @NotBlank
    private String desc;

    @NotNull
    @NotBlank
    private Genre genre;
}
