package com.incedo.kirke.rag.ragapp.mappers;

import org.springframework.jdbc.core.RowMapper;

import com.incedo.kirke.rag.ragapp.model.RagEntry;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RagMapper implements RowMapper<RagEntry> {

	@Override
	public RagEntry mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		RagEntry entry = new RagEntry();
		
		entry.setCurrentLevel(rs.getString("current_level"));

		entry.setFirstName(rs.getString("first_name"));

		entry.setLastName(rs.getString("last_name"));
		
		
		
		return entry;
	}
}
