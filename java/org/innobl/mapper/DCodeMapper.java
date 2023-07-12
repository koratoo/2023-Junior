package org.innobl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.innobl.domain.DCodeVO;

public interface DCodeMapper {

	@Select("SELECT DTLCODE,DTLCODENM FROM DCODEDTL WHERE DCODE = 'M001'")
    public List<DCodeVO> getMarriageDCode(); 
	
	@Select("SELECT DTLCODE,DTLCODENM FROM DCODEDTL WHERE DCODE = 'P001'")
	public List<DCodeVO> getProjectStatusDcode();
}
