package org.howard.edu.lsp.finalExam;

import java.util.HashMap;
import java.util.Map;
public class MapUtilities {public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2)
		throws NullPointerException {
	int count = 0;
	for (Map.Entry<String, String> mapElement : map1.entrySet()) {
	String key = mapElement.getKey();
	String value = mapElement.getValue();
	if (map2.containsKey(key)) {
	String secondvalue = map2.get(key);
	if (value.equals(secondvalue)) {
	count++;
	}
	}
	}
	return count;
	}
	}


