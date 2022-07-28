package ir.teherany.dto;


import ir.teherany.common.BaseDto;
import ir.teherany.dto.annotationDTO.OnUpdate;
import ir.teherany.entity.enumuration.Status;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class EventDTO extends BaseDto {
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
    private String location;

    @NotNull
    @NotBlank
    private Status status;
}
