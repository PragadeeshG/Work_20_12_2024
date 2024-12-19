package com.test1;

public class EquipmentFinanceSteps {
	private long stepId;
	private long financeCode;
	private String processSteps;
	private String bnplScheme;
	private String remarks;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public EquipmentFinanceSteps() {

	}

	public EquipmentFinanceSteps(long stepId, long financeCode, String processSteps, String bnplScheme, String remarks,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.stepId = stepId;
		this.financeCode = financeCode;
		this.processSteps = processSteps;
		this.bnplScheme = bnplScheme;
		this.remarks = remarks;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getStepId() {
		return stepId;
	}

	public void setStepId(long stepId) {
		this.stepId = stepId;
	}

	public long getFinanceCode() {
		return financeCode;
	}

	public void setFinanceCode(long financeCode) {
		this.financeCode = financeCode;
	}

	public String getProcessSteps() {
		return processSteps;
	}

	public void setProcessSteps(String processSteps) {
		this.processSteps = processSteps;
	}

	public String getBnplScheme() {
		return bnplScheme;
	}

	public void setBnplScheme(String bnplScheme) {
		this.bnplScheme = bnplScheme;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
