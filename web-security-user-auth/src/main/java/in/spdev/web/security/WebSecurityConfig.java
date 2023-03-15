package in.spdev.web.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity(debug = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * PasswordEncoder, helps to encode our password
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        //return NoOpPasswordEncoder.getInstance();
        return new BCryptPasswordEncoder();
    }

    /**
     * In-memory user with password & roles
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //adding a user in server memory
        auth.inMemoryAuthentication()
                .withUser("sp")
                .password(passwordEncoder.encode("java"))
                .roles("dev");

        auth.inMemoryAuthentication()
                .withUser("abhi")
                .password(passwordEncoder.encode("sexp"))
                .roles("exp");
    }

    /**
     * authentication through default  formLogin() and httpBasic();
     */

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests(). //authorize request
                anyRequest(). //any request i.e. coming
                authenticated(). // make it authenticated
                and(). //and
                formLogin(). // through From login (default form)
                and() //and
                .httpBasic(); // through http basic - base64 encoding (rest)
    }
}
