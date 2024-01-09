package map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMap1 {

    public static void main(String[] args) {

        //HashMap 객체 선언할 때 key&value 타입 지정을 안하면 Object가 default
        //값 꺼낼 때 type casting으로 인한 불편함

        HashMap hm = new HashMap();
        hm.put("강아지","조나단");
        hm.put("고양이","잭슨");

        String animal = (String) hm.get("강아지");
//        hm.remove("강아지");
        System.out.println(animal);
        boolean result = false;

        if(hm.containsKey("늑대")){
            hm.remove("늑대");
        }else{
            hm.put("늑대","루이스");
        }
        //어쨋든 맵 타입은 꼭 지정하자 ** <- 가끔 실수하는 것


    }





}
