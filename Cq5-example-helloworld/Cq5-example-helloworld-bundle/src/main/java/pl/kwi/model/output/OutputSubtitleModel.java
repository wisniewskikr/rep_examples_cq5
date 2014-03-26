package pl.kwi.model.output;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import pl.kwi.model.abstr.AbstractSlingModel;

@Model(adaptables=Resource.class)
public class OutputSubtitleModel extends AbstractSlingModel {
		
	
	@Inject
	private String textPage;

	@Inject
	private String textOutput;
	
	
	public OutputSubtitleModel(Resource resource) {
		super(resource);
	}

	
	public String getTextPage() {
		return textPage;
	}
	public void setTextPage(String textPage) {
		this.textPage = textPage;
	}
	
	public String getTextOutput() {
		return textOutput;
	}
	public void setTextOutput(String textOutput) {
		this.textOutput = textOutput;
	}
	
		
}
