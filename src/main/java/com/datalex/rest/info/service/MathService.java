package com.datalex.rest.info.service;

import com.datalex.rest.info.model.MathDto;

public interface MathService {

    /**
     * calculate the resulte in math object
     * @param math
     * @return
     */
    void calculateResult(MathDto math);

}
