package pl.kwi.model.output;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;

@Model(adaptables=Resource.class)
public class OutputBackModel {
	
	
	@Inject
	private String textBack;
	
	@Inject
	private String backHint;
	
	@Inject @Default
	private String backTarget;
	
	private boolean backTargetEmpty;
	
	private Resource resource;
	
	private ResourceResolver resourceResolver;
	
	
	public OutputBackModel(Resource resource) {
		this.resource = resource;
		this.resourceResolver = resource.getResourceResolver();
	}

	
	@PostConstruct
	public void init() {
		
		backTargetEmpty = false;
		
		if("".equals(backTarget)) {
			backTargetEmpty = true;
			PageManager pageManager = resourceResolver.adaptTo(PageManager.class);
			Page page = pageManager.getContainingPage(resource);
			backTarget = page.getPath();
		}
		
		backTarget = resourceResolver.map(backTarget);		
		
	}
	
	
	public String getTextBack() {
		return textBack;
	}
	public void setTextBack(String textBack) {
		this.textBack = textBack;
	}

	public String getBackHint() {
		return backHint;
	}
	public void setBackHint(String backHint) {
		this.backHint = backHint;
	}	

	public String getBackTarget() {
		return backTarget;
	}
	public void setBackTarget(String backTarget) {
		this.backTarget = backTarget;
	}

	public boolean isBackTargetEmpty() {		
		return backTargetEmpty;
	}
	public void setBackTargetEmpty(boolean backTargetEmpty) {
		this.backTargetEmpty = backTargetEmpty;
	}	
	
	
}
