package com.ldt.member;

import com.ldt.member.entity.Member;

public interface IMemberManage {

	public boolean addMember(Member member);

	public Member getMember(String name);

}
