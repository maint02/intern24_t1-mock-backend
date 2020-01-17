package com.itsol.projectservice.repository;

import com.itsol.projectservice.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team,Long> {
}
