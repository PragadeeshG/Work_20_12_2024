package com.test1;

public class EquipmentFinancingManagement {
	private long equipmentFinancingCode;
	private String screenName;
	private long screenId;
	private long refernceCode;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public EquipmentFinancingManagement() {

	}

	public EquipmentFinancingManagement(long equipmentFinancingCode, String screenName, long screenId,
			long refernceCode, String creationDate, String modifiedDate, String entityState) {
		super();
		this.equipmentFinancingCode = equipmentFinancingCode;
		this.screenName = screenName;
		this.screenId = screenId;
		this.refernceCode = refernceCode;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getEquipmentFinancingCode() {
		return equipmentFinancingCode;
	}

	public void setEquipmentFinancingCode(long equipmentFinancingCode) {
		this.equipmentFinancingCode = equipmentFinancingCode;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public long getScreenId() {
		return screenId;
	}

	public void setScreenId(long screenId) {
		this.screenId = screenId;
	}

	public long getRefernceCode() {
		return refernceCode;
	}

	public void setRefernceCode(long refernceCode) {
		this.refernceCode = refernceCode;
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
