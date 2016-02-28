package com.mkyong.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pershing.ppm.dao.PlayerDAO;
import com.pershing.ppm.model.Player;

@Controller
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired
	private PlayerDAO playerDAO;

	@RequestMapping(value="/{name}", method = RequestMethod.GET)
	public String getMovie(@PathVariable String name, ModelMap model) {
		System.out.println("\nSpring JDBC Template Demostration using spring datasource");

		// invokes getPlayer() method supplying PLAYER_ID
		System.out.println("\nA. Invoking getPlayer() method supplying player_id in the formal argument");
		Player player1 = playerDAO.getPlayer(1);
		System.out.println("\nID\tName\t\t\tAge\tMatches");
		System.out.println("==\t================\t===\t=======");
		System.out.println(player1.getPlayerId() + "\t" + player1.getName() + "\t" + player1.getAge() + "\t" + player1.getMatches());

		model.addAttribute("movie", name);
		return "list";

	}
	
}