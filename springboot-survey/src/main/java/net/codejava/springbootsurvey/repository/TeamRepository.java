package net.codejava.springbootsurvey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.springbootsurvey.entity.Team;


public interface TeamRepository extends JpaRepository<Team, Long>{

}
