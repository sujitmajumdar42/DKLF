package com.dkl.merchantdb.dao.intf;

import java.util.List;

import com.dkl.merchantdb.to.CityGroupTO;

public interface IcityGroupDAO {

	 void create(CityGroupTO cityGroupTO);
	 CityGroupTO read(String id);
	 List<CityGroupTO> readAll();
	 void update(CityGroupTO cityGroupTO);
	 void delete(String cityGroupID);
}
