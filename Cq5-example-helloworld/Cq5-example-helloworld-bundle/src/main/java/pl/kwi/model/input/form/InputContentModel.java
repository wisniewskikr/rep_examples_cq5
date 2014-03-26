package pl.kwi.model.input.form;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;

import pl.kwi.model.abstr.AbstractSlingModel;
import pl.kwi.model.exceptions.SlingModelsException;


@Model(adaptables=SlingHttpServletRequest.class)
public class InputContentModel extends AbstractSlingModel {
		
	
	@Inject @Via("resource")
	private String textName;

	@Inject @Via("resource")
	private String nameErrorMessage;
	
	@Inject @Via("resource")
	private String nameDescription;
	
	private String currentPagePath;
	
	private String errorField;
		
	
	public InputContentModel(SlingHttpServletRequest slingRequest) {
		super(slingRequest);
	}
	
	
	@PostConstruct
	public void init() throws SlingModelsException {		
		currentPagePath = getCurrentPage().getPath();
		errorField = getSlingRequest().getParameter("errorField");
	}

	
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

	public String getCurrentPagePath() {
		return currentPagePath;
	}
	public void setCurrentPagePath(String currentPagePath) {
		this.currentPagePath = currentPagePath;
	}

	public String getErrorField() {
		return errorField;
	}
	public void setErrorField(String errorField) {
		this.errorField = errorField;
	}	
		
		
}
