package com.qa.util;
import com.google.gson.Gson;

public class JSONUtil {

	private Gson gson;
	
	public JSONUtl() {
		this.gson = new Gson();
	}
	
	public String getJSONForObject(Object Obj) {
		return gson.toJson(obj);
	}
	
	public <T> T getObjectForJSON(String jsonString, Class<T> clazz) {
		return gson.fromJson(jsonString,clazz);
	}
	
}
