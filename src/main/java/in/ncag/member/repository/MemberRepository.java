package in.ncag.member.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import in.ncag.member.model.MemberModel;


public interface MemberRepository extends JpaRepository<MemberModel, Integer> {
	
}
