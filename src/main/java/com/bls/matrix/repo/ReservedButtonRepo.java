package com.bls.matrix.repo;

import com.bls.matrix.entity.ReservedButton;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservedButtonRepo extends JpaRepository<ReservedButton, Long> {
}
