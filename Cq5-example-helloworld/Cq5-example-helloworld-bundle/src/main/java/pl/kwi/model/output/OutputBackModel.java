package pl.kwi.model.output;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;

import pl.kwi.model.abstr.AbstractSlingModel;
import pl.kwi.model.exceptions.SlingModelsException;


@Model(adaptables=Resource.class)
public class OutputBackModel extends AbstractSlingModel {
		
	
	@Inject
	private String textBack;
	
	@Inject
	private String backHint;
	
	@Inject @Default
	private String backTarget;
	
	private boolean backTargetEmpty;
	
	
	public OutputBackModel(Resource resource) {
		super(resource);
	}

	
	@PostConstruct
	public void init() throws SlingModelsException {
		
		backTargetEmpty = false;
		
		if("".equals(backTarget)) {
			backTargetEmpty = true;			
			backTarget = getCurrentPage().getPath();
		}
		
		backTarget = getResourceResolver().map(backTarget);		
		
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
