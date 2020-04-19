package com.company;
import com.company.test.test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class Main {

    public static void main(String[] args) {
	// write your code here
        test1 test = new test1();
        System.out.println("hello worlds");
        System.out.println(test.getMsg("ABCD"));

        ArrayList<HashMap> list = new ArrayList();
        HashMap<String,String> map = new HashMap();
        map.put("id","1");
        map.put("name","charles");
        map.put("sex","男");
        list.add(map);

        for (HashMap map2:list) {
            System.out.println(map2.get("id"));
            System.out.println(map2.get("name"));
            System.out.println(map2.get("sex"));
        }
        System.out.println("1234567890123110099");
        System.out.println("你好，中国！");






    }
}
