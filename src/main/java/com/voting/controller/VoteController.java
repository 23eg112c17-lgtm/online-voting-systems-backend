package com.voting.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin

public class VoteController {

    @PostMapping("/vote")

    public String vote(

            @RequestParam(required = false) Integer age,

            @RequestParam(required = false) String candidate

    ) {

        if (age == null) {

            return "Age is missing";

        }

        if (age < 18) {

            return "Not eligible to vote";

        }

        if (candidate == null) {

            return "Candidate not selected";

        }

        return "You have voted successfully for " + candidate;

    }

}
