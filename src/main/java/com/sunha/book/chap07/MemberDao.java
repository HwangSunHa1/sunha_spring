package com.sunha.book.chap07;

import java.util.List; 
 
 
import com.sunha.book.chap03.Member; 

 
 /** 
 * p.184 [����Ʈ 8.2] MemberDao �� interface�� ����<br> 
 * ȸ�� ���̺��� �����ϴ� Data Access Object 
 *  
 * @author Jacob 
  */ 
 public interface MemberDao { 
 
 
 	/** 
 	 * �̸��Ϸ� ȸ�� ���� ������ 
 	 */ 
 	Member selectByEmail(String email); 
 

 	/** 
 	 * ȸ������ ���� 
 	 */ 
 	void insert(Member member); 
 
 
 	/** 
 	 * ȸ������ ���� 
 	 */ 
 	void update(Member member); 

 
 	/** 
 	 * ȸ�� ��� 
 	 */ 
	List<Member> selectAll(int offset, int count);
 }