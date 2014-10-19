package com.dkl.merchantdb.to;

public class JsonTemplateTO {

	private int draw;
	private int recordsTotal;
	private int recordsFiltered;
	private MerchantBaseTO[] data;
	
	public int getDraw() {
		return draw;
	}
	public void setDraw(int draw) {
		this.draw = draw;
	}
	public int getRecordsTotal() {
		return recordsTotal;
	}
	public void setRecordsTotal(int recordsTotal) {
		this.recordsTotal = recordsTotal;
	}
	public int getRecordsFiltered() {
		return recordsFiltered;
	}
	public void setRecordsFiltered(int recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}
	public MerchantBaseTO[] getData() {
		return data;
	}
	public void setData(MerchantBaseTO[] data) {
		this.data = data;
	}
}
