package com.bxb.example.Przyklad.dao;

import com.bxb.example.Przyklad.model.Game;

import java.util.List;

public interface GameDao {


		List<Game> getAllGames();

		void insertGame(Game game);

}
