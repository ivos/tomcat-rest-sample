package com.github.ivos.tcrest.service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;

public class SampleService {

	public List<Sample> getSamples(String project) {
		return Arrays.asList(createSample(project), createSample(project),
				createSample(project));
	}

	private Sample createSample(String project) {
		Sample sample = new Sample();
		sample.setProject(project);
		sample.setValue(generateText());
		sample.setDate(new Date());
		sample.setTimestamp(new Date());
		return sample;
	}

	private String generateText() {
		return StringUtils.capitalize(RandomStringUtils.randomAlphabetic(
				3 + new Random().nextInt(12)).toLowerCase());
	}

}
