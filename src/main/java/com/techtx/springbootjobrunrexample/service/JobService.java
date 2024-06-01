package com.techtx.springbootjobrunrexample.service;

import org.jobrunr.jobs.annotations.Job;
import org.jobrunr.scheduling.JobScheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {

    @Autowired
    JobScheduler jobScheduler;

    @Job(name="test job")
    public void testJob()
    {
        jobScheduler.enqueue(() -> System.out.println("Up & Running from a background Job"));
    }
}
