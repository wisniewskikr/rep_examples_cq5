package pl.kwi.model.output;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;

import pl.kwi.model.abstr.AbstractSlingModel;
import pl.kwi.model.exceptions.SlingModelsException;

@Model(adaptables=SlingHttpServletRequest.class)
public class OutputContentModel extends AbstractSlingModel {
		
	
	@Inject @Via("resource")
	private String textHelloWorld;
	
	private String name;
	
	
	public OutputContentModel(SlingHttpServletRequest slingRequest) {
		super(slingRequest);
	}
	
	
	@PostConstruct
	public void init() throws SlingModelsException {
		name = getSlingRequest().getParameter("name");
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
