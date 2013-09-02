package pl.kwi.services;

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

	/**
	 * Method gets property with specified name from resource. If property does not exist
	 * then default value is returned.
	 * 
	 * @param resource object Resource containing property
	 * @param propertyName object String with property specified name
	 * @param defaultValue object String with default value of property
	 * @return object String with value of property with specified name. If property does not exist
	 * then default value is returned. 
	 */
	public String getResPropWithDefaultValue(Resource resource, String propertyName, String defaultValue);

	/**
	 * Method gets property with specified name from child of resource.
	 * 
	 * @param resource object Resource containing child with property
	 * @param propertyName object String with property specified name
	 * @param relPath object String with relative path to child Resource
	 * @return object String with property value
	 */
	public String getResourcePropertyFromChild(Resource resource, String propertyName, String relPath);

}