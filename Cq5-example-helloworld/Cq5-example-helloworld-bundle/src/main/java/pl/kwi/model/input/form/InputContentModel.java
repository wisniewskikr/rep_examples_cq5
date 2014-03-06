package pl.kwi.model.input.form;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;

@Model(adaptables=SlingHttpServletRequest.class)
public class InputContentModel {
	
	
	@Inject @Via("resource")
	private String textName;

	@Inject @Via("resource")
	private String nameErrorMessage;
	
	@Inject @Via("resource")
	private String nameDescription;
	
	private String currentPagePath;
	
	private String errorField;
	
	private SlingHttpServletRequest request;
	
	private Resource resource;
	
	private ResourceResolver resourceResolver;
	
	
	public InputContentModel(SlingHttpServletRequest request) {
		this.request = request;
		this.resource = request.getResource();
		this.resourceResolver = resource.getResourceResolver();
	}
	
	
	@PostConstruct
	public void init() {
		PageManager pageManager = resourceResolver.adaptTo(PageManager.class);
		Page page = pageManager.getContainingPage(resource);
		currentPagePath = page.getPath();
		errorField = request.getParameter("errorField");
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
