package com.main;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class RestApp extends Application
{

	private Set<Object> singletons = new HashSet<>();
	private Set<Class<?>> empty = new HashSet<>();

	public RestApp()
	{
		this.singletons.add(new RestServerCore());
	}

	public Set<Class<?>> getClasses()
	{
		return this.empty;
	}

	public Set<Object> getSingletons()
	{
		return this.singletons;
	}
}
