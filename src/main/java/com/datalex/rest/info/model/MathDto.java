package com.datalex.rest.info.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@ToString
@Getter
@Setter
@EqualsAndHashCode
public class MathDto {

    private int id;
    private BigDecimal firstNumber;
    private BigDecimal secondNumber;
    private BigDecimal result;


}
