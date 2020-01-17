package com.itsol.projectservice.repository;

import com.itsol.projectservice.domain.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position,Long> {
}
