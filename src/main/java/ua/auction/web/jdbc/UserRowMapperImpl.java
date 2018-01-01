package ua.auction.web.jdbc;

import org.springframework.jdbc.core.RowMapper;
import ua.auction.web.domain.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapperImpl implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {

        return User.builder().username(rs.getString("username")).build();
    }
}
