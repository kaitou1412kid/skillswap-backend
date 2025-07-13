package com.project.skillswapbackend.skill;

import com.project.skillswapbackend.skill.dto.request.SkillAddRequest;
import org.springframework.web.servlet.function.ServerResponse;

public interface SkillService {

    ServerResponse addSkills(SkillAddRequest request);
}
