//package com.study.board;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
//import com.study.board.post.PostMapper;
//import com.study.board.post.PostRequest;
//import com.study.board.post.PostResponse;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
//@SpringBootTest
//public class PostMapperTest {
//    @Autowired
//    PostMapper postMapper;
//
//    @Test
//    public void save(){
//        PostRequest params = new PostRequest();
//        params.setTitle("1번 게시글 제목");
//        params.setContent("1번 게시글 내용");
//        params.setWriter("테스터");
//        params.setNoticeYn(false);
//        postMapper.save(params);
//
//        List<PostResponse> posts = postMapper.findAll();
//        System.out.println("전체 게시글 개수는 : " + posts.size() + "개입니다.");
//    }
//
//    @Test
//    public void findById(){
//        PostResponse posts = postMapper.findById(1L);
//        try{
//            String postJson = new ObjectMapper().registerModule(new JavaTimeModule()).writeValueAsString(posts);
//            System.out.println(postJson);
//        }catch(JsonProcessingException e){
//            throw new RuntimeException(e);
//        }
//    }
//}
