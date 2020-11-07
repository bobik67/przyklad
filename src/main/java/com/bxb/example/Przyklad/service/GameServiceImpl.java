package com.bxb.example.Przyklad.service;

import com.bxb.example.Przyklad.dao.GameDao;
import com.bxb.example.Przyklad.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

		@Autowired
		GameDao gameDao;

		public List<Game> getAllGames() {
			List<Game> games = gameDao.getAllGames();
			return games;
		}

		@Override
		public void insertGame(Game game) {
			gameDao.insertGame(game);
		}
}
