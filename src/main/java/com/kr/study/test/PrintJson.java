package com.kr.study.test;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class PrintJson {

	public static void main(String[] args) throws ParseException {

		CreateJson createJson = new CreateJson();

		System.out.println(createJson.jsonObject()); // json 형태

		JSONParser jsonParser = new JSONParser();

		JSONObject jsonObject = (JSONObject)jsonParser.parse(createJson.jsonObject());

		JSONArray jsonPersonsArray = (JSONArray)jsonObject.get("persons");

		System.out.println("Persons");
		for(int i = 0; i < jsonPersonsArray.size(); i++) {
			JSONObject jsonPersonsObject = (JSONObject)jsonPersonsArray.get(i);

			System.out.println("nickname" + ": " + jsonPersonsObject.get("nickname"));
			System.out.println("age" + ": " + jsonPersonsObject.get("age"));
			System.out.println("name" + ": " + jsonPersonsObject.get("name"));
			System.out.println("gender" + ": " + jsonPersonsObject.get("gender"));

		}

		JSONArray jsonBooksArray = (JSONArray)jsonObject.get("books");

		System.out.println("Books");
		for(int i = 0; i < jsonBooksArray.size(); i++) {
			JSONObject jsonBooksObject = (JSONObject)jsonBooksArray.get(i);

			System.out.println("genre" + ": " + jsonBooksObject.get("genre"));
			System.out.println("price" + ": " + jsonBooksObject.get("price"));
			System.out.println("name" + ": " + jsonBooksObject.get("name"));
			System.out.println("writer" + ": " + jsonBooksObject.get("writer"));
			System.out.println("publisher" + ": " + jsonBooksObject.get("publisher"));

		}

	}

}
