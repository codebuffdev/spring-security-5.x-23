package in.spdev.web.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity(debug = true)
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("sp")
                .password(passwordEncoder.encode("1234"))
                .roles("dev");

        auth.inMemoryAuthentication()
                .withUser("sriman")
                .password(passwordEncoder.encode("1234"))
                .roles("admin");

        auth.inMemoryAuthentication()
                .withUser("sexp")
                .password(passwordEncoder.encode("abhi"))
                .roles("user");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/check").permitAll()
                .anyRequest().authenticated()
                .antMatchers("/user").hasAuthority("user")
                .antMatchers("/admin").hasAuthority("admin")
                .antMatchers("/dev").hasAuthority("dev")
                .and()
                .formLogin();
    }
}
