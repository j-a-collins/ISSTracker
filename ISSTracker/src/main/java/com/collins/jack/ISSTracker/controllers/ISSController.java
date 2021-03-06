package com.collins.jack.ISSTracker.controllers;

import com.collins.jack.ISSTracker.models.IssLocator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class ISSController {

    private static final String FAILED = "failed";

    @GetMapping("/issLocation")
    public IssLocator getISSLocation() {
        try {
            RestTemplate restTemplate = new RestTemplate();
            return restTemplate.getForObject("http://api.open-notify.org/iss-now.json", IssLocator.class);
        } catch (Exception e) {
            IssLocator issLocator = new IssLocator();
            issLocator.setMessage(FAILED);
            return issLocator;
        }
    }
}
