package pl.kwi.model.input.form;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import pl.kwi.model.abstr.AbstractSlingModel;

@Model(adaptables=Resource.class)
public class InputSubmitModel extends AbstractSlingModel {
		
	
	@Inject
	private String textSubmit;

	@Inject
	private String submitHint;
	
	
	public InputSubmitModel(Resource resource) {
		super(resource);
	}

	
	public String getTextSubmit() {
		return textSubmit;
	}
	public void setTextSubmit(String textSubmit) {
		this.textSubmit = textSubmit;
	}

	public String getSubmitHint() {
		return submitHint;
	}
	public void setSubmitHint(String submitHint) {
		this.submitHint = submitHint;
	}
	
		
}
