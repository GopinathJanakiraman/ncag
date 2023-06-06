package in.ncag.member.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ncag.member.dto.MemberDTO;
import in.ncag.member.model.MemberModel;
import in.ncag.member.repository.MemberRepository;
import in.ncag.member.service.MemberService;



@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberRepository repository;

	@Override
	public MemberModel create(MemberModel memberModel) {
		return repository.save(memberModel);
	}

	@Override
	public MemberModel delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberModel findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberModel update(MemberModel memberModel) {
		// TODO Auto-generated method stub
		return null;
	}

}
