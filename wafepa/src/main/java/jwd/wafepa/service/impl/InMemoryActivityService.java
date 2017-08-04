package jwd.wafepa.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jwd.wafepa.model.Activity;
import jwd.wafepa.service.ActivityService;

public class InMemoryActivityService implements ActivityService {

	private Map<Long, Activity> activities = new HashMap<>();
	
	private long nextId = 1L;
	
	@Override
	public Activity findOne(Long id) {
		return activities.get(id);
	}

	@Override
	public List<Activity> findAll() {	
		List<Activity> ret = new ArrayList<>();
		
		for (Activity a:activities.values()){
			ret.add(a);
		}
		return ret;
	}

	@Override
	public Activity save(Activity activity) {
		if (activity.getId() == null){
			activity.setId(nextId++);
		}	
		activities.put(activity.getId(), activity);
		return activity;
	}

	@Override
	public void remove(Long id) {
		if(!activities.containsKey(id)) {
			throw new IllegalArgumentException("Tried to remove nonexistant activity.");
		}
		activities.remove(id);

	}

	@Override
	public Activity findByName(String name) {
		Activity activity = null;
		List<Activity> ret = new ArrayList<>();
		
		for (Activity a:activities.values()){
			ret.add(a);
		}
		for (Activity ac:ret) {
			if (ac.getName().equals(name)) {
				activity = ac;
			}
		}
		
		return activity;
	}

	@Override
	public List<Activity> save(List<Activity> activities) {
		List<Activity> ret = new ArrayList<>();
		
		for (Activity a:activities) {
			Activity ac = save(a);
			ret.add(ac);
		}
		return ret;
	}

	@Override
	public void removeList(List<Long> ids) {
		for (int i = 0; i < ids.size(); i++) {
			ids.remove(i);
		}
		
	}

}
