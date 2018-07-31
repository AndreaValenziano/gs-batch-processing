package it.softlab.gsbatchprocessing.batch;

import it.softlab.gsbatchprocessing.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person,Person> {
private static final Logger LOG = LoggerFactory.getLogger(PersonItemProcessor.class);
    @Override
    public Person process(Person person) throws Exception {

        final Person transformedPerson = new Person(
                person.getFirstName().toUpperCase(),
                person.getLastName().toUpperCase()
        );
        LOG.info("Converting (" + person + ") into (" + transformedPerson + ")");

        return transformedPerson;
    }
}
