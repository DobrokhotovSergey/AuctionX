package ua.auction.web.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.auction.web.domain.Company;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

//    private JdbcTemplate jdbcTemplate;
//    @Autowired
//    public UserDaoImpl(DataSource dataSource) {
//        jdbcTemplate = new JdbcTemplate(dataSource) ;
//    }
    @Autowired
    private SessionFactory sessionFactory;



    @Override
    @Transactional
    public List<Company> getListCompanies() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Company", Company.class).getResultList();
    }
}
