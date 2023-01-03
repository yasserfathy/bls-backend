package com.bls.matrix.controller;

import com.bls.matrix.entity.ReservedButton;
import com.bls.matrix.repo.ReservedButtonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class ReservedButtonController {
    @Autowired
    private ReservedButtonRepo reservedButtonRepo;

    @PostMapping("/buttons")
    public ResponseEntity<ReservedButton> save(@RequestBody ReservedButton reservedButton) {
        try {
            System.out.println(reservedButton);
            return new ResponseEntity<>(reservedButtonRepo.save(reservedButton), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
