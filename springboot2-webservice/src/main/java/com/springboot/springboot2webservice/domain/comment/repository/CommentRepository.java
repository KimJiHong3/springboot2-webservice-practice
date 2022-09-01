package com.springboot.springboot2webservice.domain.comment.repository;

import com.springboot.springboot2webservice.domain.comment.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long>{
}
