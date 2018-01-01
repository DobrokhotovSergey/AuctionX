package ua.auction.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ua.auction.web.dao.UserDao;
import ua.auction.web.domain.Company;
import ua.auction.web.domain.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserDetailsService, UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = null;
        //= userDao.getUser(userName);
        if(user == null){
            throw new UsernameNotFoundException("user name not found");
        }
        return user;
    }


    @Override
    public List<Company> getListCompanies() {
        return userDao.getListCompanies();
    }
}
