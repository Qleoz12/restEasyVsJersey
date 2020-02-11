package restEasy;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class RestApplication extends Application {
	
	private Set<Object> singletons = new HashSet<Object>();

	public RestApplication() {
		singletons.add(new Test());
		
		
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new java.util.HashSet<>();
		resources.add(JacksonConfig.class);
		// exception mapper
		//resources.add(EntityNotFoundMapper.class);
		return resources;
	}
}
