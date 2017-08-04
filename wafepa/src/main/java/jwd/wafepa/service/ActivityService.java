package jwd.wafepa.service;

import java.util.List;

import jwd.wafepa.model.Activity;

public interface ActivityService {
	
	/**
	 * Finds an activity with specified ID
	 * 
	 * @param id
	 * @return
	 */
	Activity findOne(Long id);
	List<Activity> findAll();
	Activity save (Activity activity);
	void remove (Long id);
	
	Activity findByName(String name);
	List<Activity> save(List<Activity> activities);
	void removeList(List<Long> ids);
		
	

}
