package jsonlib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import domain.Province;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Demo {
	//数组
	@Test
	public void f1(){
		String []arr ={"aa","bb","cc"};
		JSONArray json =JSONArray.fromObject(arr);
		System.out.println(json);
	}
	//list
	@Test
	public void f2(){
	List<String> list = new ArrayList<>();
	list.add("11");
	list.add("22");
	list.add("33");
		JSONArray json =JSONArray.fromObject(list);
		System.out.println(json);
	}
	//bean
	@Test
	public void f3(){
		Province province = new Province();
		province.setName("北京");
		province.setProvinceid(1);
		JSONObject json =JSONObject.fromObject(province);
		System.out.println(json);
	}
	//map
	@Test
	public void f4(){
		Map<String,Object> map = new HashMap<>();
		map.put("username", "tom");
		map.put("age", 18);
		JSONObject json =JSONObject.fromObject(map);
		System.out.println(json);
	}
	@Test
	public void f5(){
		List<Province> list = new ArrayList<>();
		list.add(new Province(1,"bj"));
		list.add(new Province(2,"tj"));
		list.add(new Province(3,"nj"));
		list.add(new Province(4,"dj"));
		JSONArray json =JSONArray.fromObject(list);
		System.out.println(json);
	}
	
}
