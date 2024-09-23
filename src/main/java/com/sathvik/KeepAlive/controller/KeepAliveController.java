package com.sathvik.KeepAlive.controller;

import org.springframework.web.bind.annotation.*;

import static com.sathvik.KeepAlive.constants.ResponseMessages.KEEP_ALIVE;

@RestController
@RequestMapping(value = "/keep-alive")
@ResponseBody
@CrossOrigin
public class KeepAliveController {
    @GetMapping()
    public String keepAlive() {
        return KEEP_ALIVE;
    }
}