package it.softlab.gsbatchprocessing.batch;

import it.softlab.gsbatchprocessing.model.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class CarItemProcessor implements ItemProcessor<Car, Car> {
    private static final Logger LOG = LoggerFactory.getLogger(PersonItemProcessor.class);
    @Override
    public Car process(Car car) throws Exception {

         car.setCarModel(car.getCarModel().toUpperCase())
                .setBrand(car.getBrand().toUpperCase());

        LOG.info("Converting (" + car + ") into (" + car + ")");

        return car;
    }
}
