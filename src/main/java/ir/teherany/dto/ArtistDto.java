package ir.teherany.dto;

import ir.teherany.common.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArtistDto extends BaseDto {

    @NotNull
    @NotBlank
    private String fullName;

    @NotNull
    @NotBlank
    private String nationalCode;

    @NotNull
    @NotBlank
    private String mobile;
}
