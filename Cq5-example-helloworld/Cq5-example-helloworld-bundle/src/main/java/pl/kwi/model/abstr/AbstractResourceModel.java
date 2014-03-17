package pl.kwi.model.abstr;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import com.day.cq.wcm.api.components.Component;
import com.day.cq.wcm.api.designer.Design;
import com.day.cq.wcm.api.designer.Designer;
import com.day.cq.wcm.commons.WCMUtils;

public abstract class AbstractResourceModel {

	
	private Resource resource;

	private ResourceResolver resourceResolver;

	private PageManager pageManager;

	private Designer designer;

	private Page currentPage;

	private Design currentDesign;

	private Component component;
	

	public AbstractResourceModel(Resource resource) {
		super();
		this.resource = resource;
		setUp();
	}
	
	
	protected void setUp() {
		resourceResolver = resource.getResourceResolver();
		pageManager = resourceResolver.adaptTo(PageManager.class);
		designer = resourceResolver.adaptTo(Designer.class);
		currentPage = pageManager.getContainingPage(resource);
		currentDesign = designer.getDesign(currentPage);
		component = WCMUtils.getComponent(resource);
	}
	

	public Resource getResource() {
		return resource;
	}

	public ResourceResolver getResourceResolver() {
		return resourceResolver;
	}

	public PageManager getPageManager() {
		return pageManager;
	}

	public Designer getDesigner() {
		return designer;
	}

	public Page getCurrentPage() {
		return currentPage;
	}

	public Design getCurrentDesign() {
		return currentDesign;
	}

	public Component getComponent() {
		return component;
	}
	

}
