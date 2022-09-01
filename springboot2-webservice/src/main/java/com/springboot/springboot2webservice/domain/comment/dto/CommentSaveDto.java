package com.springboot.springboot2webservice.domain.comment.dto;

import com.springboot.springboot2webservice.domain.comment.Comment;

public record CommentSaveDto (String content){

public Comment toEntity() {
        return Comment.builder().content(content).build();
        }
        }