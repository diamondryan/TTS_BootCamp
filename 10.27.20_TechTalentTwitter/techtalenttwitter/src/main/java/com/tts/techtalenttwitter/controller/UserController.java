package com.tts.techtalenttwitter.controller;

import java.util.HashMap;
import java.util.List;

import com.tts.techtalenttwitter.model.Tweet;
import com.tts.techtalenttwitter.service.TweetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {
    
    @Autowired
    private UserService UserService;

    @Autowired
    private TweetService tweetService;

    @GetMapping(value = "/users")
    public String getUsers(Model model){

        List<User> users = userService.findAll();
        User loggedInUser = userService.getLoggedInUser();
        List<User> usersFollowing = loggedInUser.getFollowing();
        SetFollowingStatus(users, usersFollowing, model);
        model.addAttribute("users", users);
        SetTweetCount(users, model);
        return "users";
    }

    @GetMapping(value = "/users/{username}")
    public String getUser(@PathVariable(value = "username") String username, Model model) {
        User loggedInUser = userService.getLoggedInUser();
        User user = userService.findByUsername(username);
        List<Tweet> tweets = tweetService.findAllByUser(user);
        List<User> following = loggedInUser.getFollowing();
        boolean isSelfPage = loggedInUser.getUsername().equals(username);
        boolean isFollowing = false;
        for (User followedUser : following) {
            if (followedUser.getUsername().equals(username)){
                isFollowing = true;
            }
        }
        model.addAttribute("isSelfPage", isSelfPage);
        model.addAttribute("following", isFollowing);
        model.addAttribute("tweetList", tweets);
        model.addAttribute("user", user);
        return "user";
    }

    private void SetTweetCount(List<User> users, Model model) {
        HashMap<String, Integer> tweetCounts = new HashMap<>();
        for (User user : users) {
            List<Tweet> tweets = tweets.Service.findAllByUser(user);
            tweetCounts.put(user.getUsername(), tweets.size());
        }
        model.addAttribute("tweetCounts", tweetCounts);
    }

    private void SetFollowingStatus(List<User> users, List<User> usersFollowing, MOdel model) {
        HashMap<String, Boolean> followingStatus = new HashMap <>();
        String username = userService.getLoggedInUser().getUsername();

        for (User user : users) {
            if(usersFollowing.contains(user)){
                followingStatus.put(user.getUSername(), true);
            }else if (!user.getUsername().equals(username)){
                followingStatus.put(user.getUSername(), false);
            }
        }
        model.addAttribute("followingStatus", followingStatus);

    }


}
