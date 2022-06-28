package com.bootcamp20.afp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AfpModel {
    @JsonProperty("clientId")
    @Builder.Default
    private Long id = null;

    @Builder.Default
    private String description = null;

    @Builder.Default
    private int dni = 0;

    @Builder.Default
    private Double amountavailable = null;

    @Builder.Default
    private Timestamp time = null;

    @Builder.Default
    private String nroCta = null;
}
