package com.falmeida.tech;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

public class JavaSparkTemplate {

	public static void main(String[] args) {
		
		SparkConf conf = new SparkConf().setAppName("SparkTemplate").setMaster("local[*]");
		
		JavaSparkContext sc = new JavaSparkContext(conf);
		
		sc.close();
		
	}
	
}
