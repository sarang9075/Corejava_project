package com.controlflow;

public class CalculateMarks {
public static void main(String[] args) {
	int mark = 55;
	if (mark >= 90 && mark <= 100) {
	System.out.println("Grade A");
} else if (mark >= 80 && mark <= 89) { 
	System.out.println("Grade B");
} else if (mark >= 70 && mark <= 79) {
	System.out.println("Grade C");
} else if (mark >= 60 && mark <= 69) {
	System.out.println("Grade D");
}else if (mark >= 50 && mark >= 59) {
	System.out.println("Grade E");
} else {
	System.out.println("student is fail........!");
}
}
}