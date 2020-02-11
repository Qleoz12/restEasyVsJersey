package restEasy;

import javax.servlet.ServletContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import commons.TurnoPersonaDTOWrapper;



@Path("/test")
public class Test {


		private static final Logger logger = LoggerFactory.getLogger(Test.class);

		@Context
		private ServletContext context;
		
		@POST
		@Path("/tetsPost")
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		public Response checkRequest(TurnoPersonaDTOWrapper model) 
		{
			CacheControl cc = new CacheControl();
    	    cc.setMaxAge(86400);
    	    cc.setNoTransform(false);
    	    cc.setPrivate(false);
    	    
    	    ResponseBuilder builder = Response.ok().entity(model);
    	    builder.cacheControl(cc);
    	    return builder.build();    	    
		}
}
