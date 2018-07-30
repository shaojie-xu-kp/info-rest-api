package com.datalex.rest.info.service;

import com.datalex.rest.info.model.MathDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AddMathService implements MathService{

    private static final Logger LOG = LoggerFactory.getLogger(AddMathService.class);

    @Override
    public void calculateResult(MathDto math) {
        LOG.info(math.getFirstNumber() + " add " + math.getSecondNumber());
        math.setResult(math.getFirstNumber().add(math.getSecondNumber()));
    }
}
