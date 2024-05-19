package com.example.blog.service;

import com.example.blog.mapper.PostMapper;
import com.example.blog.vo.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private PostMapper postMapper;

    public PostService(PostMapper postMapper) {
        this.postMapper = postMapper;
    }

    public List<Post> getAllPost() {
        return postMapper.findAll();
    }

    public List<Post> getPostByPage(Integer page, Integer size) {
        return postMapper.findByPage(size, (page -1) * size);
    }
}