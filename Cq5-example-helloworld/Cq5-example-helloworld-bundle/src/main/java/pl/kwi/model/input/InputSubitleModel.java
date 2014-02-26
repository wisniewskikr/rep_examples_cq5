package pl.kwi.model.input;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables=Resource.class)
public class InputSubitleModel {
	
	
	@Inject
	private String textPage;

	@Inject
	private String textInput;

	
	public String getTextPage() {
		return textPage;
	}
	public void setTextPage(String textPage) {
		this.textPage = textPage;
	}

	public String getTextInput() {
		return textInput;
	}
	public void setTextInput(String textInput) {
		this.textInput = textInput;
	}
	
		
}
