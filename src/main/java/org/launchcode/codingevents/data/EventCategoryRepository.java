package org.launchcode.codingevents.data;

import org.springframework.data.repository.CrudRepository;
import org.launchcode.codingevents.models.EventCategory;
import org.springframework.stereotype.Repository;

/**
 * Created by Chris Bay
 */
@Repository
public interface EventCategoryRepository extends CrudRepository<EventCategory, Integer> {

}

