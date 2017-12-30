package ua.auction.web.dao;

import ua.auction.web.domain.Company;

import java.util.List;

public interface UserDao {
    List<Company> getListCompanies();
}
