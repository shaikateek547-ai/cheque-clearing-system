package com.example.cheque_clearing_system;
import org.springframework.data.jpa.repository.JpaRepository; import java.util.*;
public interface ChequeRepository extends JpaRepository<Cheque,Long>{ List<Cheque> findBySubmittedBy(User u); boolean existsByChequeNumberAndBankName(String n,String b); long countByStatus(String s); long countByFraudFlagTrue(); }
