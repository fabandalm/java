package com.falmeida.tech;

import java.util.ArrayList;
import java.util.List;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import scala.Tuple2;

public class JavaSparkTuplesEx02 {

	public static void main(String[] args) {
		
		SparkConf conf = new SparkConf().setAppName("JavaSparkTuplesEx01").setMaster("local[*]");
		
		JavaSparkContext sc = new JavaSparkContext(conf);
		
		List<Integer> list = new ArrayList<>();
		
		list.add(4);
		list.add(9);
		list.add(16);
		list.add(25);
		
		JavaRDD<Integer> sampleRDD = sc.parallelize(list);
		
		JavaRDD<Tuple2<Integer,Double>> myTuplesRDD = sampleRDD.map(value -> new Tuple2<>(value, Math.sqrt(value)));
		
		myTuplesRDD.foreach(value -> System.out.println(value._1 + "," + value._2));
		
		sc.close();
		
	}
	
}
