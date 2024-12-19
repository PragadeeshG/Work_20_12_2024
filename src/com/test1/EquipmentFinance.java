package com.test1;

public class EquipmentFinance {
	private long id;
	private String machineryType;
	private String remarks;
	private String otherAssetType;
	private String operationalNeeds;
	private String capitalExpenditureNeeds;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public EquipmentFinance() {

	}

	public EquipmentFinance(long id, String machineryType, String remarks, String otherAssetType,
			String operationalNeeds, String capitalExpenditureNeeds, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.id = id;
		this.machineryType = machineryType;
		this.remarks = remarks;
		this.otherAssetType = otherAssetType;
		this.operationalNeeds = operationalNeeds;
		this.capitalExpenditureNeeds = capitalExpenditureNeeds;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMachineryType() {
		return machineryType;
	}

	public void setMachineryType(String machineryType) {
		this.machineryType = machineryType;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getOtherAssetType() {
		return otherAssetType;
	}

	public void setOtherAssetType(String otherAssetType) {
		this.otherAssetType = otherAssetType;
	}

	public String getOperationalNeeds() {
		return operationalNeeds;
	}

	public void setOperationalNeeds(String operationalNeeds) {
		this.operationalNeeds = operationalNeeds;
	}

	public String getCapitalExpenditureNeeds() {
		return capitalExpenditureNeeds;
	}

	public void setCapitalExpenditureNeeds(String capitalExpenditureNeeds) {
		this.capitalExpenditureNeeds = capitalExpenditureNeeds;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
