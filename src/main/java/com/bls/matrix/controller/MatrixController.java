package com.bls.matrix.controller;

import com.bls.matrix.entity.Matrix;
import com.bls.matrix.entity.User;
import com.bls.matrix.repo.MatrixRepo;
import com.bls.matrix.service.MatrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class MatrixController {
    @Autowired
    private MatrixRepo matrixRepo;

    @PostMapping("/matrices")
    public ResponseEntity<Matrix> save(@RequestBody Matrix matrix) {
        try {
            System.out.println(matrix);
            return new ResponseEntity<>(matrixRepo.save(matrix), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
