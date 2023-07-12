package org.innobl.service;

import java.util.Date;
import java.util.List;

import org.innobl.domain.Criteria;
import org.innobl.domain.MemberVO;

public interface MemberService {

	public void enroll(MemberVO member);
	
	public void modify(MemberVO member);
	
	public void remove(int mno);
	
	public List<MemberVO> getMemberList(Criteria cri);

	public MemberVO getMemberByMno(int mno);
	
	public List<MemberVO> searchWithTypes(String skillLevel, String gender, String name, int pageNum, int amount,String joinDate,String exitDate);

}
