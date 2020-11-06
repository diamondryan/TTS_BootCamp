package com.tts.blogpost1.BlogPost;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BlogPostController {
    
    @Autowired
    private BlogPostRepository blogPostRepository;
    private static List<BlogPost> posts = new ArrayList<>();

    @GetMapping(value = "/")
    public String index(BlogPost blogPost, Model model) {
        posts.removeAll(posts);
        for (BlogPost postFromDB: blogPostRepository.findAll()) {
            posts.add(postFromDB);
        }
        model.addAttribute("posts", posts);
        return "blogpost/index";
    }

    @GetMapping(value = "/blogpost/index2")
    public String newBlog (BlogPost blogPost){
        return "blogpost/index2";
    }

    @GetMapping(value = "/blogpost/edit/{id}")
    public String editPostWithId(@PathVariable Long id, BlogPost blogPost, Model model){
        return "blogpost/edit";
    }
    
    @PostMapping(value = "/blogpost")
    public String addNewBlogPost(BlogPost blogPost, Model model) {
        blogPostRepository.save(blogPost);

        model.addAttribute("title", blogPost.getTitle());
        model.addAttribute("author", blogPost.getAuthor());
        model.addAttribute("blogEntry", blogPost.getBlogEntry());
        return "blogpost/result";
    }
    
    @RequestMapping(value="/blogpost/delete/{id}")
    public String deletePostWithId(@PathVariable Long id, BlogPost blogPost) {
        blogPostRepository.deleteById(id);
        return "blogpost/delete";
    }

    @RequestMapping(value = "/blogpost/edit/{id}")
    public String editPostWithId(@PathVariable Long id, Model model) {
        Optional<BlogPost> editPost = blogPostRepository.findById(id);
        BlogPost result;
        if (editPost.isPresent()) {
            result = editPost.get();
            model.addAttribute("blogPost", result);
        } else {
        return "Error";
            }
        return "blogpost/edit";
    }
    
    @PostMapping(value = "/blogpost/update/{id}")
    public String updateExistingPost(@PathVariable Long id, BlogPost blogPost, Model model) {
        Optional<BlogPost> post = blogPostRepository.findById(id);
        if(post.isPresent()){
            BlogPost actualPost = post.get();
            
            actualPost.setTitle(blogPost.getTitle());
            actualPost.setAuthor(blogPost.getAuthor());
            actualPost.setBlogEntry(blogPost.getBlogEntry());

            
            blogPostRepository.save(actualPost);
            model.addAttribute("blogPost", actualPost);
        } else{
        }
        return "blogpost/result";
    }


}
