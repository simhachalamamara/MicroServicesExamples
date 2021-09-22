package com.simha.SpringJPADemoForQueryResults;

import java.util.HashMap;
import java.util.Map;

import ch.qos.logback.core.net.SyslogOutputStream;

public class Test {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Simhachalam");
		map.put(2, "Ramarao");
		map.put(3, "John");
		map.put(4, "rodges");
		map.put(5, "yesd");

		// map.forEach((key,value)->System.out.println(key+" " + value));
		map.entrySet().stream().filter(p -> p.getKey() % 2 == 0).forEach((obj) -> System.out.println(obj));

	}

}
