package pl.kwi.model.abstr;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;

import pl.kwi.model.exceptions.SlingModelsException;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import com.day.cq.wcm.api.components.Component;
import com.day.cq.wcm.api.components.ComponentContext;
import com.day.cq.wcm.api.designer.Design;
import com.day.cq.wcm.api.designer.Designer;
import com.day.cq.wcm.commons.WCMUtils;

public abstract class AbstractSlingModel {
		

	private Resource resource;

	private ResourceResolver resourceResolver;

	private PageManager pageManager;

	private Designer designer;

	private Page currentPage;

	private Design currentDesign;
	
	private Component component;
	
	private SlingHttpServletRequest slingRequest;
	
	private ComponentContext componentContext;
	
	
	public AbstractSlingModel(Resource resource) {
		this.resource = resource;
	}
	
	public AbstractSlingModel(SlingHttpServletRequest slingRequest) {
		this.slingRequest = slingRequest;
		this.resource = slingRequest.getResource();
	}

	
	public Resource getResource() throws SlingModelsException{
		if (resource == null) {
			throw new SlingModelsException("Resource is null");
		}
		return resource;
	}
	
	public SlingHttpServletRequest getSlingRequest() throws SlingModelsException{
		if (slingRequest == null) {
			throw new SlingModelsException("SlingHttpServletRequest is null");
		}
		return slingRequest;
	}

	public ResourceResolver getResourceResolver() throws SlingModelsException {
		if(resourceResolver == null) {
			resourceResolver = getResource().getResourceResolver();
		}
		return resourceResolver;
	}

	public PageManager getPageManager() throws SlingModelsException {
		if (pageManager == null) {
			pageManager = getResourceResolver().adaptTo(PageManager.class);
		}
		return pageManager;
	}

	public Designer getDesigner() throws SlingModelsException {
		if (designer == null) {
			designer = getResourceResolver().adaptTo(Designer.class);
		}
		return designer;
	}

	public Page getCurrentPage() throws SlingModelsException {
		if (currentPage == null) {
			currentPage = getPageManager().getContainingPage(getResource());
		}
		return currentPage;
	}

	public Design getCurrentDesign() throws SlingModelsException {
		if (currentDesign == null) {
			currentDesign = getDesigner().getDesign(getCurrentPage());
		}
		return currentDesign;
	}

	public Component getComponent() throws SlingModelsException {
		if (component == null) {
			component = WCMUtils.getComponent(getResource());
		}
		return component;
	}

	public ComponentContext getComponentContext() throws SlingModelsException {
		if(componentContext == null) {
			componentContext = WCMUtils.getComponentContext(getSlingRequest());
		}
		return componentContext;
	}
	

}
