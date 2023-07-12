package org.innobl.mapper;

import java.util.List;

import org.innobl.domain.Criteria;
import org.innobl.domain.ProjectVO;

public interface ProjectMapper {

	public List<ProjectVO> getPrjList(Criteria cri);
	
	public ProjectVO getPrjDetail(int prjno);
	
	public void modifyProject(int prjno);
	
	public void deleteProject(int prjno);
}
