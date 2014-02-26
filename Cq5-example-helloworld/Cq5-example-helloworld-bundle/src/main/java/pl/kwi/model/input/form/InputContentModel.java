package pl.kwi.model.input.form;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables=Resource.class)
public class InputContentModel {
	
	
	@Inject
	private String textName;

	@Inject
	private String nameErrorMessage;
	
	@Inject
	private String nameDescription;

	
	public String getTextName() {
		return textName;
	}
	public void setTextName(String textName) {
		this.textName = textName;
	}

	public String getNameErrorMessage() {
		return nameErrorMessage;
	}
	public void setNameErrorMessage(String nameErrorMessage) {
		this.nameErrorMessage = nameErrorMessage;
	}

	public String getNameDescription() {
		return nameDescription;
	}
	public void setNameDescription(String nameDescription) {
		this.nameDescription = nameDescription;
	}	
	
		
}
