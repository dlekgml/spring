package com.example.mavenTest.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.mavenTest.DTO.memberDTO;

@Repository
public class MemberDAO {
	private final JdbcTemplate jdbcTemplate; 
	
	@Autowired
	public MemberDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	public void update(String email, String pw, String name, String tel, String rpw) {
		
		String sql="update member set name=?, tel=?, pw=? where email=? and pw=?";
		
		jdbcTemplate.update(sql, name, tel, rpw, email, pw);
	}
	
	// 로그인 - 이메일 비번 확인
	public String findMemberByemailpw(String email, String pw) {
		String sql = "select name from member where email=? and pw=?";
		try {
		return jdbcTemplate.queryForObject(sql, String.class , email, pw); // dbeaver 테이블에 값이 하나만 있어야 한다. 중복되는 값 있으면 오류
	}catch(Exception e) {
			return null;
		}
	}
	
	// 회원가입 데이터베이스에 저장
	public void insert(memberDTO memberdto) {
		String sql="insert into member(email, pw, name, tel)"
				+"values(?,?,?,?)";
		jdbcTemplate.update(sql, memberdto.getEmail(),
				memberdto.getPin(), memberdto.getName(),
				memberdto.getTel());
	}
}
