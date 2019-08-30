package com.falmeida.tech;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

import scala.Tuple2;

public class JavaSparkTuplesEx01 {

	public static void main(String[] args) {
		
		SparkConf conf = new SparkConf().setAppName("JavaSparkTuplesEx01").setMaster("local[*]");
		
		JavaSparkContext sc = new JavaSparkContext(conf);
		
		Tuple2<Integer,Double> myTuple2 = new Tuple2<>(1,5.9);
		
		System.out.println(myTuple2);
		
		sc.close();
		
	}
	
}
