package org.innobl.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.innobl.domain.Criteria;
import org.innobl.domain.MemberVO;

public interface MemberMapper {

	@Select("select mno,name,juminNo,gender,skillLevel,emplYear from member order by desc")
	public List<MemberVO> getList();
	
	//페이징 처리
	public List<MemberVO> getListWithPaging(Criteria cri);
	
	 List<MemberVO> searchWithTypes(@Param("skillLevel") String skillLevel,
             @Param("gender") String gender,
             @Param("name") String name,@Param("pageNum") int pageNum,@Param("amount")int amount,@Param("joinDate")String joinDate,@Param("exitDate")String exitDate);
	
	
	public void enrollMember(MemberVO member);

	
	@Select("select * from member where mno = #{mno}")
	public MemberVO getMemberByMno(int mno);
	
	@Select("select count(*) from member")
	public int totalCount();
	
	public void modifyMember(MemberVO member);

	@Delete("delete from member where mno = #{mno}")
	public void removeMemberByMno(int mno);
	
	
}
