package com.example.pocgraphhoper.controller;

import com.example.pocgraphhoper.model.RouteDTO;
import com.example.pocgraphhoper.service.RouterService;
import com.graphhopper.ResponsePath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/route")
public class RouterController {

    @Autowired
    private RouterService routerService;

    @PostMapping
    public ResponsePath route(@RequestBody RouteDTO routeDTO) {
        return routerService.route(routeDTO);
    }
}
