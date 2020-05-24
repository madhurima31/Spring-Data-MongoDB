package com.madrun.springmongo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "user_info")
public class User {

	@Id
	private int userId;
	private String name;
	private String bio;
	private String interest;
	List<Follower> followers;
	SocialMediaInfo socialMediaInfo;	

	public User(int userId, String name, String bio, String interest, List<Follower> followers,
			SocialMediaInfo socialMediaInfo) {
		super();
		this.userId = userId;
		this.name = name;
		this.bio = bio;
		this.interest = interest;
		this.followers = followers;
		this.socialMediaInfo = socialMediaInfo;
	}
	public List<Follower> getFollowers() {
		return followers;
	}
	public void setFollowers(List<Follower> followers) {
		this.followers = followers;
	}
	public SocialMediaInfo getSocialMediaInfo() {
		return socialMediaInfo;
	}
	public void setSocialMediaInfo(SocialMediaInfo socialMediaInfo) {
		this.socialMediaInfo = socialMediaInfo;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	} 
	
	

	
}
