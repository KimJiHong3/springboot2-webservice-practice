package com.springboot.springboot2webservice.domain.post.service;

import com.springboot.springboot2webservice.domain.post.cond.PostSearchCondition;
import com.springboot.springboot2webservice.domain.post.dto.PostInfoDto;
import com.springboot.springboot2webservice.domain.post.dto.PostPagingDto;
import com.springboot.springboot2webservice.domain.post.dto.PostSaveDto;
import com.springboot.springboot2webservice.domain.post.dto.PostUpdateDto;
import com.springboot.springboot2webservice.grobal.file.exception.FileException;
import org.springframework.data.domain.Pageable;

import java.io.IOException;

public interface PostService {

    /**
     * 게시글 등록
     */
    void save(PostSaveDto postSaveDto) throws FileException;

    /**
     * 게시글 수정
     */
    void update(Long id, PostUpdateDto postUpdateDto);

    /**
     * 게시글 삭제
     */
    void delete(Long id);

    /**
     * 게시글 1개 조회
     */
    PostInfoDto getPostInfo(Long id);


    /**
     * 검색 조건에 따른 게시글 리스트 조회 + 페이징
     */
    PostPagingDto getPostList(Pageable pageable, PostSearchCondition postSearchCondition);
}
{
}
