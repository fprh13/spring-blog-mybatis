package com.example.blog.controller;


import com.example.blog.service.PostService;
import com.example.blog.vo.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {

    private final PostService postService;

    public IndexController(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping(value = "/V1")
    public String indexV1(Model model) {
        List<Post> postList = postService.getAllPost();
        model.addAttribute("posts", postList);
        return "index";
    }

    /**
     * 더 보기 기능
     */
    @RequestMapping(value = "/")
    public String index(Model model) {
        List<Post> postList = postService.getPostByPage(1,3);
        model.addAttribute("posts", postList);
        return "index";
    }
}
