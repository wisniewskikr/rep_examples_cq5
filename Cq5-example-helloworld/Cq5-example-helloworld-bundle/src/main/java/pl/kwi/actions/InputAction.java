package pl.kwi.actions;

import java.io.IOException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;

public class InputAction {
	
	
	private InputAction() {}
	

	/**
	 * Method handles action from Input page.
	 * 
	 * @param request object <code>SlingHttpServletRequest</code> with request from page
	 * @param response object <code>SlingHttpServletResponse</code> with response to page
	 * @param resource object <code>Resource</code> with current page resource
	 * @throws IOException
	 */
	public static void handleAction(SlingHttpServletRequest request, SlingHttpServletResponse response, Resource resource) throws IOException {
		
		String errorMessage = getErrorMessage(request);
		if(errorMessage != null) {
			String currentPagePath = request.getParameter("currentPagePath");
			String path = request.getResourceResolver().map(currentPagePath);
			response.sendRedirect(path + ".html" + errorMessage);
			return;
		}
		
		String path = null;
		
		try {
			
			ValueMap map = resource.adaptTo(ValueMap.class);
			String pageAfterAction = map.get("pageAfterAction", String.class) + ".html";
			path = request.getResourceResolver().map(pageAfterAction);
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		String name = request.getParameter("name");
		response.sendRedirect(path + "?name=" + name);
		
	}
	
	/**
	 * Method gets error field name.
	 * 
	 * @param request object SlingHttpServletRequest with request from browser
	 * @return object String with error field name
	 */
	protected static String getErrorMessage(SlingHttpServletRequest request) {
				
		StringBuilder sb = new StringBuilder();		
		
		String name = request.getParameter("name");
		// TODO
		//if(StringUtils.isBlank(name)) {
		if (name == null || "".equals(name)) {	
			sb.append("?errorField=name");
			return sb.toString();
		}
		
		return null;
		
	}

}
