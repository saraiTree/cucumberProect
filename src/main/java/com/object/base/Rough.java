package com.object.base;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class Rough 
{
@Test
public void test1()
{
	SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
	Date d = new Date();
	System.out.println("date:"+sdf.format(d));
	
}
}
