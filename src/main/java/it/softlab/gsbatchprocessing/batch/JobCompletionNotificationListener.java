package it.softlab.gsbatchprocessing.batch;

import it.softlab.gsbatchprocessing.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class JobCompletionNotificationListener implements JobExecutionListener {

    private static final Logger LOG = LoggerFactory.getLogger(JobCompletionNotificationListener.class);
    @Autowired
    PersonRepository personRepository;

    @Override
    public void beforeJob(JobExecution jobExecution) {

    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
            LOG.info("!!! JOB FINISHED! Time to verify the results");
            personRepository.findAll().forEach(p -> LOG.info("Found <" + p + "> in the database."));
        }

    }

}
