package com.example.notificationservice.controller;

import com.example.notificationservice.model.NotificationTemplate;
import com.example.notificationservice.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    private final NotificationService notificationService;

    @Autowired
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping
    public List<NotificationTemplate> getAllNotificationTemplates() {
        return notificationService.getAllNotificationTemplates();
    }

    @GetMapping("/{id}")
    public NotificationTemplate getNotificationTemplateById(@PathVariable Long id) {
        return notificationService.getNotificationTemplateById(id);
    }

    @PostMapping
    public NotificationTemplate createNotificationTemplate(@RequestBody NotificationTemplate notificationTemplate) {
        return notificationService.createNotificationTemplate(notificationTemplate);
    }

    @DeleteMapping("/{id}")
    public void deleteNotificationTemplate(@PathVariable Long id) {
        notificationService.deleteNotificationTemplate(id);
    }
}
