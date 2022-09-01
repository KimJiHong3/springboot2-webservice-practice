package com.springboot.springboot2webservice.domain.post.repository;

import com.springboot.springboot2webservice.domain.post.Post;
import com.springboot.springboot2webservice.domain.post.cond.PostSearchCondition;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomPostRepository {

    Page<Post> search(PostSearchCondition postSearchCondition, Pageable pageable);
}