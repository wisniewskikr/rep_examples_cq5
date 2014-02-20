package pl.kwi.utils;

import org.apache.sling.api.resource.Resource;

public class FormUtil {
	
	
	private FormUtil() {}
	
	
	/**
	 * Method gets model with result - if component with specified name exists.
	 * 
	 * @param resource object <code>Resource</code> with resource from page
	 * @param componentName object <code>String</code> with component`s name
	 * @return object <code>FormUtilModel</code> with model of data from FromUtil
	 */
	public static FormUtilModel getModelWithResultComponentExist(Resource resource, String componentName) {
				
		Resource res = null;
		try {
			res = resource.getParent().getChild(componentName);
		} catch (Exception e) {}
		
		if(res == null) {
			return new FormUtilModel(false);
		}else {
			return new FormUtilModel(true);
		}
		
	}

}
