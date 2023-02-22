package Intro;

public class Assignment1 {
	static float avg(float a , float b) {
		return (a+b)/2;
	}
	static float avg (float a , float b, float c) {
		return (a+b+c)/3;
	}
	static float avg (float a , float b, float c,float d) {
		return (a+b+c+d)/4;
	}
	static float avg (float a , float b, float c,float d , float e) {
		return (a+b+c+d+e)/5;
	}
	public static void main(String[] args) {
		float avg = Assignment1.avg(40f,4f,2f);
		System.out.println(avg);
		
		System.out.println(Math.round(avg*100)/100);
	}
}
