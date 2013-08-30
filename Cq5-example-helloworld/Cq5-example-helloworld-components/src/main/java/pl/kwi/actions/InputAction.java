package pl.kwi.actions;

import java.io.IOException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;

public class InputAction {

	public void handleAction(SlingHttpServletRequest request, SlingHttpServletResponse response, Resource resource) throws IOException {
		
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

}
