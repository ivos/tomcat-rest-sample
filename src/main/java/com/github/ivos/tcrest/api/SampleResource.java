package com.github.ivos.tcrest.api;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ma.glasnost.orika.MapperFacade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.ivos.tcrest.service.Sample;
import com.github.ivos.tcrest.service.SampleService;

@Path("projects")
@ApplicationScoped
public class SampleResource {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Inject
	private SampleService sampleService;

	@Inject
	MapperFacade mapper;

	@GET
	@Path("{project}/samples")
	@Produces(MediaType.APPLICATION_JSON)
	public List<SampleDto> listSamples(@PathParam("project") String project) {
		logger.info("Listing samples for project {}.", project);
		List<Sample> samples = sampleService.getSamples(project);
		List<SampleDto> dtos = mapper.mapAsList(samples, SampleDto.class);
		logger.info("Listed {} samples for project {}.", dtos.size(), project);
		return dtos;
	}

}
