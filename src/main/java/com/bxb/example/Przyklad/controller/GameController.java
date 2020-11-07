package com.bxb.example.Przyklad.controller;

import com.bxb.example.Przyklad.model.Game;
import com.bxb.example.Przyklad.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameController {

	@RestController
	public class EmployeeController {

		@Autowired
		GameService gameService;

		@RequestMapping(value = "/list-games", method = RequestMethod.GET)
		public List<Game> getEmployees() {

			return gameService.getAllGames();

		}

		@RequestMapping(value = "/insert-game", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public void insertEmployee(@RequestBody Game game) {
			gameService.insertGame(game);
		}

	}

}
