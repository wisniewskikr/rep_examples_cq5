package pl.kwi.actions;

import java.io.IOException;

import org.apache.commons.lang.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;

public class InputAction {

	/**
	 * Method handles action from Input page.
	 * 
	 * @param request object <code>SlingHttpServletRequest</code> with request from page
	 * @param response object <code>SlingHttpServletResponse</code> with response to page
	 * @param resource object <code>Resource</code> with current page resource
	 * @throws IOException
	 */
	public void handleAction(SlingHttpServletRequest request, SlingHttpServletResponse response, Resource resource) throws IOException {
		
		String errorMessage = getErrorMessage(request);
		System.out.println("---errorMessage: " + errorMessage);
		if(errorMessage != null) {
			String currentPagePath = request.getParameter("currentPagePath");
			System.out.println("---currentPagePath: " + currentPagePath);
			response.sendRedirect(currentPagePath + ".html" + errorMessage);
			return;
		}
		
		String pageAfterAction = null;
		
		try {
			
			ValueMap map = resource.adaptTo(ValueMap.class);
			pageAfterAction = map.get("pageAfterAction", String.class) + ".html";
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		String name = request.getParameter("name");
		response.sendRedirect(pageAfterAction + "?name=" + name);
		
	}
	
	/**
	 * Method gets error field name.
	 * 
	 * @param request object SlingHttpServletRequest with request from browser
	 * @return object String with error field name
	 */
	protected String getErrorMessage(SlingHttpServletRequest request) {
				
		StringBuilder sb = new StringBuilder();		
		
		String name = request.getParameter("name");
		if(StringUtils.isBlank(name)) {
			sb.append("?errorField=name");
			return sb.toString();
		}
		
		return null;
		
	}

}
