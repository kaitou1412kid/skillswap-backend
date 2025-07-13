package com.project.skillswapbackend.skill.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SkillAddRequest {

    private String type;

    private List<String> skills;

    private String userId;

    private String level;

}
