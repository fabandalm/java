package com.falmeida.tech;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class JavaSparkReduceEx01 {

	public static void main(String[] args) {
		
		List<Double> list = new ArrayList<>();
		list.add(10.75);
		list.add(32.75);
		list.add(85.25);
		list.add(10.25);
		
		System.setProperty("hadoop.home.dir", "C:\\hadoop_win\\bin");
		
		Logger.getLogger("org.apache").setLevel(Level.WARN);
				
		SparkConf conf = new SparkConf().setAppName("basicSpark").setMaster("local[*]");
		
		JavaSparkContext sc = new JavaSparkContext(conf);
		
		JavaRDD<Double> sampleRDD = sc.parallelize(list);
		
		Double result = sampleRDD.reduce((value1, value2) -> value1 + value2);
		
		System.out.println();
		
		System.out.println(result);
		
		sc.close();
		
	}
	
}
