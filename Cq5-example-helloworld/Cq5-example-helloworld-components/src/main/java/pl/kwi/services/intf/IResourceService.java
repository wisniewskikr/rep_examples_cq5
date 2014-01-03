package pl.kwi.services.intf;

import org.apache.sling.api.resource.Resource;

public interface IResourceService {
	

	/**
	 * Method gets property with specified name from resource.
	 * 
	 * @param resource object Resource containing property
	 * @param propertyName object String with property specified name
	 * @return object String with value of property with specified name
	 */
	public String getResourceProperty(Resource resource, String propertyName);


}