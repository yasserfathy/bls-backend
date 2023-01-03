package com.bls.matrix.repo;

import com.bls.matrix.entity.Matrix;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatrixRepo extends JpaRepository<Matrix, Long> {
}
