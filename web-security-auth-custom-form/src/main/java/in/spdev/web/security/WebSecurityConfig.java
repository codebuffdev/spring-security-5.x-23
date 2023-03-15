package in.spdev.web.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@EnableWebSecurity(debug = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("sp")
                .password("{noop}java")
                .roles("dev");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/welcome").permitAll()
                .antMatchers("/check").permitAll()
                .antMatchers("/loginc").permitAll()
                .antMatchers("/in").authenticated()
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/loginc").loginProcessingUrl("/loginto")
                .and()
                .httpBasic()
                .and()
                .logout()
        ;
    }
}
