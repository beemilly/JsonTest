package com.kr.study.test;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreateJson {

		public String jsonObject() {

			JSONObject jsonObject = new JSONObject();

			JSONArray personArray = new JSONArray();

			JSONObject personInfo = new JSONObject();

	        personInfo.put("name", "송강호");
	        personInfo.put("age", "25");
	        personInfo.put("gender", "남자");
	        personInfo.put("nickname", "남궁민수");
	        personArray.add(personInfo);

	        personInfo = new JSONObject();
	        personInfo.put("name", "전지현");
	        personInfo.put("age", "21");
	        personInfo.put("gender", "여자");
	        personInfo.put("nickname", "예니콜");
	        personArray.add(personInfo);

	        jsonObject.put("persons", personArray);

	        JSONArray bookArray = new JSONArray();

	        JSONObject bookInfo = new JSONObject();

	        bookInfo.put("name", "사람은 무엇으로 사는가?");
	        bookInfo.put("writer", "톨스토이");
	        bookInfo.put("price", "100");
	        bookInfo.put("genre", "소설");
	        bookInfo.put("publisher", "톨스토이 출판사");
	        bookArray.add(bookInfo);

	        bookInfo = new JSONObject();
	        bookInfo.put("name", "홍길동전");
	        bookInfo.put("writer", "허균");
	        bookInfo.put("price", "300");
	        bookInfo.put("genre", "소설");
	        bookInfo.put("publisher", "허균 출판사");
	        bookArray.add(bookInfo);

	        bookInfo = new JSONObject();
	        bookInfo.put("name", "레미제라블");
	        bookInfo.put("writer", "빅토르 위고");
	        bookInfo.put("price", "900");
	        bookInfo.put("genre", "소설");
	        bookInfo.put("publisher", "빅토르 위고 출판사");
	        bookArray.add(bookInfo);

	        jsonObject.put("books", bookArray);

	        String json = jsonObject.toJSONString();

	        return json;
		}

		// JSON 형식으로 할 시
//		{
//		    "books": [
//		        {
//		            "genre": "소설",
//		            "price": "100",
//		            "name": "사람은 무엇으로 사는가?",
//		            "writer": "톨스토이",
//		            "publisher": "톨스토이 출판사"
//		        },
//		        {
//		            "genre": "소설",
//		            "price": "300",
//		            "name": "홍길동전",
//		            "writer": "허균",
//		            "publisher": "허균 출판사"
//		        },
//		        {
//		            "genre": "소설",
//		            "price": "900",
//		            "name": "레미제라블",
//		            "writer": "빅토르 위고",
//		            "publisher": "빅토르 위고 출판사"
//		        }
//		    ],
//		    "persons": [
//		        {
//		            "nickname": "남궁민수",
//		            "age": "25",
//		            "name": "송강호",
//		            "gender": "남자"
//		        },
//		        {
//		            "nickname": "예니콜",
//		            "age": "21",
//		            "name": "전지현",
//		            "gender": "여자"
//		        }
//		    ]
//		}


}
