package org.innobl.controller;

import java.io.File;
import java.util.Date;
import java.util.List;

import org.innobl.domain.Criteria;
import org.innobl.domain.DCodeVO;
import org.innobl.domain.MemberVO;
import org.innobl.domain.PageDTO;
import org.innobl.service.DCodeService;
import org.innobl.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberService service;
	
	@Autowired
	private DCodeService dservice;
	
	//전체 조회
	@GetMapping("/current_member")
	public String getCurrentMembers(Criteria cri, Model model) {
//		log.info("list : " + cri);
		model.addAttribute("list",service.getMemberList(cri));
		model.addAttribute("pageMaker",new PageDTO(cri,123));
		
		return "/member/current_member";
	}
	
	@PostMapping("/current_member")
	public void postCurrentMembers( 
								  @RequestParam(value = "skillLevel", required = false) String skillLevel,
	                              @RequestParam(value = "gender", required = false) String gender,
	                              @RequestParam(value = "name", required = false) String name,
	                              @RequestParam(value = "pageNum", required = false) int pageNum,
	                              @RequestParam(value = "amount", required = false) int amount,
	                              @RequestParam(value = "joinDate", required = false) String joinDate,
	                              @RequestParam(value = "exitDate", required = false) String exitDate,
	                              Model model,Criteria cri) {
//	    log.info("skillLevel : "+skillLevel);
//	    log.info("gender : "+gender);
//	    log.info("name : "+name);   
		log.info(joinDate);
	    
	    model.addAttribute("list", service.searchWithTypes(skillLevel,gender,name,pageNum,amount,joinDate,exitDate));
	    model.addAttribute("pageMaker", new PageDTO(cri, 123));
	}

	
	//등록 관련
	@GetMapping("/enroll_member")
	public String showEnrollPage(Model model) {
		List<DCodeVO> decode = dservice.getMarriageDCode();
		log.info(decode);
		model.addAttribute("decode", decode);
		return "/member/enroll_member";
	}
	
	@PostMapping("/enroll_member")
	public String enrollMemberWithImageFile(@ModelAttribute MemberVO member,Model model,MultipartFile[] uploadFile) {
		
		
		String uploadFolder = "C:\\Users\\-\\Desktop\\innoblife\\innobl\\src\\main\\webapp\\resources\\img";		
		for(MultipartFile multipartFile : uploadFile) {
		    String originalFileName = multipartFile.getOriginalFilename();
		    File saveFile = new File(uploadFolder, originalFileName);
		    try {
		        multipartFile.transferTo(saveFile);
		        String filePath = uploadFolder + "\\" + originalFileName;
		        member.setProfileImg(filePath); 
		    } catch (Exception e) {
		        log.error(e.getMessage());
		    }
		}
	    service.enroll(member);
	   
	    return "redirect:/member/enroll_success";
	}
//	@PostMapping("/enroll_member")
//	public String enrollMember(@ModelAttribute MemberVO member) {
//		service.enroll(member);
//		
//		return "redirect:/enroll_success";
//	}
	
	@GetMapping("/enroll_success")
	public String enrollMemberSuccess() {
		return "/member/enroll_success";
	}
	
	//단일 멤버조회
	@GetMapping("/member_detail")
    public String memberDetail(@RequestParam("mno") int mno, Model model) {
        MemberVO member = service.getMemberByMno(mno);
        model.addAttribute("member", member);
        return "/member/member_detail";
    }
	
	//수정하기
	@GetMapping("/modify_member")
	public String modfiyMember(@RequestParam("mno") int mno, Model model) {
		MemberVO member = service.getMemberByMno(mno);
        model.addAttribute("member", member);
		return "/member/modify_member";
	}
	
	@PostMapping("/modify_member")
	public String PostModfiyMember(@ModelAttribute MemberVO member) {
		log.info(member);
	    service.modify(member);
	    return "redirect:/";
	}
	
	@GetMapping("/remove_member")
	public String removeMemberByMno(@RequestParam("mno") int mno) {
		
		service.remove(mno);
		return "redirect:/";
	}
}
