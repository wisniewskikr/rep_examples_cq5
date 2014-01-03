package pl.kwi.services.impl;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;

import pl.kwi.services.intf.IResourceService;

@Service(value = IResourceService.class)
@Component(immediate = true)
public class ResourceService implements IResourceService {
	
	
	/* (non-Javadoc)
	 * @see pl.kwi.utils.IResourceService#getResourceProperty(org.apache.sling.api.resource.Resource, java.lang.String)
	 */
	public String getResourceProperty(Resource resource, String propertyName) {
		
		String result = null;
		
		try {
			
			if(resource == null) {
				throw new Exception("There is no resorce for property: " + propertyName);
			}
			
			ValueMap map = resource.adaptTo(ValueMap.class);
			
			if(map == null) {
				throw new Exception("There is no properties in resource: " + resource.getPath() + " and property: " + propertyName);
			}
			
			result = (String)map.get(propertyName);			
			
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		return result;
		
	}
	

}
