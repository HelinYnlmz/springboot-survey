package net.codejava.springbootsurvey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.codejava.springbootsurvey.service.TeamService;

@Controller
public class TeamController {

	private TeamService teamService;
	
	public TeamController(TeamService teamService) {
		super();
		this.teamService=teamService;
	}
	
	@GetMapping("/teams")
	public String listStudents(Model model) {
		model.addAttribute("teams", teamService.getAllTeams());
		return "teams";
		
	}
}
