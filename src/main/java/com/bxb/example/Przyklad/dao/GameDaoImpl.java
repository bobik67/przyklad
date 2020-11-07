package com.bxb.example.Przyklad.dao;

import com.bxb.example.Przyklad.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Repository
public class GameDaoImpl extends JdbcDaoSupport implements GameDao {

	@Autowired
	DataSource dataSource;

	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}

	@Override
	public List<Game> getAllGames() {
		String sql = "SELECT * FROM game";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

		List<Game> result = new ArrayList<Game>();
		for (Map<String, Object> row : rows) {
			Game game = new Game();
			game.setActionId((String) row.get("actionId"));
			game.setEmpId((String) row.get("empId"));
			game.setGameId((String) row.get("gameId"));
			result.add(game);
		}
		return result;
	}

	@Override
	public void insertGame(Game game) {
		String sql = "INSERT INTO game " + "(empId, gameId, actionId) VALUES (?, ?, ?)";
		getJdbcTemplate().update(sql, new Object[] {game.getEmpId(), game.getGameId(), game.getActionId()});

	}
}
