package com.springboot.springboot2webservice.domain.member.dto;

import java.util.Optional;

public record MemberUpdateDto(Optional<String> name, Optional<String> nickName,
        Optional<Integer> age) {
        }

