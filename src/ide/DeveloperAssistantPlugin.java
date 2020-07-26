package ide;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class DeveloperAssistantPlugin {
	
	public static List<String> getSuggestions(Class<?> sourceClass){
		
		List<String> resultList = new ArrayList<>();
		
		for (Method methods : sourceClass.getMethods()) {
			String method = methods.toString();
			if (!method.contains(sourceClass.getClass().getPackageName()))
                resultList.add(method);
		}

		return resultList;
    }
}
