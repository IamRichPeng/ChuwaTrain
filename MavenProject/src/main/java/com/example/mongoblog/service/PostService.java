package com.example.mongoblog.service;

import com.example.mongoblog.payload.PostDto;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPost();

    PostDto getPostById(String id);

    PostDto updatePost(PostDto postDto, String id);

    void deletePostById(String id);
}
