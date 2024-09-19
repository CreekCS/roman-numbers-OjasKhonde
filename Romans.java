//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ojas Khonde

import java.util.*;

public class Romans
{
	private Map<String, Integer> map;
	
	public Romans()
	{
		map = new TreeMap<String, Integer>();
		
		//complete your map
		map.put("I",1);	
		map.put("V",5);
		map.put("X",10);	
		map.put("L",50);
		map.put("C",100);
		map.put("D",500);
		map.put("M",1000);	
	
	}
	
	public int getNumber( String s )
	{
		//complete this method
		if(map.containsKey(s))
		{
			return map.get(s);
		}
		else
		{
			return -1;
		}
	}
}
