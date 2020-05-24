package com.madrun.springmongo.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Document
@NoArgsConstructor
public class SocialMediaInfo {



	List<SocialMediaAccount> socialMediaAccounts;
	public SocialMediaInfo() {
		super();
	}
	public SocialMediaInfo(List<SocialMediaAccount> socialMediaAccounts) {
		super();
		this.socialMediaAccounts = socialMediaAccounts;
	}
	public List<SocialMediaAccount> getSocialMediaAccounts() {
		return socialMediaAccounts;
	}

	public void setSocialMediaAccounts(List<SocialMediaAccount> socialMediaAccounts) {
		this.socialMediaAccounts = socialMediaAccounts;
	}

	

}
