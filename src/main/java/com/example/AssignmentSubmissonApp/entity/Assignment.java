package com.example.AssignmentSubmissonApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String status;
    private String githubUrl;
    private String branch;
    private  String codeRevideoUrl;
    @ManyToOne(optional = false)
    @JoinColumn(name="user_id", nullable=false)
    private User assignedTo;
}
