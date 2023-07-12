package org.innobl.controller;

import java.util.List;

import org.innobl.domain.Criteria;
import org.innobl.domain.DCodeVO;
import org.innobl.domain.PageDTO;
import org.innobl.domain.ProjectVO;
import org.innobl.service.DCodeService;
import org.innobl.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	private ProjectService service;
	
	@Autowired
	private DCodeService dservice;
	
	@RequestMapping("/project_list")
	public String getProjectList(Criteria cri, Model model) {
		
		List<DCodeVO> decode = dservice.getProjectStatusDcode();

		model.addAttribute("decode", decode);	
		model.addAttribute("list", service.getPrjList(cri));
		model.addAttribute("pageMaekr", new PageDTO(cri,123));
		return "/project/project_list";
	}
	
	@RequestMapping("/enroll_project")
	public String showEnrollPage(Model model) {
		
		return "/project/enroll_project";
	}
	
	@PostMapping("/eroll_vendor")
	public String enrollProject(@ModelAttribute ProjectVO prj) {
		
		return "redirect:/project/project_list";
	}
	
	@GetMapping("/project_detail")
	public void getPrjByPrjNo() {
		
	}
}
