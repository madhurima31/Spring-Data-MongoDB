package com.madrun.springmongo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Document
@NoArgsConstructor
public class SocialMediaAccount {
	String accountType;
	int noOfFollowers;
	public SocialMediaAccount(String accountType, int noOfFollowers) {
		super();
		this.accountType = accountType;
		this.noOfFollowers = noOfFollowers;
	}
	public SocialMediaAccount() {
		super();
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getNoOfFollowers() {
		return noOfFollowers;
	}
	public void setNoOfFollowers(int noOfFollowers) {
		this.noOfFollowers = noOfFollowers;
	}

	
}
