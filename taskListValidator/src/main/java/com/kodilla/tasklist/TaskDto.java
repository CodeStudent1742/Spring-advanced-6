package com.kodilla.tasklist;
import java.time.LocalDate;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Value;
@Value
public class TaskDto {
    @NotNull
    LocalDate when;

    @NotNull
    String title;

    @Range(min = 1, max = 5)
    int priority;
}