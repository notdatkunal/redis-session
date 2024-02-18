//package com.kunal.redissession;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.ObjectPostProcessor;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.factory.PasswordEncoderFactories;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
////@EnableMethodSecurity(securedEnabled = true, jsr250Enabled = true)
//public class SecurityConfig   extends WebSecurityConfiguration{
//
//
////    @Bean
////    public BCryptPasswordEncoder yaay(){
////        return new BCryptPasswordEncoder();
////    }
//@Bean
//public SecurityFilterChain yes(HttpSecurity http) throws Exception {
//        return http
//                .csrf(yes->yes.ignoringRequestMatchers("/"))
//                .authorizeHttpRequests(auth-> auth
//                                .requestMatchers("/seller").authenticated()
//                                .requestMatchers("/admin").authenticated()
//                                .anyRequest().permitAll()
//                                )
////                .headers(headers->headers.frameOptions().sameOrigin())
//                .httpBasic(Customizer.withDefaults())
//                .build();
//}
//
//
//
//
////    @Bean
////    public UserDetailsService userDetailsService(BCryptPasswordEncoder bCryptPasswordEncoder) {
////        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
////        manager.createUser(User.withUsername("user")
////                .password(bCryptPasswordEncoder.encode("userPass"))
////                .roles("USER")
////
////                .build());
//
//
////        manager.createUser(User.withUsername("admin")
//////                .password(bCryptPasswordEncoder.encode("adminPass"))
//////                .roles("USER", "ADMIN")
//////                .build());
//
//
////        return manager;
////    }
//
//}
