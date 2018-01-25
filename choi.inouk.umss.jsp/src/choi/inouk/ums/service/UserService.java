package choi.inouk.ums.service;

import java.util.List;

import choi.inouk.ums.domain.User;

public interface UserService {
	List<User>listUsers(); //사용자 목록
	User findUser(int userNo); //사용자 한명
	boolean join(String userName); //사용자 등록
	boolean correct(User user); //사용자 수정
	boolean secede(int userNo); //사용자 탈퇴
}
