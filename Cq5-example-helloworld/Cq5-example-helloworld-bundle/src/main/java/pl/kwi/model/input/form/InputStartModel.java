package pl.kwi.model.input.form;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables=Resource.class)
public class InputStartModel {
	
	
	@Inject
	private String pageAfterAction;
	
	private boolean existsResourceContent;
	
	private boolean existsResourceSubmit;
	
	private Resource resource;
	
	
	public InputStartModel(Resource resource) {
		this.resource = resource;
	}
	
	
	@PostConstruct
	public void init() {
		setExistsResourceContent(existsResourceInForm("content"));
		setExistsResourceSubmit(existsResourceInForm("submit"));		
	}
	
	/**
	 * Method checks if resource with specified name exists in form.
	 * 
	 * @param resourceName object <code>String</code> with specified name of resource
	 * @return true if resource exists in form. Otherwise returns false.
	 */
	private boolean existsResourceInForm(String resourceName) {
				
		boolean result = false;
		Resource res = null;
		try {
			res = resource.getParent().getChild(resourceName);
		} catch (Exception e) {}
		
		if(res != null) {
			result = true;
		}
		
		return result;
		
	}

	
	public String getPageAfterAction() {
		return pageAfterAction;
	}
	public void setPageAfterAction(String pageAfterAction) {
		this.pageAfterAction = pageAfterAction;
	}

	public boolean isExistsResourceContent() {
		return existsResourceContent;
	}
	public void setExistsResourceContent(boolean existsResourceContent) {
		this.existsResourceContent = existsResourceContent;
	}

	public boolean isExistsResourceSubmit() {
		return existsResourceSubmit;
	}
	public void setExistsResourceSubmit(boolean existsResourceSubmit) {
		this.existsResourceSubmit = existsResourceSubmit;
	}	
	
			
}
