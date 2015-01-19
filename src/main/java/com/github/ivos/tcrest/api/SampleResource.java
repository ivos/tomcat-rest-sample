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

import com.github.ivos.tcrest.service.Sample;
import com.github.ivos.tcrest.service.SampleService;

@Path("projects")
@ApplicationScoped
public class SampleResource {

	@Inject
	private SampleService sampleService;

	@Inject
	MapperFacade mapper;

	@GET
	@Path("{project}/samples")
	@Produces(MediaType.APPLICATION_JSON)
	public List<SampleDto> getSamples(@PathParam("project") String project) {
		List<Sample> samples = sampleService.getSamples(project);
		List<SampleDto> dtos = mapper.mapAsList(samples, SampleDto.class);
		return dtos;
	}

}
