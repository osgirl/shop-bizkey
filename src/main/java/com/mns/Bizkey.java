package com.mns;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bizkey {

	public Bizkey() {
	}

	// TODO: This needs to be removed after testing
	public Bizkey(long id, String key, String value, String store, int keyType, String release) {
		this.bizkeyId = id;
		this.bizkeyName = key;
		this.bizkeyValue = value;
		this.bizKeyStore = store;
		this.bizKeyType = keyType;
		this.bizKeyRelease = release;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	long bizkeyId;
	public long getBizkeyId() {
		return bizkeyId;
	}

	public void setBizkeyId(long bizkeyId) {
		this.bizkeyId = bizkeyId;
	}

	public String getBizkeyName() {
		return bizkeyName;
	}

	public void setBizkeyName(String bizkeyName) {
		this.bizkeyName = bizkeyName;
	}

	public String getBizkeyValue() {
		return bizkeyValue;
	}

	public void setBizkeyValue(String bizkeyValue) {
		this.bizkeyValue = bizkeyValue;
	}

	public String getBizKeyStore() {
		return bizKeyStore;
	}

	public void setBizKeyStore(String bizKeyStore) {
		this.bizKeyStore = bizKeyStore;
	}

	public String getBizKeyGroup() {
		return bizKeyGroup;
	}

	public void setBizKeyGroup(String bizKeyGroup) {
		this.bizKeyGroup = bizKeyGroup;
	}

	public String getBizkeyInformation() {
		return bizkeyInformation;
	}

	public void setBizkeyInformation(String bizkeyInformation) {
		this.bizkeyInformation = bizkeyInformation;
	}

	public int getBizKeyType() {
		return bizKeyType;
	}

	public void setBizKeyType(int bizKeyType) {
		this.bizKeyType = bizKeyType;
	}

	public String getBizKeyRelease() {
		return bizKeyRelease;
	}

	public void setBizKeyRelease(String bizKeyRelease) {
		this.bizKeyRelease = bizKeyRelease;
	}

	public String getBizKeyOwner() {
		return bizKeyOwner;
	}

	public void setBizKeyOwner(String bizKeyOwner) {
		this.bizKeyOwner = bizKeyOwner;
	}

	public String getBizKeyTeam() {
		return bizKeyTeam;
	}

	public void setBizKeyTeam(String bizKeyTeam) {
		this.bizKeyTeam = bizKeyTeam;
	}

	public Date getBizKeyCreatedDate() {
		return bizKeyCreatedDate;
	}

	public void setBizKeyCreatedDate(Date bizKeyCreatedDate) {
		this.bizKeyCreatedDate = bizKeyCreatedDate;
	}

	public Date getBizKeyUpdatedDate() {
		return bizKeyUpdatedDate;
	}

	public void setBizKeyUpdatedDate(Date bizKeyUpdatedDate) {
		this.bizKeyUpdatedDate = bizKeyUpdatedDate;
	}

	public int getBizKeySynchedWithRepo() {
		return bizKeySynchedWithRepo;
	}

	public void setBizKeySynchedWithRepo(int bizKeySynchedWithRepo) {
		this.bizKeySynchedWithRepo = bizKeySynchedWithRepo;
	}

	String bizkeyName;
	String bizkeyValue;
	/*
	 * Describe which type of store we are Adding/Updating/Deleting value mns
	 * cftouk cftoie
	 */
	String bizKeyStore;
	String bizKeyGroup;
	String bizkeyInformation;
	/*
	 * Describe the type of key 1 updated 0 created
	 */
	int bizKeyType;
	String bizKeyRelease;
	String bizKeyOwner;
	String bizKeyTeam;

	Date bizKeyCreatedDate;
	Date bizKeyUpdatedDate;
	int bizKeySynchedWithRepo;

}
