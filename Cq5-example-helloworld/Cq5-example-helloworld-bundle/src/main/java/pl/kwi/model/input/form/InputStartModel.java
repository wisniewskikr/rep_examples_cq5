package pl.kwi.model.input.form;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import pl.kwi.model.abstr.AbstractResourceModel;

@Model(adaptables=Resource.class)
public class InputStartModel extends AbstractResourceModel {
	
		
	@Inject
	private String pageAfterAction;
	
	
	public InputStartModel(Resource resource) {
		super(resource);
	}

	
	public String getPageAfterAction() {
		return pageAfterAction;
	}
	public void setPageAfterAction(String pageAfterAction) {
		this.pageAfterAction = pageAfterAction;
	}
	
			
}
