package com.example.cheque_clearing_system;
import org.springframework.boot.CommandLineRunner; import org.springframework.context.annotation.*;
@Configuration public class DataInitializer { @Bean CommandLineRunner initializeUsers(UserRepository r){return args->{if(r.count()==0){r.save(new User("customer1","customer123","CUSTOMER","customer1@example.com"));r.save(new User("admin1","admin123","ADMIN","admin1@example.com"));}};}}
