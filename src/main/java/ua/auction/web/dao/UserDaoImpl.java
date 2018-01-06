package ua.auction.web.dao;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.auction.web.domain.User;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Getter
    @Setter
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User findByUserName(String username) {

        List<User> users = getSessionFactory().getCurrentSession()
                .createQuery("from User where username=?")
                .setParameter(0, username).list();

        if (users.size() > 0) {
            return users.get(0);
        } else {
            return null;
        }

    }
}
