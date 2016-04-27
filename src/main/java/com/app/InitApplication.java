package com.app;

import com.app.resources.BookResource;
import com.app.resources.MessageResource;

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
		classes.add(MessageResource.class);
		return classes;
	}

	/**
	 * - Jersey's own implementations of Application class.
	 * - This class can either be directly instantiated and then configured or it can be extended and the configuration
	 * code placed into the constructor of the extending class. The approach typically depends on the chosen deployment runtime.
	 * - Compared to Application, the ResourceConfig provides advanced capabilities to simplify registration of JAX-RS components,
	 * such as scanning for root resource and provider classes in a provided classpath or a in a set of package names etc.
	 * */
//	public class MyApplication extends ResourceConfig {
//		public MyApplication() {
//			packages("org.foo.rest;org.bar.rest");
//		}
//	}
}
