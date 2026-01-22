package com.cremsi.Springboot_rest.service;

import com.cremsi.Springboot_rest.model.JobPost;
import com.cremsi.Springboot_rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {


    private JobRepo repo;

    public JobRepo getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(JobRepo repo) {
        this.repo = repo;
    }

    public void addJob(JobPost job)
    {
        repo.addJob(job);
    }

    public List<JobPost>getAllJobs()
    {
        return repo.getAllJobs();
    }

    public JobPost getJob(int i) {
        return repo.getJob(i);
    }

    public void updateJob(JobPost job) {
         repo.updateJob(job);
    }

    public void deleteJob(int jobId) {
        repo.deleteJob(jobId);
    }
}
