package com.simha.SpringJPADemoForQueryResults;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSorting {
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "jak");
		map.put(7, "steven");
		map.put(3, "goky");

		List<Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());
		Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());

		}
		
		entries.stream().sorted(Map.Entry.comparingByValue()).forEach((Obj)->System.out.println(Obj));

	}

}
