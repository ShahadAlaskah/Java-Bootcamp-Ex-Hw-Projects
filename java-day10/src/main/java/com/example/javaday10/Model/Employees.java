package com.example.javaday10.Model;
import javax.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;

@AllArgsConstructor @Data
public class Employees {

    @NotNull
    @Range(min = 3)
    private String ID;

    @NotEmpty
    @Range(min = 5)
    private String name;

    @NotNull
    @Min(26)
    //@Digits
    private Integer age;

    @AssertFalse
    private Boolean onLeave;

    @NotNull
    @PastOrPresent
    private LocalDate employmentYear;

    @NotNull
    @Positive
    private Integer annualLeave;


}
