package com.datalex.rest.info.resource;

import com.datalex.rest.info.model.MathDto;
import com.datalex.rest.info.facade.MathFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculationResource {


    @Autowired
    MathFacade mathFacade;

    @RequestMapping(value = "/calculations", method = RequestMethod.POST)
    public ResponseEntity<MathDto> createMath(@RequestBody MathDto math) {
        MathDto mathCreated = null;

        mathCreated = mathFacade.createMath(math);

        return new ResponseEntity<>(mathCreated, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/calculations/{mathId}", method = RequestMethod.GET)
    public ResponseEntity<MathDto> retrieveMath(@PathVariable("mathId") int id) {
        MathDto mathCreated = mathFacade.getMathBy(id);
        return new ResponseEntity<>(mathCreated, HttpStatus.OK);

    }





}