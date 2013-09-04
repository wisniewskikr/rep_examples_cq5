package pl.kwi.services;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;

@Service(value = IResourceService.class)
@Component(immediate = true)
public class ResourceService implements IResourceService {
	
	@Reference
	private INodeService nodeService;
		
	
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
	
	/* (non-Javadoc)
	 * @see pl.kwi.utils.IResourceService#getResPropWithDefaultValue(org.apache.sling.api.resource.Resource, java.lang.String, java.lang.String)
	 */
	public String getResPropWithDefaultValue(Resource resource, String propertyName, String defaultValue) {
		
		String result = getResourceProperty(resource, propertyName);
		
		try {
			
			if (result == null) {
				result = defaultValue;
				nodeService.updateNode(resource.getPath(), propertyName, defaultValue);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		return result;
		
	}
	
	/* (non-Javadoc)
	 * @see pl.kwi.utils.IResourceService#getResourcePropertyFromChild(org.apache.sling.api.resource.Resource, java.lang.String, java.lang.String)
	 */
	public String getResourcePropertyFromChild(Resource resource, String propertyName, String relPath) {
		
		Resource child = resource.getChild(relPath);
		return getResourceProperty(child, propertyName);
		
	}
	

}
