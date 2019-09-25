package com.example.demo.dto;

public class ResponseModelMapper {

		private String name;
		private String mobileNumber;
		private String email;
		private String skills;
		public ResponseModelMapper() {
			super();
		} 
		public ResponseModelMapper(String name, String mobileNumber, String email, String skills) {
			super();
			this.name = name;
			this.mobileNumber = mobileNumber;
			this.email = email;
			this.skills = skills;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getSkills() {
			return skills;
		}
		public void setSkills(String skills) {
			this.skills = skills;
		}
		
		
	}


