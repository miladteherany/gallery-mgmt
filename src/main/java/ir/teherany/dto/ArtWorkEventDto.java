package ir.teherany.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ArtWorkEventDto {
    @NotNull
    @NotBlank
    private ArtWorkDto artWork;

    @NotNull
    @NotBlank
    private EventDto event;
}
