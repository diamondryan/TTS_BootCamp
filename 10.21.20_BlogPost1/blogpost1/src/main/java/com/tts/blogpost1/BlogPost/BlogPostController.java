package com.tts.blogpost1.BlogPost;

import java.util.ArrayList;
import java.util.List;

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
    public String deletePostWithId(@PathVariable Long id, BlogPost blogPost, Model model) {
        blogPostRepository.deleteById(id);
        return "redirect:/";
    }
    @RequestMapping(value="/blogpost/edit/{id}")
    public String editPostWithId(@PathVariable Long id, Model model) {
        Optional<BlogPost> editPost = blogPostRepository.findById(id);
        BlogPost result = null;
        if (editPost()) {
            BlogPost actualPost = post.get();
            model.addAttribute("blogPost", actualPost);
        }
        return "blogpost/edit";
    }
    

}
