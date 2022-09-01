package com.springboot.springboot2webservice.domain.comment.service;

import com.springboot.springboot2webservice.domain.comment.dto.CommentSaveDto;
import com.springboot.springboot2webservice.domain.comment.dto.CommentUpdateDto;
import com.springboot.springboot2webservice.domain.comment.exception.CommentException;

import java.util.List;

public interface CommentService {

    void save(Long postId , CommentSaveDto commentSaveDto);
    void saveReComment(Long postId, Long parentId ,CommentSaveDto commentSaveDto);

    void update(Long id, CommentUpdateDto commentUpdateDto);

    void remove(Long id) throws CommentException;
}
