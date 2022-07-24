package ir.teherany.dto;


import ir.teherany.common.BaseDto;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
public class ArtWorkDto extends BaseDto {
    @NotNull
    @NotBlank
    private String name;

    @NotNull
    @NotBlank
    private BigDecimal price;

    @NotNull
    @NotBlank
    private ArtistDto artist;
}
