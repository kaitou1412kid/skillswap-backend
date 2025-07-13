package com.project.skillswapbackend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "USER_SKILL")
public class UserSkill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @OneToOne
    @Column(name = "USER")
    private User user;

    @OneToOne
    @Column(name = "SKILL")
    private Skill skill;


    @Column(name = "TYPE")
    private String type;

    @Column(name = "LEVEL")
    private String level;

}
