package com.example.demo.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
		
		private int sid;
		private String sname;
		private double cgpa;
		
//		public Student(int sid, String sname, double cgpa) {
//			super();
//			this.sid = sid;
//			this.sname = sname;
//			this.cgpa = cgpa;
//		}
//		public int getSid() {
//			return sid;
//		}	
//		public void setSid(int sid) {
//			this.sid = sid;
//		}
//		public String getSname() {
//			return sname;
//		}
//		public void setSname(String sname) {
//			this.sname = sname;
//		}
//		public double getCgpa() {
//			return cgpa;
//		}
//		
//		public void setCgpa(double cgpa) {
//			this.cgpa = cgpa;
//		}
//		@Override
//		public String toString() {
//			return "Student [sid=" + sid + ", sname=" + sname + ", cgpa=" + cgpa + "]";
//		}
//		
//		
}
