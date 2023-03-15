package in.spdev.web.dao;

import in.spdev.web.dto.SignUpDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SignupDAOImpl implements SignupDAO {
    private String insertUser = "insert into spring_security.users value (?,?,?) ";
    private String insertAuth = "insert into authorities value (?,?)";
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void saveUser(SignUpDTO signUpDTO) {
        jdbcTemplate.update(insertUser,signUpDTO.getUsername(),signUpDTO.getPassword(),1);
        jdbcTemplate.update(insertAuth,signUpDTO.getUsername(),signUpDTO.getRole());
    }
}
