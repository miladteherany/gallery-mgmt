package ir.teherany.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class EventArtworkDTO {
    @NotNull
    @NotBlank
    private EventDTO eventDTO;

    @NotNull
    @NotBlank
    private ArtWorkDTO artWorkDTO;
}
