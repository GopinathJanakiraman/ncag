package in.ncag.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ncag.member.dto.MemberDTO;
import in.ncag.member.model.MemberModel;
import in.ncag.member.service.MemberService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController

@RequestMapping({"/members"})
public class MemberController {
	@Autowired
	private MemberService MemberService;
	
	@PostMapping
	public MemberModel create(@RequestBody MemberModel memberModel) {
		return MemberService.create(memberModel);
	}
	
	@GetMapping(path = {"/{id}"})
	public MemberModel findOne(@PathVariable("id") int id) {
		return MemberService.findById(id);
	}
	@PutMapping(path = {"/{id}"})
	public MemberModel update(@PathVariable("id") int id, @RequestBody MemberModel memberModel) {
		memberModel.setId(id);
		return MemberService.update(memberModel);
	}
	@DeleteMapping(path = {"/{id}"})
	public MemberModel delete(@PathVariable("id") int id) {
		return MemberService.delete(id);
	}
	@GetMapping
	public List<MemberDTO> findAll(){
		return MemberService.findAll();
	}
}
