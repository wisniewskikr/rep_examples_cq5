package pl.kwi.model.output;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables=Resource.class)
public class OutputSubtitleModel {
	
	
	@Inject
	private String textPage;

	@Inject
	private String textOutput;

	
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
