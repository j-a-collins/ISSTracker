package com.collins.jack.ISSTracker.controllers;

import com.collins.jack.ISSTracker.models.IssLocator;
import com.collins.jack.ISSTracker.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ISSController {

    @Autowired
    private LocationService locationService;

    @Autowired
    private LocationService locationService;

    @GetMapping("/issLocation")
    public IssLocator getISSLocation() {
        return this.locationService.getIssLocation();
    }
}
