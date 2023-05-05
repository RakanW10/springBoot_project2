package com.example.springboot_aftersection7.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "user_notes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserNotesEntity {
    @Id
    @Column(name = "note_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer noteId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "note")
    private String note;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private UserEntity userEntity;
}
