package com.example.notificationservice.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "notification_template")
@Data
public class NotificationTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String message;

    @ElementCollection
    @CollectionTable(name = "template_criteria", joinColumns = @JoinColumn(name = "template_id"))
    private List<NotificationCriteria> criteria;
    
    
}