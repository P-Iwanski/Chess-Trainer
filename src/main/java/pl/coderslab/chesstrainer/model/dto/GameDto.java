package pl.coderslab.chesstrainer.model.dto;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.validation.constraints.Pattern;

@Data
public class GameDto {
    @NotNull
    private String username;
    @Pattern(regexp = "[A-E]{1}-[00-99]{1}$", message = "Musi być z przedziału A00-E99")
    private String ECO;
}
