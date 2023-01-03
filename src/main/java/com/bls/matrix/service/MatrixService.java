package com.bls.matrix.service;

import com.bls.matrix.repo.MatrixRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatrixService {
    @Autowired
    private MatrixRepo matrixRepo;
}
