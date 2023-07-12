package org.innobl.service;

import java.util.List;

import org.innobl.domain.DCodeVO;
import org.innobl.mapper.DCodeMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DCodeServiceImpl implements DCodeService{

	private DCodeMapper mapper;
	@Override
	public List<DCodeVO> getMarriageDCode() {
		return mapper.getMarriageDCode();
	}
	
	@Override
	public List<DCodeVO> getProjectStatusDcode() {
		return mapper.getProjectStatusDcode();
	}

}
