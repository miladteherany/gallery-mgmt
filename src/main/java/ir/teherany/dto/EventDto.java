package ir.teherany.dto;


import ir.teherany.common.BaseDto;
import ir.teherany.entity.enumuration.Status;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class EventDto extends BaseDto {
    @NotNull
    @NotBlank
    private String title;

    @NotNull
    @NotBlank
    private Status status;

    @NotNull
    @NotBlank
    private Long eventDate;
}
