package com.github.pvictorcaval.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/cars")
public class CarController {

    @GET
    public Response findCar() {
        return Response.ok().build();
    }
}
