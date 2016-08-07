package com.mns;

import java.sql.Date;

public class Bizkey {
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public int getKeyType() {
		return KeyType;
	}
	public void setKeyType(int keyType) {
		KeyType = keyType;
	}
	public String getRelease() {
		return Release;
	}
	public void setRelease(String release) {
		Release = release;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getTeam() {
		return Team;
	}
	public void setTeam(String team) {
		Team = team;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public int getSynchedWithRepo() {
		return synchedWithRepo;
	}
	public void setSynchedWithRepo(int synchedWithRepo) {
		this.synchedWithRepo = synchedWithRepo;
	}
	long id;
	String key;
	String value;
	String store;
	String group;
	String information;
	int KeyType;
	String Release;
	String owner;
	
	String Team;
	
	Date createdDate;
	Date updatedDate;
	int synchedWithRepo;
	
	

}
