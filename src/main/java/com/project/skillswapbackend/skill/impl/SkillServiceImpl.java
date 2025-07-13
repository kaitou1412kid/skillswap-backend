package com.project.skillswapbackend.skill.impl;

import com.project.skillswapbackend.model.Skill;
import com.project.skillswapbackend.skill.SkillService;
import com.project.skillswapbackend.skill.dto.request.SkillAddRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.ServerResponse;

import java.util.List;

@Slf4j
@Service
public class SkillServiceImpl implements SkillService {

    @Override
    public ServerResponse addSkills(SkillAddRequest request) {
        return null;
    }
}
