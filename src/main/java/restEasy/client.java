package restEasy;

import javax.ws.rs.client.WebTarget;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JSR310Module;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

public enum client {
	INSTANCE;
	private ResteasyClient clientweb;
	private WebTarget target;
	private String url;

	private client() {
		System.out.println("---------- i am called!");
		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new JSR310Module());
		JacksonJsonProvider provider = new JacksonJsonProvider(mapper);
		clientweb = new ResteasyClientBuilder()
						.register(provider)
						.build();
	}

	
	public WebTarget getTarget() {
		return target;
	}

	public void setTarget(WebTarget target) {
		this.target = target;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}


	public ResteasyClient getClientweb() {
		return clientweb;
	}


	public void setClientweb(ResteasyClient clientweb) {
		this.clientweb = clientweb;
	}
	
	

}
