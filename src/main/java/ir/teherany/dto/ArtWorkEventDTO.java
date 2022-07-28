package ir.teherany.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ArtWorkEventDTO {
    @NotNull
    @NotBlank
    private ArtWorkDTO artWorkDTO;

    @NotNull
    @NotBlank
    private EventDTO eventDTO;
}
