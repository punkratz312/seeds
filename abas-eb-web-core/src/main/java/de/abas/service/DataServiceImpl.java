package de.abas.service;

import lombok.Value;

@Value
class DataServiceImpl implements DataService {

	private final String criteria;

	public String foo22() {
		return String.format("foo22### criteria: %s, time: %d", criteria, System.currentTimeMillis());
	}
}
