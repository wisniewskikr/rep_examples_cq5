package pl.kwi.model.output;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import pl.kwi.model.abstr.AbstractSlingModel;

@Model(adaptables=Resource.class)
public class OutputImageModel extends AbstractSlingModel {
		
	
	@Inject
	private String fileReference;
	
	
	public OutputImageModel(Resource resource) {
		super(resource);
	}

	
	public String getFileReference() {
		return fileReference;
	}
	public void setFileReference(String fileReference) {
		this.fileReference = fileReference;
	}	
	
	
}
