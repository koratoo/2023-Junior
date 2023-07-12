package org.innobl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.innobl.domain.Criteria;
import org.innobl.domain.MemberVO;
import org.innobl.domain.VendorVO;

public interface VendorMapper {

	public List<VendorVO> getListWithPaging(Criteria cri);
	
	public void enrollVendor(VendorVO vendor);

	@Select("select * from vendor where vno = #{vno}")
	public VendorVO getVendorByVno(int vno);

	
}
