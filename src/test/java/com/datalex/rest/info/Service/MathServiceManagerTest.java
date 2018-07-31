package com.datalex.rest.info.Service;

import com.datalex.rest.info.model.MathDto;
import com.datalex.rest.info.facade.MathFacade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MathServiceManagerTest {

    @Autowired
    private MathFacade mathFacade;

    /**
     * it is an integration test, before running it, be sure you have kafka configured and up running
     */
    @Test
    public void test_create_math_1_add_2() {
        MathDto mathDto = new MathDto();
        mathDto.setFirstNumber(new BigDecimal(1));
        mathDto.setSecondNumber(new BigDecimal(2));
        mathFacade.createMath(mathDto);
        assertThat(mathDto.getResult().compareTo(new BigDecimal(3)), equalTo(0));
    }

}
