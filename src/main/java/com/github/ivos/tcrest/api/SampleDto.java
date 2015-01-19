package com.github.ivos.tcrest.api;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

public class SampleDto implements TemporalFormat {

	public String project;

	public String value;

	@JsonFormat(shape = Shape.STRING, pattern = DATE)
	public Date date;

	@JsonFormat(shape = Shape.STRING, pattern = TIMESTAMP)
	public Date timestamp;

}
