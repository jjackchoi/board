package com.study.board.controller;

import com.study.board.dto.SearchDto;
import com.study.board.paging.PagingResponse;
import com.study.board.post.PostResponse;
import com.study.board.post.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class RestApiTestController {

    private final PostService postService;
    @GetMapping("/posts")
    public PagingResponse<PostResponse> findAllPost(){
        return postService.findAllPost(new SearchDto());
    }
}
