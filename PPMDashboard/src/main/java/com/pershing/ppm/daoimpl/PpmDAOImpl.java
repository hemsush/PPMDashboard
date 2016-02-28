package com.pershing.ppm.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pershing.ppm.dao.PpmDAO;
import com.pershing.ppm.model.PPM;
import com.pershing.ppm.model.Player;

public class PpmDAOImpl implements PpmDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	/**
	 * This method retrieves a player from database using jdbcTemplate based on the PLAYER_ID supplied in the formal arguments
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<PPM> getPPMDetails() {

		String sql = "SELECT PPMID, PROJECT_NAME,DESCRIPTION,PM FROM PPM";
		List<PPM> lstPpm  = getJdbcTemplate().query(
				sql, 
				new BeanPropertyRowMapper(PPM.class));
		return lstPpm;
	}

}
