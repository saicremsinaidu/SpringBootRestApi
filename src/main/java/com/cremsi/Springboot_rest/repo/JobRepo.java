package com.cremsi.Springboot_rest.repo;

import com.cremsi.Springboot_rest.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    private final JobPost jobPost;
    List<JobPost> jobs = new ArrayList<>(Arrays.asList(

            new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                    List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),


            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
                    List.of("HTML", "CSS", "JavaScript", "React")),


            new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                    List.of("Python", "Machine Learning", "Data Analysis")),


            new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
                    List.of("Networking", "Cisco", "Routing", "Switching")),


            new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3,
                    List.of("iOS Development", "Android Development", "Mobile App"))
    ));

    public JobRepo(JobPost jobPost) {
        this.jobPost = jobPost;
    }

    public List<JobPost> getAllJobs()
    {
        return jobs;
    }

    public void addJob(JobPost jobPost)
    {
        jobs.add(jobPost);
        System.out.println(jobs);
    }

    public JobPost getJob(int id) {

        for(JobPost job: jobs)
        {
            if(job.getPostId()==id)
            {
                return job;
            }
        }
        return null;
    }

    public void updateJob(JobPost job) {
        for(JobPost jobpost:jobs)
        {
            if(job.getPostId()==jobpost.getPostId())
            {
                jobpost.setPostDesc(job.getPostDesc());
                jobpost.setPostProfile(job.getPostProfile());
                jobpost.setReqExperience(job.getReqExperience());
                jobpost.setPostTechStack(job.getPostTechStack());
            }

        }
    }

    public void deleteJob(int jobId) {
        for(JobPost job:jobs)
        {
            if(job.getPostId()==jobId)
            {
                jobs.remove(job);
                break;
            }
        }
    }
}
