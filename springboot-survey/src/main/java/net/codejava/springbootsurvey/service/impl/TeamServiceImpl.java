package net.codejava.springbootsurvey.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.codejava.springbootsurvey.entity.Team;
import net.codejava.springbootsurvey.repository.TeamRepository;
import net.codejava.springbootsurvey.service.TeamService;

@Service
public class TeamServiceImpl implements TeamService{
	
	private TeamRepository teamRepository;
	
	public TeamServiceImpl(TeamRepository teamRepository) {
		super();
		this.teamRepository=teamRepository;
	}

	@Override
	public List<Team> getAllTeams() {
		return teamRepository.findAll();
	}

	
}
