package com.example.cheque_clearing_system; import org.springframework.data.jpa.repository.JpaRepository; import java.util.*;
public interface NotificationRepository extends JpaRepository<Notification,Long>{List<Notification> findByUserOrderByCreatedAtDesc(User u); long countByUserAndReadFlagFalse(User u);}
