package com.techtx.springbootjobrunrexample.controller;

import com.techtx.springbootjobrunrexample.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {

    @Autowired
    JobService jobService;

    @GetMapping("/job")
    public void callJob()
    {
        jobService.testJob();
    }
}
