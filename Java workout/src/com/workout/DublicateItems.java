package com.workout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DublicateItems {
public static void main(String[] args) {
	String arr1[]={"aa","bb","cc","aa","dd","cc"};
List<String> strList = new ArrayList<String>();
strList.addAll(Arrays.asList(arr1));
Set<String> uniquWords = new HashSet<>(strList);
for(String word : uniquWords){
	System.out.println(word + ":" + Collections.frequency(strList,word));
	
}

}
}
