package com.github.ivos.tcrest.config;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.impl.DefaultMapperFactory;

@ApplicationScoped
public class MapperProducer {

	@Produces
	@ApplicationScoped
	public MapperFacade createMapperFactory() {
		DefaultMapperFactory mapperFactory = new DefaultMapperFactory.Builder()
				.build();
		MapperFacade mapper = mapperFactory.getMapperFacade();
		return mapper;
	}

}
