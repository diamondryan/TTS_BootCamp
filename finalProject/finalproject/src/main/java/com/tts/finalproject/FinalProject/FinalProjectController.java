package com.tts.finalproject.FinalProject;

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

@Controller
public class FinalProjectController {
    
    @Autowired
    private FinalProjectRepository finalProjectRepository;
    private static List<FinalProject> posts = new ArrayList<>();

    @GetMapping(value = "/")
    public String index(FinalProject finalProject, Model model){
        posts.removeAll(posts);
        for (FinalProject postfromDB: finalProjectRepository.findAll()){
            posts.add(postfromDB);
        }
        model.addAttribute("posts", posts);
        return "finalproject/index";
    }

    @GetMapping(value = "finalproject/index2")
    public String newBlog (FinalProject finalProject){
        return "finalproject/index2";
    }

    @GetMapping(value = "/finalproject/edit/{id}")
    public String editPostWithId(@PathVariable Long id, FinalProject finalProject, Model model){
        return "finalproject/edit";
    }
    
    @PostMapping(value = "/finalproject")
    public String addNewFinalProject(FinalProject finalProject, Model model) {
        finalProjectRepository.save(finalProject);

        model.addAttribute("title", finalProject.getTitle());
        model.addAttribute("author", finalProject.getAuthor());
        model.addAttribute("blogEntry", finalProject.getBlogEntry());
        return "finalproject/result";
    }
    
    @RequestMapping(value="/finalproject/delete/{id}")
    public String deletePostWithId(@PathVariable Long id, FinalProject finalProject) {
        finalProjectRepository.deleteById(id);
        return "finalproject/delete";
    }

    @RequestMapping(value = "/finalproject/edit/{id}")
    public String editPostWithId(@PathVariable Long id, Model model) {
        Optional<FinalProject> editPost = finalProjectRepository.findById(id);
        FinalProject result;
        if (editPost.isPresent()) {
            result = editPost.get();
            model.addAttribute("finalProject", result);
        } else {
        return "Error";
            }
        return "finalproject/edit";
    }
    
    @PostMapping(value = "/finalproject/update/{id}")
    public String updateExistingPost(@PathVariable Long id, FinalProject finalProject, Model model) {
        Optional<FinalProject> post = finalProjectRepository.findById(id);
        if(post.isPresent()){
            FinalProject actualPost = post.get();
            
            actualPost.setTitle(finalProject.getTitle());
            actualPost.setAuthor(finalProject.getAuthor());
            actualPost.setBlogEntry(finalProject.getBlogEntry());

            
            finalProjectRepository.save(actualPost);
            model.addAttribute("finalProject", actualPost);
        } else{
        }
        return "finalproject/result";
    }
}
