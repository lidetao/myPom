package com.ldt.member;

import com.ldt.member.entity.Member;
import com.ldt.member.impl.MemberManageImpl;

public class Test {

	public void test() {

		IMemberManage memberManage = new MemberManageImpl();

		// 添加会员
		Member member = new Member();
		member.setAge(24);
		System.out.println("addMember" + memberManage.addMember(member));
		
		//获取会员
		System.out.println(memberManage.getMember(null));

	}

}
