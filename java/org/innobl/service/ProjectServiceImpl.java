package org.innobl.service;

import java.util.List;

import org.innobl.domain.Criteria;
import org.innobl.domain.ProjectVO;
import org.innobl.mapper.ProjectMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class ProjectServiceImpl implements ProjectService{

	private ProjectMapper mapper;

	@Override
	public List<ProjectVO> getPrjList(Criteria cri) {
		return mapper.getPrjList(cri);
	}

	@Override
	public ProjectVO getPrjDetail(int prjno) {
		return mapper.getPrjDetail(prjno);
	}

	@Override
	public void modifyProject(int prjno) {
		mapper.modifyProject(prjno);
	}

	@Override
	public void deleteProject(int prjno) {
		mapper.deleteProject(prjno);
	}

}
