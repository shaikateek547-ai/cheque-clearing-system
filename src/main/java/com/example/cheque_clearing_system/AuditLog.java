package com.example.cheque_clearing_system;
import jakarta.persistence.*; import java.time.LocalDateTime;
@Entity @Table(name="audit_logs") public class AuditLog {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; private LocalDateTime timestamp; private String username; private String action; private Long chequeId; @Column(length=1000) private String details;
 public AuditLog(){} public AuditLog(String u,String a,Long c,String d){timestamp=LocalDateTime.now();username=u;action=a;chequeId=c;details=d;}
 public Long getId(){return id;} public LocalDateTime getTimestamp(){return timestamp;} public String getUsername(){return username;} public String getAction(){return action;} public Long getChequeId(){return chequeId;} public String getDetails(){return details;}
}
