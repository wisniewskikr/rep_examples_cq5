package pl.kwi.model.input.form;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables=Resource.class)
public class InputStartModel {
	
	
	@Inject
	private String pageAfterAction;

	
	public String getPageAfterAction() {
		return pageAfterAction;
	}
	public void setPageAfterAction(String pageAfterAction) {
		this.pageAfterAction = pageAfterAction;
	}
	
			
}
