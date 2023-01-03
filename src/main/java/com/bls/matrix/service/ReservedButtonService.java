package com.bls.matrix.service;

import com.bls.matrix.repo.ReservedButtonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservedButtonService {
    @Autowired
    private ReservedButtonRepo reservedButtonRepo;

}
