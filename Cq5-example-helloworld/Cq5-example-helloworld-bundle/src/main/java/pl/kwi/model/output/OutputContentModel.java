package pl.kwi.model.output;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;

@Model(adaptables=SlingHttpServletRequest.class)
public class OutputContentModel {
	
	
	@Inject @Via("resource")
	private String textHelloWorld;
	
	private SlingHttpServletRequest request;
	
	private String name;
	
	
	public OutputContentModel(SlingHttpServletRequest request) {
		this.request = request;
	}
	
	
	@PostConstruct
	public void init() {
		name = request.getParameter("name");
	}
	
	
	public String getTextHelloWorld() {
		return textHelloWorld;
	}
	public void setTextHelloWorld(String textHelloWorld) {
		this.textHelloWorld = textHelloWorld;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	
	
}
