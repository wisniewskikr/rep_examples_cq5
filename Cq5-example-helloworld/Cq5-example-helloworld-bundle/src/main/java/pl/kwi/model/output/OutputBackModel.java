package pl.kwi.model.output;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables=Resource.class)
public class OutputBackModel {
	
	
	@Inject
	private String textBack;
	
	@Inject
	private String backHint;

	
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
	
	
}
