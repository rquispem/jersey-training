package com.app;

import com.app.resources.BookResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by rquispe on 4/26/16.
 * chmod a+x /Users/rquispe/apache-tomcat-8.0.33/bin/catalina.sh
 */
@ApplicationPath("/library")
public class InitApplication extends Application {


	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(BookResource.class);
		return classes;
	}
//	public InitApplication() {
//		packages("com.app.resources");
//	}
}
