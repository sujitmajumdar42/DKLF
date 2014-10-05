package com.dkl.merchantdb.to;

import java.util.List;

public class CityGroupJSON {

	private int draw;
	private int recordsTotal;
	private int recordsFiltered;

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

	private List<CityGroupTO> data;

	public List<CityGroupTO> getData() {
		return data;
	}

	public void setData(List<CityGroupTO> data) {
		this.data = data;
	}

}
