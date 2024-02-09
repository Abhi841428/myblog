package myblog.controller;


import myblog.entity.Post;
import myblog.payload.PostDto;
import myblog.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService ;
    }
    @PostMapping(value = "/add")
  public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto ){
       PostDto dto =  postService.createPost(postDto);
       return new ResponseEntity<>(dto, HttpStatus.CREATED);
  }

    @PostMapping(value = "/detail")
    public ResponseEntity<Post> detail(@RequestBody PostDto postDto ){
        Post post =  postService.detail(postDto);
        return new ResponseEntity<>(post, HttpStatus.CREATED);
    }


}
