package com.simha.SpringJPADemoForQueryResults;

import java.util.function.Predicate;

public class PredicateTest implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		
		if(t%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	
	

}
