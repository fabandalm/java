package com.falmeida.tech;

import java.util.ArrayList;
import java.util.List;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class JavaSparkMappingEx01 {

	public static void main(String[] args) {
		
		SparkConf conf = new SparkConf().setAppName("JavaSparkMappingEx01").setMaster("local[*]");
		
		JavaSparkContext sc = new JavaSparkContext(conf);
		
		List<Integer> list = new ArrayList<>();
		
		list.add(4);
		list.add(9);
		list.add(16);
		list.add(25);
		
		JavaRDD<Integer> sampleRDD = sc.parallelize(list);
		
		JavaRDD<Double> mapSampleRDD = sampleRDD.map(value -> Math.sqrt(value));
		
		//mapSampleRDD.foreach(value -> System.out.println(value));
		
		//It Throws Not Serialization Exception
		//mapSampleRDD.foreach(System.out::println);
		
		mapSampleRDD.collect().forEach(System.out::println);
		
		sc.close();
		
	}
	
}
