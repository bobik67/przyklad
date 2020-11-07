package com.bxb.example.Przyklad.service;

import com.bxb.example.Przyklad.model.Game;

import java.util.List;

public interface GameService {

		List<Game> getAllGames();
		void insertGame(Game game);

}
