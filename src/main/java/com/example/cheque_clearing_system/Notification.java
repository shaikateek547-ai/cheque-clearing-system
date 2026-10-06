package com.example.cheque_clearing_system;
import jakarta.persistence.*; import java.time.LocalDateTime;
@Entity @Table(name="notifications") public class Notification {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @ManyToOne private User user; @Column(length=1000) private String message; private boolean readFlag; private LocalDateTime createdAt;
 public Notification(){} public Notification(User u,String m){user=u;message=m;readFlag=false;createdAt=LocalDateTime.now();}
 public Long getId(){return id;} public User getUser(){return user;} public String getMessage(){return message;} public boolean isReadFlag(){return readFlag;} public void setReadFlag(boolean v){readFlag=v;} public LocalDateTime getCreatedAt(){return createdAt;}
}
