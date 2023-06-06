package in.ncag.member.service;


import java.util.List;

import in.ncag.member.dto.MemberDTO;
import in.ncag.member.model.MemberModel;



public interface MemberService {
	MemberModel create(MemberModel user);
	MemberModel delete(int id);
	List<MemberDTO> findAll();
	MemberModel findById(int id);
	MemberModel update(MemberModel user);
}

