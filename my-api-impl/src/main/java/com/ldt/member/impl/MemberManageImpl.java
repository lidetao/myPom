package com.ldt.member.impl;

import com.ldt.member.IMemberManage;
import com.ldt.member.entity.Member;

public class MemberManageImpl implements IMemberManage {

	@Override
	public boolean addMember(Member member) {
		if (member == null) {
			return false;
		}
		return true;
	}

	@Override
	public Member getMember(String name) {
		if (name == null) {
			return null;
		}

		Member member = new Member();
		member.setName("李德涛博客");
		member.setAge(4);
		return member;
	}

}
