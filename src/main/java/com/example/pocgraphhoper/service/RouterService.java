package com.example.pocgraphhoper.service;

import com.example.pocgraphhoper.model.RouteDTO;
import com.graphhopper.ResponsePath;

public interface RouterService {
    ResponsePath route(RouteDTO routeDTO);
}
