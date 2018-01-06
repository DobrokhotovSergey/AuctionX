package ua.auction.web.dao;

import ua.auction.web.domain.User;

public interface UserDao {
    User findByUserName(String username);
}
