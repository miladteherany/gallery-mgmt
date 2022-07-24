package ir.teherany.common;

import lombok.Data;
import org.hibernate.sql.Delete;
import org.hibernate.sql.Insert;
import org.hibernate.sql.Update;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.Date;

@Data
public class BaseDto {
    @Null(groups = Insert.class)
    @NotNull(groups = {Update.class, Delete.class}, message = "Id is null")
    @NotBlank
    private Long id;
    private Integer version;
    private Date createdDate;
    private String createdBy;
    private Date lastModifiedDate;
    private String lastModifiedBy;
}
