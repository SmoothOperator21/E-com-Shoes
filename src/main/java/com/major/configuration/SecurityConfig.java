/*
 * package com.major.configuration;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.authentication.AuthenticationManager; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import
 * org.springframework.security.config.annotation.web.builders.WebSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import
 * org.springframework.security.web.util.matcher.AntPathRequestMatcher; import
 * org.springframework.security.web.util.matcher.RequestMatcher;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity public class SecurityConfig extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception { //
 * Your security configuration here http.authorizeRequests().antMatchers("/",
 * "/shop/**", "/forgotpassword", "/registor", "/h2-console/**")
 * .permitAll().antMatchers("/admin/**").hasRole("ADMIN").anyRequest().
 * authenticated().and().formLogin()
 * .loginPage("/login").permitAll().failureUrl("/login?error= true").
 * defaultSuccessUrl("/home")
 * .usernameParameter("email").passwordParameter("password").and().oauth2Login()
 * .loginPage("/login")
 * .successHandler(googleOAuth2SuccessHandler).and().logout()
 * .logoutRequestMatcher(new
 * AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login")
 * .invalidateHttpSession(true).deleteCookies("JSESSIONID").and().
 * exceptionHandling().and().csrf() .disable();
 * 
 * http.headers().frameOptions().disable();
 * 
 * }
 * 
 * @Bean public BCryptPasswordEncoder bCryptPasswordEncoder() { return new
 * BCryptPasswordEncoder(); }
 * 
 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
 * Exception { auth.userDetailsService(customUserDetailService);
 * 
 * }
 * 
 * @Override public void configure(WebSecurity web) throws Exception {
 * web.ignoring().antMatchers("/resources/**",
 * "/static/**","/images/**","/productimages/**","/css/**","/js/**"); }
 * 
 * }
 */