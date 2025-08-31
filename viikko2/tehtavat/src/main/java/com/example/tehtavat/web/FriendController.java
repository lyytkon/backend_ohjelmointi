package com.example.tehtavat.web;

import com.example.tehtavat.Friend;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FriendController {

    private List<Friend> friends = new ArrayList<>();

    @GetMapping("/friends")
    public String listFriends(Model model) {
        model.addAttribute("friends", friends);
        return "friends";
    }

    @GetMapping("/add")
    public String addFriendForm(Model model) {
        model.addAttribute("friend", new Friend());
        return "addfriend";
    }

    @PostMapping("/save")
    public String saveFriend(@ModelAttribute Friend friend) {
        friends.add(friend);
        return "redirect:/friends";
    }
}