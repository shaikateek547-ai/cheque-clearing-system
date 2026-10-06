package com.example.cheque_clearing_system;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity @Table(name="cheques")
public class Cheque {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @Column(nullable=false) private String chequeNumber;
 @Column(nullable=false) private String accountNumber;
 @Column(nullable=false) private Double amount;
 @Column(nullable=false) private String bankName;
 private String clearingBank;
 private LocalDate chequeDate;
 private LocalDate submittedAt;
 private String status;
 private String rejectionReason;
 private boolean fraudFlag;
 private String fraudReason;
 @ManyToOne private User submittedBy;
 public Cheque() {}
 public Cheque(String n,String a,Double amt,String bank,LocalDate date,String status,User user){chequeNumber=n;accountNumber=a;amount=amt;bankName=bank;chequeDate=date;this.status=status;submittedBy=user;submittedAt=LocalDate.now();}
 public Long getId(){return id;} public String getChequeNumber(){return chequeNumber;} public void setChequeNumber(String v){chequeNumber=v;}
 public String getAccountNumber(){return accountNumber;} public void setAccountNumber(String v){accountNumber=v;} public Double getAmount(){return amount;} public void setAmount(Double v){amount=v;}
 public String getBankName(){return bankName;} public void setBankName(String v){bankName=v;} public LocalDate getChequeDate(){return chequeDate;} public void setChequeDate(LocalDate v){chequeDate=v;}
 public String getStatus(){return status;} public void setStatus(String v){status=v;} public User getSubmittedBy(){return submittedBy;} public void setSubmittedBy(User v){submittedBy=v;}
 public String getClearingBank(){return clearingBank;} public void setClearingBank(String v){clearingBank=v;} public LocalDate getSubmittedAt(){return submittedAt;} public void setSubmittedAt(LocalDate v){submittedAt=v;}
 public String getRejectionReason(){return rejectionReason;} public void setRejectionReason(String v){rejectionReason=v;} public boolean isFraudFlag(){return fraudFlag;} public void setFraudFlag(boolean v){fraudFlag=v;}
 public String getFraudReason(){return fraudReason;} public void setFraudReason(String v){fraudReason=v;}
}
